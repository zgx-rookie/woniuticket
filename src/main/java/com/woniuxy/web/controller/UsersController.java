package com.woniuxy.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.domain.Users;
import com.woniuxy.service.IUsersService;
import com.woniuxy.util.AppUtils;

@Controller
@RequestMapping("userss")
public class UsersController {
	
	@Autowired
	private IUsersService service;
	
	@PostMapping
	@ResponseBody
	public Map save(Users user) {
		System.out.println(user);
		Map map = new HashMap();
		
		try { 
			String password_salt = AppUtils.uuid();
			String password = AppUtils.encrypt(user.getPassword(), password_salt);
			user.setPassword(password);
			user.setPasswordSalt(password_salt);
			service.save(user);
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			map.put("status", 200);
		}
		catch (Exception e) {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println(e);
			map.put("status", 500);
			map.put("message", "注册失败，可能是用户名已存在,请重新注册");
		} 
		System.out.println(map+"++++++++++++++++++++++");
		return map;
	}
	
	
	@PostMapping("login")
	@ResponseBody
	public Map login(String username,String password) {
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		
		Map map = new HashMap();
		try {
			subject.login(token);
			System.out.println("##############################");
			map.put("status", 200);
			map.put("username", subject.getPrincipal());
		} catch (AuthenticationException e) {
			map.put("status", 500);
			map.put("message", "登录失败，可能是用户名或密码错误");
		}
		return map;
	}
	
	@GetMapping("isLogin")
	@ResponseBody
	public Map isLogin() {
		Subject subject = SecurityUtils.getSubject();
		System.out.println(subject.getPrincipal());
		Map map = new HashMap();
		System.out.println(subject.isAuthenticated()+"~~~~~~~~~~~~~");
		map.put("status", subject.isAuthenticated()? 200 : 500);
		return map;
	}
}
