package com.supr.blog.service.mybatis.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supr.blog.dao.mybatis.AdminMapper;
import com.supr.blog.model.ibatis.Admin;
import com.supr.blog.service.mybatis.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminMapper adminMapper;
	
	public Admin isExistAdmin(Admin admin) {
		admin = adminMapper.isExistAdmin(admin);
		return admin;
	}

}
