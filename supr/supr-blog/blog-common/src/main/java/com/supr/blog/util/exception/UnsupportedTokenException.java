package com.supr.blog.util.exception;

public class UnsupportedTokenException extends RuntimeException{
	
	public UnsupportedTokenException() {
		super();
	}
	
	public UnsupportedTokenException(String message,Throwable cause){
		super(message,cause);
	}
	
	public UnsupportedTokenException(String message){
		super(message);
	}
	
	public UnsupportedTokenException(Throwable cause){
		super(cause);
	}
	
}
