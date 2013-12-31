package com.supr.blog.dao.mongodb;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * 类-文档映射
 */
public class MongoMapper {
	
	/** 文档主键 **/
	private String id;
	
	/** 文档所属集合名称**/
	private String collectionName;
	
	/** 类名称 **/
	private String className;
	
	/** 类字段 **/
	private Map<String,Field> field = new HashMap<String,Field>(0);

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCollectionName() {
		return collectionName;
	}

	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Map<String, Field> getField() {
		return field;
	}

	public void setField(Map<String, Field> field) {
		this.field = field;
	}
}
