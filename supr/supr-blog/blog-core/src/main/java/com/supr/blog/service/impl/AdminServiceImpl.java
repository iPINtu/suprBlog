package com.supr.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supr.blog.dao.AdminDao;
import com.supr.blog.model.Admin;
import com.supr.blog.service.AdminService;

@Service
public class AdminServiceImpl extends BaseServiceImpl<Admin, String> implements AdminService {

	@Autowired
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
