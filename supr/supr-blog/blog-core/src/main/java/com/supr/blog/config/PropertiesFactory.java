package com.supr.blog.config;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;

/**
 * @功能：properties配置文件读取
 * @作者：ljt
 * @时间：2014-1-11 下午3:06:09
 */
public class PropertiesFactory {
	
	private static final Logger logger = Logger.getLogger(PropertiesFactory.class);
	
	private static Set<PropertiesConfiguration> propertiesSet = new HashSet<PropertiesConfiguration>();
	
	private static PropertiesFactory propertiesFactory;
	
	private PropertiesFactory(){}
	
	public PropertiesFactory getInstance(){
		if(propertiesFactory == null){
			synchronized (PropertiesFactory.class) {
				propertiesFactory = new PropertiesFactory();
			}
		}
		return propertiesFactory;
	}
	
	public static void addConfiguration(String path){
		try {
			PropertiesConfiguration propertiesConfiguration = new PropertiesConfiguration(path);
			propertiesSet.add(propertiesConfiguration);
			CompositeFactory.addConfiguration(propertiesConfiguration);
		} catch (ConfigurationException e) {
			logger.error("PropertiesFactory addConfiguration fail,fileName is ["+path+"]",e);
		}
	}
	
	
	/**
	 * *****************************************************************************************
	 * 1、提供一些仅读取properties文件的方法
	 * 2、便利propertiesSet，依次读取
	 * *****************************************************************************************
	 */
	
}
