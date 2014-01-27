package com.supr.blog.util.shiro;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;

/**
 * @功能：认证过滤器
 * @作者：ljt
 * @时间：2014-1-11 下午3:49:53
 */
public class AuthenticationFilter extends FormAuthenticationFilter {
	
	private static final Logger logger = Logger.getLogger(AuthenticationFilter.class);
	
	public static final String DEFAULT_CAPTCHA_PARAM = "captcha";
	
	private String captchaParam = DEFAULT_CAPTCHA_PARAM;
	
	/**
	 * 登陆方法必须是post类型才会进入这里
	 */
	@Override
	protected AuthenticationToken createToken(ServletRequest servletRequest, ServletResponse response) {
		logger.info("createToken...");
		String username = getUsername(servletRequest);
		String password = getPassword(servletRequest);
		String captcha = getCaptcha(servletRequest);
//		boolean rememberMe = isRememberMe(servletRequest);
		String host = getHost(servletRequest);
		HttpServletRequest request = (HttpServletRequest)servletRequest;
		String captchaId = request.getSession().getId();
		return new SuprAuthToken(username, password, captcha,captchaId,host);
	}
	
	protected String getCaptcha(ServletRequest request) {
        return WebUtils.getCleanParam(request, getCaptchaParam());
    }
	
	public String getCaptchaParam() {
		return captchaParam;
	}

	public void setCaptchaParam(String captchaParam) {
		this.captchaParam = captchaParam;
	}

	@Override
	protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
		logger.info("onAccessDenied...");
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		String requestType = request.getHeader("X-Requested-With");
		if (requestType != null && requestType.equalsIgnoreCase("XMLHttpRequest")) {
			response.addHeader("loginStatus", "accessDenied");
			response.sendError(HttpServletResponse.SC_FORBIDDEN);
			return false;
		}
		return super.onAccessDenied(request, response);
	}
	
	@Override
	protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request, ServletResponse response) throws Exception {

		logger.info("onLoginSuccess...");
		
		return super.onLoginSuccess(token, subject, request, response);
	}
	
}
