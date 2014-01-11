package com.supr.blog.util.shiro;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

/**
 * @功能：认证过滤器
 * @作者：ljt
 * @时间：2014-1-11 下午3:49:53
 */
public class AuthenticationFilter extends FormAuthenticationFilter {
	
	@Override
	protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) {
		// TODO Auto-generated method stub
		return super.createToken(request, response);
	}
	
	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return super.onAccessDenied(request, response);
	}
	
	@Override
	protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request, ServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return super.onLoginSuccess(token, subject, request, response);
	}
	
	@Override
	protected boolean onLoginFailure(AuthenticationToken token, AuthenticationException e, ServletRequest request, ServletResponse response) {
		// TODO Auto-generated method stub
		return super.onLoginFailure(token, e, request, response);
	}
	
}
