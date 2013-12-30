package com.supr.blog.util.exception;

/**
 * 异常类  --  数据访问层异常类
 * ============================================================================
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.suprblog.com
 * ----------------------------------------------------------------------------
 * ============================================================================
 */
public class DaoException extends RuntimeException{
	
	private static final long serialVersionUID = 5311042280097273349L;

	public DaoException() {
		super();
	}
	
	public DaoException(String message,Throwable cause){
		super(message,cause);
	}
	
	public DaoException(String message){
		super(message);
	}
	
	public DaoException(Throwable cause){
		super(cause);
	}
	
}
