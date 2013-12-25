package com.supr.blog.util.cache.memcache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.spy.memcached.MemcachedClient;

import com.supr.blog.util.cache.Cache;

@Component("memcache")
public class MemcacheImpl implements Cache {

	@Autowired
	private MemcachedClient memcacheClient;
	
	@Override
	public void add(String key, Object value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(String region, String key, Object value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String key) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String region, String key) {
		// TODO Auto-generated method stub

	}

	@Override
	public Boolean update(String key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean update(String region, String key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object get(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object get(String region, String key) {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public void flushModulCache(String modulKey) {
		// TODO Auto-generated method stub

	}

	@Override
	public void flushUserCache(String userKey) {
		// TODO Auto-generated method stub

	}

	@Override
	public void flushUserModulCache(String userKey, String modulKey) {
		// TODO Auto-generated method stub

	}

	@Override
	public Long incrementAndGet(String region, Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long incrementAndGet(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

}
