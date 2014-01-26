package com.supr.blog.model.vo;

import com.supr.blog.util.config.CompositeFactory;

/**
 * @功能：Json返回对象
 * @作者：ljt
 * @时间：2014-1-11 下午6:03:21
 */
public class JsonResult {
	
	private String result;
	
	private String message;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
		this.message = CompositeFactory.getInstance().getString(result);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
