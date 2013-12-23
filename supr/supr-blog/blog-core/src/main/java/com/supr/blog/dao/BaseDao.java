package com.supr.blog.dao;

import java.io.Serializable;

public interface BaseDao<T,PK extends Serializable> {
	
	PK add(T t);
	
	void delete(T t);
	
	void update(T t);
	
	T get(PK id);
	
}
