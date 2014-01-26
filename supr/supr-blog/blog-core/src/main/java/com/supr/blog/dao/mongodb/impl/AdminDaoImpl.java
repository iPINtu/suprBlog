package com.supr.blog.dao.mongodb.impl;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.supr.blog.dao.mongodb.AdminDao;

/*@Repository
public class AdminDaoImpl extends BaseDaoImpl implements AdminDao {

	@Override
	public boolean isExistByUsername(String username) {
		Admin admin = getAdminByUsername(username);
		if (null != admin) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Admin getAdminByUsername(String username) {
		Query query = new Query();
		Criteria criteria = new Criteria();
		criteria.and("username").is(username);
		query.addCriteria(criteria);
		
		Admin admin = mongoTemplate.findOne(query, Admin.class);
		return admin;
	}
	
	@Override
	public Admin getAdminByUsernamePassword(String username, String password) {
		Query query = new Query();
		Criteria criteria = new Criteria();
		criteria.and("username").is(username).and("password").is(password);
		query.addCriteria(criteria);
		
		Admin admin = mongoTemplate.findOne(query, Admin.class);
		return admin;
	}

}*/
