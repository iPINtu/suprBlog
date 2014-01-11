package com.supr.blog.ibatis.model;


public class Function implements java.io.Serializable {

	private Long id;
	private Function function;
	private String functionName;
	private String functionUrl;
	private Boolean isNode;
	private Long parentId;
	private Integer order;

	public Function() {
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

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getFunctionUrl() {
		return functionUrl;
	}

	public void setFunctionUrl(String functionUrl) {
		this.functionUrl = functionUrl;
	}

	public Boolean getIsNode() {
		return isNode;
	}

	public void setIsNode(Boolean isNode) {
		this.isNode = isNode;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}
}