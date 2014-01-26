package com.supr.blog.service.mybatis.impl;

import java.awt.image.BufferedImage;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supr.blog.service.mybatis.CaptchaService;

@Service
public class CaptchaServiceImpl implements CaptchaService {

	@Autowired
	private com.octo.captcha.service.CaptchaService captchaService;

	public BufferedImage buildImage(String captchaId) {
		return (BufferedImage) captchaService.getChallengeForID(captchaId);
	}

	public boolean isValid(String captchaId, String captcha) {
		if (StringUtils.isNotEmpty(captchaId) && StringUtils.isNotEmpty(captcha)) {
			try {
				return captchaService.validateResponseForID(captchaId,captcha.toUpperCase());
			} catch (Exception e) {
				return false;
			}
		} else {
			return false;
		}
	}

}