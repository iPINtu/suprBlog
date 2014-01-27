package com.supr.blog.controller.admin;

import org.apache.log4j.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.supr.blog.controller.BaseController;

/**
 * @功能：登陆
 * @作者：ljt
 * @时间：2014-1-27 下午3:00:05
 */
@Controller
public class LoginController extends BaseController{
	
	private static final Logger logger = Logger.getLogger(LoginController.class);
	
	@RequestMapping("/admin/login")
	public String login(){
		logger.info("login...");
		return "admin/common/main";
	}
	
	/**
	 * 跳转登陆页
	 */
	@RequestMapping(value="/admin/index",method=RequestMethod.GET)
	public String index(){
		return "admin/common/login";
	}
	
}
