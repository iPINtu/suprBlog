package com.supr.blog.dao.mongodb;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.supr.blog.dao.mongodb.bean.User;
import com.supr.blog.dao.mongodb.impl.BaseDaoImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"spring/spring-mongodb.xml"})
public class MongoDaoTest extends BaseDaoImpl{
	
	public Map initData(){
		User user = new User();
		user.setAge(10);
		user.setName("admin");
		user.setSex("M");
		return null;
	}
	
	@Test
	public void testAdd(){
		DBCollection collection = mongoTemplate.createCollection(User.class);
		DBObject object = new BasicDBObject(initData());
		collection.insert(object);
	}
	
}
