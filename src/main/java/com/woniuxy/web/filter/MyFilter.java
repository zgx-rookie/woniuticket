package com.woniuxy.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns = "/*")
public class MyFilter implements Filter {
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		System.out.println("FFFFFFFFFFFFFFFFFFFFFFFFFf");
		// 允许指定域访问跨域资源
		resp.setHeader("Access-Control-Allow-Origin", "http://localhost:8888");
		// 允许跨域的ajax请求携带cookie
		resp.setHeader("Access-Control-Allow-Credentials", "true");

		chain.doFilter(request, response);
	}
}
