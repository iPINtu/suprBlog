package com.supr.blog.dao.mongodb;

import com.supr.blog.model.Admin;

public interface AdminDao {
	
	/**
	 * 用户名是否存在
	 */
	boolean isExistByUsername(String username);
	
	/**
	 * 根据用户名获取管理员对象
	 */
	Admin getAdminByUsername(String username);
	
	/**
	 * 校验用户账号密码
	 */
	Admin getAdminByUsernamePassword(String username,String password);
	
}
