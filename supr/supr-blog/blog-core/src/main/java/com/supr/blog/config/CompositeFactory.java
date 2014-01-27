package com.supr.blog.config;

import org.apache.commons.configuration.CompositeConfiguration;
import org.apache.commons.configuration.Configuration;

/**
 * @功能：复合查询
 * @作者：ljt
 * @时间：2014-1-11 下午2:43:24
 */
public class CompositeFactory {
	
	private static CompositeConfiguration configuration;
	
	private CompositeFactory(){}
	
	public static CompositeConfiguration getInstance(){
		if(configuration == null){
			synchronized (CompositeFactory.class) {
				configuration = new CompositeConfiguration();
			}
		}
		return configuration;
	}
	
	public static void addConfiguration(Configuration config){
		configuration = getInstance();
		configuration.addConfiguration(config);
	}
}
