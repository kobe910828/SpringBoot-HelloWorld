package com.example.springboot.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/10/16 19:18
 */
@Component
public class TestInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("request请求地址path[" + request.getServletPath() + "] uri[" + request.getRequestURI() + "]");
		return true;
	}
}
