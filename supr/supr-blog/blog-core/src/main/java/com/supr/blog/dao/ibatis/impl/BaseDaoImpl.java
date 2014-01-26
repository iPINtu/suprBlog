package com.supr.blog.dao.ibatis.impl;

import java.io.Serializable;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.supr.blog.dao.ibatis.BaseDao;

public class BaseDaoImpl<T,PK extends Serializable> implements BaseDao {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public PK add(T t) {
		return null;
	};

	public void delete(T t) {
		
	};

	public T get(PK id) {
		
		return null;
	};

	public void update(T t) {
		
	};
 
}
