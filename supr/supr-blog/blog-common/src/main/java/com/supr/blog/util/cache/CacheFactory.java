package com.supr.blog.util.cache;

import org.springframework.stereotype.Component;

/**
 * 缓存类 - 缓存工厂
 * ============================================================================
 * 负责返回缓存操作实例
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.suprblog.com
 * ----------------------------------------------------------------------------
 * ============================================================================
 */
@Component
public class CacheFactory {
	
	/** 单例缓存工厂 **/
	private static CacheFactory cacheFactory ;
	
	/** 缓存接口 **/
	private CacheI cache;
	
	private CacheFactory(){
		// 缓存实现类型   配置文件读取
		String cacheType = "redis";
		if(null == cacheType || "".equals(cacheType.trim()) ){
			// 默认用memcache
			cache = SpringUtil.getBean(CacheType.memcache.toString());
		}else{
			// 缓存实现单例即可
			cache = SpringUtil.getBean(cacheType);
		}
		
		if(cache == null){
			throw new NullPointerException("缓存类型没配置[memcache,ehcache,redis]...");
		}
	}
	
	/**
	 * 单例方法
	 * @return
	 */
	public static CacheFactory getInstances(){
		if(cacheFactory == null){
			synchronized (CacheFactory.class) {
				cacheFactory = new CacheFactory();
			}
		}
		return cacheFactory;
	}

	public CacheI getCache() {
		return cache;
	}

	public void setCache(CacheI cache) {
		this.cache = cache;
	}
}
