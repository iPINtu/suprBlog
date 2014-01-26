package com.supr.blog.service.mybatis.impl;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.supr.blog.service.mybatis.BaseService;

public class BaseServiceImpl implements BaseService {
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
}
