package com.supr.blog.util.cache;

import com.supr.blog.util.exception.CacheException;

/**
 * 缓存接口 - 缓存基接口 
 * ============================================================================
 * 抽象缓存组件基本的几个操作（增加、删除、更新、查询、清空）
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.suprblog.com
 * ----------------------------------------------------------------------------
 * ============================================================================
 */
public interface Cache {
	
	/**
	 * 新增缓存
	 * @param key
	 * @param value
	 * @throws CacheException
	 */
	void add(String key,Object value) throws CacheException;
	
	/**
	 * 删除缓存
	 * @param key
	 * @throws CacheException
	 */
	void delete(String key) throws CacheException;
	
	/**
	 * 更新缓存
	 * @param key
	 * @param value
	 * @throws CacheException
	 */
	void update(String key,Object value) throws CacheException;
	
	/**
	 * 根据key查找缓存
	 * @param key
	 * @return
	 * @throws CacheException
	 */
	Object get(String key) throws CacheException;
	
	/**
	 * 清空系统缓存
	 * @throws CacheException
	 */
	void flushAll() throws CacheException;
	
	/**
	 * 清空模块级别缓存
	 * @param modulAll
	 * @throws CacheException
	 */
	void flushModulAll(String modulAll) throws CacheException;
	
	/**
	 * 清空用户级别缓存
	 * @param userKey
	 * @throws CacheException
	 */
	void flushUserAll(String userKey) throws CacheException;
	
	/**
	 * 清空用户指定模块级别缓存
	 * @throws CacheException
	 */
	void flushUserModulAll(String userKey,Object modulKey) throws CacheException;
	
}
