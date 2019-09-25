package com.woniuxy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.domain.User;
import com.woniuxy.service.IUserService;

@Controller
@RequestMapping("users")
public class UserController {
	@Autowired
	IUserService service;
	
	@PostMapping
	@ResponseBody
	public void save(User user) {
		service.insert(user);
	}
	@GetMapping
	@ResponseBody
	public void findAll() {
		List<User> user = service.findAll();
		for (User u : user) {
			System.out.println(u);
		}
	}
	
	@GetMapping("1")
	@ResponseBody
	public void findOne(Integer uid) {
		User user = service.findOne(uid);
		System.out.println(user);
	}
	
	@DeleteMapping
	@ResponseBody
	public void delete(Integer uid) {
		service.delete(uid);
	}
	
	@PutMapping
	@ResponseBody
	public void update(User user) {
		service.update(user);
	}
}
