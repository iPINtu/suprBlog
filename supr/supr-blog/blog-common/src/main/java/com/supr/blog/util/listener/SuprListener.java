package com.supr.blog.util.listener;

import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.supr.blog.util.config.CompositeFactory;
import com.supr.blog.util.config.PropertiesFactory;
import com.supr.blog.util.config.XmlFactory;

/**
 * @功能：监听器
 * @作者：ljt
 * @时间：2014-1-11 下午6:14:37
 */
public class SuprListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// 初始化配置文件
		initConfig();
		
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {

	}
	
	private void initConfig() {
		// 读取主配置文件
		XmlFactory.addConfiguration("config/sysConfig.xml");

		// 添加xml配置文件
		List<Object> xmlPath = CompositeFactory.getInstance().getList("xml.filepath");
		if (null != xmlPath && xmlPath.size() > 0) {
			for (Object path : xmlPath) {
				XmlFactory.addConfiguration(path.toString());
			}
		}

		// 添加properties配置文件
		List<Object> propertiesPath = CompositeFactory.getInstance().getList("properties.filepath");
		if (null != propertiesPath && propertiesPath.size() > 0) {
			for (Object path : propertiesPath) {
				PropertiesFactory.addConfiguration(path.toString());
			}
		}
	}
}
