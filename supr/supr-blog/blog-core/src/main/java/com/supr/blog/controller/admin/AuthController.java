package com.supr.blog.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.supr.blog.vo.JsonResult;

@Controller
@RequestMapping("/auth")
public class AuthController{
	
	@RequestMapping("/list")
	public ModelAndView list(){
		
		return null;
	}
	
	@RequestMapping("/add")
	public JsonResult add(){
	
		return null;
	}
	
	@RequestMapping("/delete/{authId}")
	public JsonResult delete(){
		
		return null;
	}
	
	@RequestMapping("/update")
	public JsonResult update(){
		
		return null;
	}
	
}
