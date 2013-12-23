package com.supr.blog.util.exception;

/**
 * 异常类  --  逻辑层异常类
 * ============================================================================
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.suprblog.com
 * ----------------------------------------------------------------------------
 * ============================================================================
 */
public class ActionException extends Exception{
	
	private static final long serialVersionUID = 7618010527440302304L;

	public ActionException() {
		super();
	}
	
	public ActionException(String message,Throwable cause){
		super(message,cause);
	}
	
	public ActionException(String message){
		super(message);
	}
	
	public ActionException(Throwable cause){
		super(cause);
	}
	
}
