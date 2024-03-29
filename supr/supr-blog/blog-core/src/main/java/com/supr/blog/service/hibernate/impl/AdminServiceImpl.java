package com.supr.blog.service.hibernate.impl;

import com.supr.blog.dao.hibernate.AdminDao;
import com.supr.blog.model.hibernate.Admin;
import com.supr.blog.service.hibernate.AdminService;

public class AdminServiceImpl extends BaseServiceImpl<Admin, String> implements AdminService {

	private AdminDao adminDao;

	@Override
	public Admin login(String username, String password) {
		Admin admin = adminDao.getAdminByUsernamePassword(username, password);
		return admin;
	}

	@Override
	public void loginOut() {

	}

}
