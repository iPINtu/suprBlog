package com.supr.blog.util.shiro;

import org.apache.shiro.authc.UsernamePasswordToken;

public class SuprAuthToken extends UsernamePasswordToken {
	
	/** 验证码 **/
	private String captcha;
	
	/** 会话Id **/
	private String captchaId;
	
	public SuprAuthToken(String username, String password,String captcha,String captchaId,String host) {
		super(username, password,host);
		this.captcha = captcha;
		this.captchaId = captchaId;
	}
	
	public SuprAuthToken(String username, String password, boolean rememberMe,String captcha,String captchaId,String host) {
		super(username, password, rememberMe,host);
		this.captcha = captcha;
		this.captchaId = captchaId;
	}

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

	public String getCaptchaId() {
		return captchaId;
	}

	public void setCaptchaId(String captchaId) {
		this.captchaId = captchaId;
	}
}
