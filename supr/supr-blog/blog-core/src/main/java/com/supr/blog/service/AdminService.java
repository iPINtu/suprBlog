package com.supr.blog.service;

import com.supr.blog.model.hibernate.Admin;

public interface AdminService {
	
	/**
	 * 登入
	 */
	Admin login(String username,String password);
	
	/**
	 * 登出
	 */
	void loginOut();
	
}
