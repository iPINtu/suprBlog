package com.supr.blog.util.cache;

import com.supr.blog.util.exception.CacheException;

/**
 * 缓存接口 - 缓存处理类提供接口
 * ============================================================================
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.suprblog.com
 * ----------------------------------------------------------------------------
 * ============================================================================
 */
public interface CacheProvider {
	
	public Cache buildCache(String regionName,boolean autoCreate) throws CacheException;
	
}