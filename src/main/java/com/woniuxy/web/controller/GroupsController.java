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

import com.woniuxy.domain.Groups;
import com.woniuxy.domain.GroupsExample;
import com.woniuxy.service.IGroupsService;

@Controller
@RequestMapping("groups")
public class GroupsController {
	
	@Autowired
	private IGroupsService service;
	
	
	@PostMapping
	@ResponseBody
	public String save(Groups groups) {
		
		groups.setGname("二级套餐");
		groups.setGinfo("alal");
		service.save(groups);
		return "a";
	}
	

	@DeleteMapping
	@ResponseBody
	public String delete(Integer gid) {
		service.delete(1);
		return "a";
		
	}
	
	
	
	@GetMapping("1")
	@ResponseBody
	public String find(Integer gid) {
		
		service.find(gid);
		return "a";
		
	}
	
	@GetMapping
	@ResponseBody
	public String findAll() {
		System.out.println(	service.findAll());
//		service.findAll();
		return "a";
		
	}
	
	
	@PutMapping
	@ResponseBody
	
	public String update(Groups groups) {
		
		service.update(groups);
		return "a";} 
	
}
