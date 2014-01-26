package com.supr.blog.dao.hibernate.impl;

import org.springframework.stereotype.Repository;

import com.supr.blog.dao.hibernate.AdminDao;
import com.supr.blog.model.hibernate.Admin;

/*@Repository
public class AdminDaoImpl extends BaseDaoImpl<Admin, String> implements AdminDao {

	@Override
	public boolean isExistByUsername(String username) {
		String hql = "from Admin admin where lower(admin.username) = lower(?)";
		Admin admin = (Admin) findUnique(hql, username);
		if (null != admin) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Admin getAdminByUsername(String username) {
		String hql = "from Admin admin where lower(admin.username) = lower(?)";
		Admin admin = (Admin) findUnique(hql, username);
		return admin;
	}
	
	@Override
	public Admin getAdminByUsernamePassword(String username, String password) {
		String hql = "from Admin admin where admin.username = ? and admin.password = ?";
		Admin admin = (Admin)findUnique(hql, new Object[]{username,password});
		return admin;
	}

}*/
