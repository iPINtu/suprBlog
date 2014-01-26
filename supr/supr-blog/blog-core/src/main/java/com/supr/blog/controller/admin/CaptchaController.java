package com.supr.blog.controller.admin;

import org.apache.log4j.Logger;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.supr.blog.controller.BaseController;
import com.supr.blog.service.mybatis.CaptchaService;

/**
 * @功能：验证码生成
 * @作者：ljt
 * @时间：2014-1-26 下午8:24:54
 */
@Controller
public class CaptchaController extends BaseController{
	
	private static final Logger logger = Logger.getLogger(CaptchaController.class);
	
	@Autowired
	private CaptchaService captchaService;
	
	/**
	 * 验证码
	 */
	@RequestMapping("/captcha")
	public void generatorCaptcha(HttpServletRequest request,HttpServletResponse response){
		String captchaId = request.getSession().getId();
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setHeader("Cache-Control", "no-store");
		response.setDateHeader("Expires", 0);
		response.setContentType("image/jpeg");
		
		ServletOutputStream os = null;
		
		try {
			os = response.getOutputStream();
			BufferedImage bufferedImage = captchaService.buildImage(captchaId);
			ImageIO.write(bufferedImage, "jpg", os);
			os.flush();
		} catch (Exception e) {
			logger.error("验证码生成异常...",e);
		} finally{
			IOUtils.closeQuietly(os);
		}
	}
	
}
