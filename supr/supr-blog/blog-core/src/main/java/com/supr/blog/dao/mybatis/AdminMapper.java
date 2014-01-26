package com.supr.blog.dao.mybatis;

import java.util.HashMap;

import com.supr.blog.model.ibatis.Admin;

public interface AdminMapper {
	
	Admin isExistAdmin(HashMap<String, Object> map);
	
	void deleteAdmin(String userId);
	
	void addAdmin(Admin admin);
}
