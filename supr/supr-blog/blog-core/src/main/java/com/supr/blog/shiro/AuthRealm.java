package com.supr.blog.shiro;

import org.apache.log4j.Logger;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.pam.UnsupportedTokenException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.supr.blog.model.ibatis.Admin;
import com.supr.blog.service.mybatis.AdminService;
import com.supr.blog.service.mybatis.CaptchaService;

public class AuthRealm extends AuthorizingRealm{
	
	private static final Logger logger = Logger.getLogger(AuthRealm.class);
	
	@Autowired
	private CaptchaService captchaService;
	
	@Autowired
	private AdminService adminService;
	
	/**
	 * 获取认证信息	账号、密码、验证码
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		logger.info("doGetAuthenticationInfo...");
		SuprAuthToken suprToken = (SuprAuthToken)token;
		String username = suprToken.getUsername();
		String password = new String(suprToken.getPassword());
		String captcha = suprToken.getCaptcha();
		String captchaId = suprToken.getCaptchaId();
		if (!captchaService.isValid(captchaId,captcha)) {
			throw new UnsupportedTokenException();
		}
		
		if(null != username && null != password){
			Admin admin = new Admin(username,password);
			admin = adminService.isExistAdmin(admin);
			if(null == admin){
				throw new UnknownAccountException();
			}else{
				if(!admin.getIsEnable()){
					throw new DisabledAccountException();
				}
				return new SimpleAuthenticationInfo(new Principal(admin.getId(), username), password, getName());
			}
		}
		
		return null;
	}
	
	
	/**
	 * 获取授权信息	角色、权限
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		
		logger.info("doGetAuthorizationInfo...");
		
		return null;
	}
}
