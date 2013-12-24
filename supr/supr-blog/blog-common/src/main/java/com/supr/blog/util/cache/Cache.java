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
	void add(String key,Object value);
	
	/**
	 * 指定块新增缓存
	 * @param region
	 * @param key
	 * @param value
	 * @throws CacheException
	 */
	void add(String region,String key,Object value);
	
	/**
	 * 删除缓存
	 * @param key
	 * @throws CacheException
	 */
	void delete(String key);
	
	/**
	 * 指定块删除缓存
	 * @param key
	 * @throws CacheException
	 */
	void delete(String region,String key);
	
	/**
	 * 更新缓存
	 * @param key
	 * @param value
	 * @throws CacheException
	 */
	Boolean update(String key,Object value);
	
	/**
	 * 指定块更新缓存
	 * @param key
	 * @param value
	 * @throws CacheException
	 */
	Boolean update(String region,String key,Object value);
	
	/**
	 * 根据key查找缓存
	 * @param key
	 * @return
	 * @throws CacheException
	 */
	Object get(String key);
	
	/**
	 * 指定块根据key查找缓存
	 * @param key
	 * @return
	 * @throws CacheException
	 */
	Object get(String region,String key);
	
	/**
	 * 如果没有则增加 有则更新
	 * @param key
	 * @param value
	 * @return
	 */
	Boolean saveOrUpdate(String key, Object value);

	/**
	 * 指定块如果没有则增加 有则更新
	 * @param region
	 * @param key
	 * @param value
	 * @return
	 */
    Boolean saveOrUpdate(String region, String key, Object value);
	
	/**
	 * 清空系统缓存
	 */
	void flushAll();
	
	/**
	 * 清空块缓存
	 */
	void flushRegion();
	
	/**
	 * 缓存版本号递增
	 * @param region
	 * @param key
	 * @return
	 */
	public Long incrementAndGet(String region, Object key);

	/**
	 * 缓存版本号递增
	 * @param region
	 * @param key
	 * @return
	 */
    public Long incrementAndGet(Object key);
	
	/**
	 * 清空模块级别缓存
	 * @param modulAll
	 */
	void flushModulAll(String modulAll);
	
	/**
	 * 清空用户级别缓存
	 * @param userKey
	 */
	void flushUserAll(String userKey);
	
	/**
	 * 清空用户指定模块级别缓存
	 */
	void flushUserModulAll(String userKey,String modulKey);
	
}
