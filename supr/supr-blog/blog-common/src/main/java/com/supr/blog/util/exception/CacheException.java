package com.supr.blog.util.exception;

/**
 * 异常类  --  缓存层异常类
 * ============================================================================
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.suprblog.com
 * ----------------------------------------------------------------------------
 * ============================================================================
 */
public class CacheException extends RuntimeException{
	
	private static final long serialVersionUID = 2265456037054126529L;

	public CacheException() {
		super();
	}
	
	public CacheException(String message,Throwable cause){
		super(message,cause);
	}
	
	public CacheException(String message){
		super(message);
	}
	
	public CacheException(Throwable cause){
		super(cause);
	}
	
}
