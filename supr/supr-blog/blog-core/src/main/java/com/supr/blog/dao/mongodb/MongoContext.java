package com.supr.blog.dao.mongodb;

import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;

@Repository
public class MongoContext {
	
	private ConcurrentHashMap<Class<?>,MongoMapper> concurrentHashMap = new ConcurrentHashMap<Class<?>,MongoMapper>();
	
	public MongoMapper getMapper(Class<?> clazz){
		return concurrentHashMap.get(clazz);
	}
	
	public void setMapper(Class<?> clazz,MongoMapper mongoMapper){
		concurrentHashMap.put(clazz,mongoMapper);
	}
	
}
