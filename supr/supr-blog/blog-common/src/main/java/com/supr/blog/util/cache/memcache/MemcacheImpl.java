package com.supr.blog.util.cache.memcache;

import net.spy.memcached.MemcachedClient;
import net.spy.memcached.internal.OperationFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.supr.blog.util.cache.CacheI;
import com.supr.blog.util.exception.CacheException;


@Component("memcache")
public class MemcacheImpl implements CacheI {

	@Autowired
	private MemcachedClient memcacheClient;

	@Override
	public void add(String key, Object value) {
		try {
			memcacheClient.add(key, 1000, value);
		} catch (Exception e) {
			throw new CacheException("添加缓存失败...", e.getCause());
		}
	}

	@Override
	@Deprecated
	public void add(String region, String key, Object value) {
		add(key,value);
	}

	@Override
	public void delete(String key) {
		try {
			memcacheClient.delete(key);
		} catch (Exception e) {
			throw new CacheException("删除缓存失败...", e.getCause());
		}
	}

	@Override
	@Deprecated
	public void delete(String region, String key) {
		delete(key);
	}

	@Override
	public Boolean update(String key, Object value) {
		boolean result = false;
		try {
			OperationFuture<Boolean> future = memcacheClient.replace(key, 100, value);
			result = future.get();
		} catch (Exception e) {
			throw new CacheException("更新缓存失败...", e.getCause());
		}
		
		return result;
	}

	@Override
	@Deprecated
	public Boolean update(String region, String key, Object value) {
		return update(key,value);
	}

	@Override
	public Object get(String key) {
		Object result = null;
		try {
			result = memcacheClient.get(key);
		} catch (Exception e) {
			throw new CacheException("获取缓存失败...", e.getCause());
		}
		return result;
	}

	@Override
	@Deprecated
	public Object get(String region, String key) {
		return get(key);
	}

	@Override
	public Boolean saveOrUpdate(String key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean saveOrUpdate(String region, String key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flushAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public void flushRegion(String region) {
		// TODO Auto-generated method stub

	}

}
