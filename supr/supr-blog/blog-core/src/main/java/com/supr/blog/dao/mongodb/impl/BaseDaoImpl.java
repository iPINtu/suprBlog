package com.supr.blog.dao.mongodb.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.supr.blog.dao.mongodb.BaseDao;

public class BaseDaoImpl implements BaseDao {
		
	@Autowired
	public MongoTemplate mongoTemplate;
	
}
