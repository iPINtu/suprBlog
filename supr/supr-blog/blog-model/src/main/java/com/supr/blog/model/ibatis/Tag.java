package com.supr.blog.model.ibatis;


public class Tag implements java.io.Serializable {

	private Long id;
	private String tagName;

	public Tag() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
}