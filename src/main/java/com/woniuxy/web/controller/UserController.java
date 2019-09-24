package com.woniuxy.web.controller;
/**
 * 田普旭123
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.domain.Page;
import com.woniuxy.domain.User;
import com.woniuxy.service.IUserService;

@Controller
@RequestMapping("/users")
public class UserController {
@Autowired
private IUserService service;


	/*
	 * public List<User> find(){ List<User> list = service.find(); for (User user :
	 * list) { System.out.println(user); } return list; }
	 */
//分页查询
@ResponseBody
@GetMapping
public Page<User> find(Integer p) {
	System.out.println("XXXXXXXXXXXXXXXXXXXXXXX");
		 System.out.println(p); 
	Page findByPage = service.findByPage(p,5);
	
	return findByPage;
}
@ResponseBody
@PutMapping
public void update(User user) {
	System.out.println(user);
	service.update(user);
	
}

@PostMapping
@ResponseBody
public void insert(@RequestBody User user) {
	System.out.println(user);
	service.insert(user);
}
@DeleteMapping
@ResponseBody
public void del(Integer uid){
	System.out.println(uid);
	service.delete(uid);
}

}
