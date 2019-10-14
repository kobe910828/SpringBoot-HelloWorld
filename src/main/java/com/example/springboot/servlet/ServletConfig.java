package com.example.springboot.servlet;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/10/10 14:17
 */
@Configuration
public class ServletConfig {
    @Bean
    public ServletRegistrationBean helloWorldServlet() {
        ServletRegistrationBean helloWorldServlet = new ServletRegistrationBean();
        helloWorldServlet.addUrlMappings("/hello");
        helloWorldServlet.setServlet(new HelloWorldServlet());
        return helloWorldServlet;
    }

    @Bean
    public FilterRegistrationBean helloWorldFilter() {
        FilterRegistrationBean helloWorldFilter = new FilterRegistrationBean();
        helloWorldFilter.addUrlPatterns("/hello/*");
        helloWorldFilter.setFilter(new HelloWorldFilter());
        return helloWorldFilter;
    }
}
