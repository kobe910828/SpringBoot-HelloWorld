package com.example.springboot.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import javax.annotation.Resource;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/10/16 19:46
 */
//@EnableWebMvc
@Configuration
public class MvcConfiguration extends WebMvcConfigurationSupport {
	@Resource
	private TestInterceptor testInterceptor;

	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(testInterceptor).addPathPatterns("/**");
	}
}
