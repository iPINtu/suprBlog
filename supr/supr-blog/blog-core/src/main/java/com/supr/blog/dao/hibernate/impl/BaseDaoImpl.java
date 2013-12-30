package com.supr.blog.dao.hibernate.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import com.supr.blog.dao.BaseDao;

public class BaseDaoImpl<T,PK extends Serializable> implements BaseDao<T, PK> {
	
	@Autowired
	protected SessionFactory sessionFactory;
	
	private Class<T> entityClass;
	
	public PK add(T t) {
		return (PK)getSession().save(t);
	}
	
	public void delete(T t) {
		getSession().delete(t);
	}
	
	public void update(T t) {
		getSession().update(t);
	}
	
	public T get(PK id) {
		return (T)getSession().get(entityClass, id);
	}
	
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	protected Query createQuery(String hql, Object... values) {
		Assert.hasText(hql);
		Query query = getSession().createQuery(hql);
		if (values != null) {
			for (int i = 0; i < values.length; i++) {
				query.setParameter(i, values[i]);
			}
		}
		return query;
	}
	
	protected List findList(String hql, Object... values) {
		return createQuery(hql, values).list();
	}

	protected Object findUnique(String hql, Object... values) {
		return createQuery(hql, values).uniqueResult();
	}
	
}
