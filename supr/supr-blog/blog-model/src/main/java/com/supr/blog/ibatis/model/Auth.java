package com.supr.blog.ibatis.model;


public class Auth implements java.io.Serializable {

	private Long id;
	private Function function;
	private String authName;
	private Boolean authType;
	private String authPath;

	public Auth() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Function getFunction() {
		return function;
	}

	public void setFunction(Function function) {
		this.function = function;
	}

	public String getAuthName() {
		return authName;
	}

	public void setAuthName(String authName) {
		this.authName = authName;
	}

	public Boolean getAuthType() {
		return authType;
	}

	public void setAuthType(Boolean authType) {
		this.authType = authType;
	}

	public String getAuthPath() {
		return authPath;
	}

	public void setAuthPath(String authPath) {
		this.authPath = authPath;
	}
}