package com.supr.blog.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.supr.blog.model.vo.JsonResult;

@Controller
@RequestMapping("/member")
public class MemberController{
	
	@RequestMapping("/list")
	public ModelAndView list(){
		
		return null;
	}
	
	@RequestMapping("/add")
	public JsonResult add(){
	
		return null;
	}
	
	@RequestMapping("/delete/{memberId}")
	public JsonResult delete(){
		
		return null;
	}
	
	@RequestMapping("/update")
	public JsonResult update(){
		
		return null;
	}
}
