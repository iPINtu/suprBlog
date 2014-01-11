package com.supr.blog.dao.mongodb.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.supr.blog.dao.mongodb.BaseDao;
import com.supr.blog.dao.mongodb.MongoContext;

public class BaseDaoImpl implements BaseDao {
		
	/** spring提供的mongo模板类 **/
	@Autowired
	public MongoTemplate mongoTemplate;
	
	/** mongo上下文环境 存放类-文档映射关系  **/
	@Autowired
	public MongoContext mongoContext;
	
}
