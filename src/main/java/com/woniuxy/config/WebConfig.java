package com.woniuxy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
 当前类，就是springboot环境下的配置类，该类的功能
 1、 配置CORS 
 2、配置拦截器
 3、配置HttpMessageConveter
 4、 配置Converter
*/

@Configuration
public class WebConfig implements WebMvcConfigurer {
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		// 参数registry是SpringBoot框架传入的，我们可以直接调用
		registry.addMapping("/**")  // 允许指定的域名可以访问当前应用中的所有url
			.allowedOrigins("http://localhost:9999")   // 允许指定的域名(9999)，来访问当前的应用(8888)
			.allowedMethods("POST","GET","PUT","DELETE", "OPTIONS")  // 允许指定的域名(9999)，通过指定的请求方式来访问当前的应用。
			.allowCredentials(true);  // 允许客户端ajax请求携带cookie
	}
	
}


