package com.supr.blog.util.interceptor;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.NamedThreadLocal;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @功能：接口执行时间拦截器
 * @作者：ljt
 * @时间：2014-1-11 下午3:31:05
 */
public class TimeInterceptor implements HandlerInterceptor {
	
	private static final Logger logger = Logger.getLogger(TimeInterceptor.class);
	
	private NamedThreadLocal<Long> timeThreadLocal = new NamedThreadLocal<Long>("timeThreadLocal");
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		long startTime = System.currentTimeMillis();
		timeThreadLocal.set(startTime);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		long endTime = System.currentTimeMillis();
		long startTime = timeThreadLocal.get();
		logger.info((endTime - startTime)+"ms");
	}

}
