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
	public void put(Object key,Object value) throws CacheException;
	
	/**
	 * 删除缓存
	 * @param key
	 * @throws CacheException
	 */
	public void remove(Object key) throws CacheException;
	
	/**
	 * 更新缓存
	 * @param key
	 * @param value
	 * @throws CacheException
	 */
	public void update(Object key,Object value) throws CacheException;
	
	/**
	 * 根据key查找缓存
	 * @param key
	 * @return
	 * @throws CacheException
	 */
	public Object get(Object key) throws CacheException;
	
	/**
	 * 清空所有缓存
	 * @throws CacheException
	 */
	public void clear() throws CacheException;
	
}
