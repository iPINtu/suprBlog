package com.supr.blog.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.supr.blog.controller.BaseController;

/**
 * @功能：登陆、登出
 * @作者：ljt
 * @时间：2014-1-11 下午5:59:03
 */
@Controller
@RequestMapping("/home")
public class HomeController extends BaseController{
	
	@RequestMapping("/login")
	public void login(){
		
	}
	
	@RequestMapping("/loginOut")
	public void loginOut(){
		
	}
	
}
