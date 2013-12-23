package com.supr.blog.util.exception;

/**
 * 异常类  --  异常基类
 * ============================================================================
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.suprblog.com
 * ----------------------------------------------------------------------------
 * ============================================================================
 */
public class BaseException extends Exception{
	
	private static final long serialVersionUID = -2571476266153913452L;

	public BaseException() {
		super();
	}
	
	public BaseException(String message,Throwable cause){
		super(message,cause);
	}
	
	public BaseException(String message){
		super(message);
	}
	
	public BaseException(Throwable cause){
		super(cause);
	}
	
}
