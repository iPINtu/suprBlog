package com.supr.blog.controller.admin;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class AdminController{

	private static final Logger logger = Logger.getLogger(AdminController.class);
	
	@RequestMapping("/list")
	public ModelAndView list(){
		
		return null;
	}
	
	@RequestMapping("/add")
	public JsonResult add(){
	
		return null;
	}
	
	@RequestMapping("/delete/{userId}")
	public JsonResult delete(){
		
		return null;
	}
	
	@RequestMapping("/update")
	public JsonResult update(){
		
		return null;
	}
	
	
}
