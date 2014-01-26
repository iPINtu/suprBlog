package com.supr.blog.dao.mybatis;

import com.supr.blog.model.ibatis.Admin;

public interface AdminMapper {
	
	Admin isExistAdmin(Admin admin);
	
	void deleteAdmin(String userId);
	
	void addAdmin(Admin admin);
}
