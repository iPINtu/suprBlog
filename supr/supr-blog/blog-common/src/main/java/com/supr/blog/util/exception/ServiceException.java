package com.supr.blog.util.exception;

/**
 * 异常类  --  业务层异常类
 * ============================================================================
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.suprblog.com
 * ----------------------------------------------------------------------------
 * ============================================================================
 */
public class ServiceException extends RuntimeException{
	
	private static final long serialVersionUID = 182946793976781810L;

	public ServiceException() {
		super();
	}
	
	public ServiceException(String message,Throwable cause){
		super(message,cause);
	}
	
	public ServiceException(String message){
		super(message);
	}
	
	public ServiceException(Throwable cause){
		super(cause);
	}
	
}
