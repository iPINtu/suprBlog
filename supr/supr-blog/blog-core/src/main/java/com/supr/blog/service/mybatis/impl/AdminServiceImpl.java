package com.supr.blog.service.mybatis.impl;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supr.blog.dao.mybatis.AdminMapper;
import com.supr.blog.model.ibatis.Admin;

@Service
public class AdminServiceImpl{
	
	@Autowired
	private AdminMapper adminMapper;
	
	public Admin isExistAdmin(Admin admin) {
		admin = adminMapper.isExistAdmin(admin);
		return admin;
	}

	public void loginOut() {

	}
	
}
