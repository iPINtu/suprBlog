package com.supr.blog.util.cache.ehcache;

import java.util.HashMap;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;
import net.sf.ehcache.config.Configuration;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.supr.blog.util.cache.CacheI;
import com.supr.blog.util.exception.CacheException;

@Component("ehcache")
public class EhcacheImpl implements CacheI,InitializingBean {
	
	private HashMap<String,Ehcache> cacheMap = new HashMap<String,Ehcache>();
	
	private CacheManager cacheManger;
	
	/** 默认块 **/
	private static final String DEFAULT_REGION = "DEFAULT_REGION";
	
	public void afterPropertiesSet() throws Exception {
		Configuration configuration = null;
		cacheManger = new CacheManager(configuration);
		
		Cache cache = cacheManger.getCache(DEFAULT_REGION);
		if(null != cache){
			cacheMap.put(DEFAULT_REGION, cache);
		}else{
			// 默认缓存分区
			cache = new Cache(DEFAULT_REGION,1000,true,true,3600,3600);
			cacheMap.put(DEFAULT_REGION, cache);
			cacheManger.addCache(cache);
		}
	} 
	
	public Ehcache getCache(String region){
		Assert.hasText(region,"resion must not null");
		Ehcache cache = cacheMap.get(region);
		if(null == cache){
			cache = new Cache(region,1000,true,true,3600,3600);
			cacheManger.addCache(cache);
			cacheMap.put(region, cache);
		}
		return cache;
	}
	
	@Override
	public void add(String key, Object value) {
		add(DEFAULT_REGION,key,value);
	}
	
	@Override
	public void add(String region, String key, Object value) {
		Ehcache cache = getCache(region);
		Element element = new Element(key, value);
		try {
			cache.put(element);
		} catch (Exception e){
			throw new CacheException("添加缓存失败...", e.getCause());
		}
	}

	@Override
	public void delete(String key) {
		delete(DEFAULT_REGION,key);
	}

	@Override
	public void delete(String region, String key) {
		Ehcache cache = getCache(region);
		try {
			cache.remove(key);
		} catch (Exception e) {
			throw new CacheException("删除缓存失败...", e.getCause());
		}
	}

	@Override
	public Boolean update(String key, Object value) {
		return update(DEFAULT_REGION,key,value);
	}

	@Override
	public Boolean update(String region, String key, Object value) {
		boolean result = false;
		Ehcache cache = getCache(region);
		Element element = new Element(key, value);
		Element oldElement = cache.get(key);
		if(null == oldElement){
			return result;
		}
		
		try {
			result = cache.replace(oldElement,element);
		} catch (Exception e) {
			throw new CacheException("更新缓存失败...", e.getCause());
		}
		return result;
	}

	@Override
	public Object get(String key) {
		return get(DEFAULT_REGION,key);
	}

	@Override
	public Object get(String region, String key) {
		Object result = null;
		Ehcache cache = getCache(region);
		try {
			result = cache.get(key);
		} catch (Exception e) {
			throw new CacheException("获取缓存失败...", e.getCause());
		}
		
		return result;
	}

	@Override
	public Boolean saveOrUpdate(String key, Object value) {
		return saveOrUpdate(DEFAULT_REGION, key,value);
	}

	@Override
	public Boolean saveOrUpdate(String region, String key, Object value) {
		boolean result = true;
		Ehcache cache = getCache(region);
		try {
			Object obj = cache.get(key);
			if(null == obj){
				add(region,key, value);
			}else{
				result = update(region,key, value);
			}
		} catch (Exception e) {
			throw new CacheException("保存或更新缓存失败...", e.getCause());
		}
		
		return result;
	}

	@Override
	public void flushAll() {
		try {
			cacheManger.clearAll();
		} catch (Exception e) {
			throw new CacheException("刷新缓存失败...", e.getCause());
		}
	}

	@Override
	public void flushRegion(String region) {
		try {
			Ehcache cache = cacheManger.getEhcache(region);
			if(null != cache){
				cache.flush();
				cacheMap.remove(region);
			}
		} catch (Exception e) {
			throw new CacheException("刷新Region缓存失败...", e.getCause());
		}
	}

}
