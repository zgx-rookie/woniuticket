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

import com.woniuxy.domain.Platform;
import com.woniuxy.service.IPlatformService;

@Controller
@RequestMapping("platforms")
public class PlatformController {
	@Autowired
	IPlatformService service;
	
	@PostMapping
	@ResponseBody
	public void save(Platform plat) {
		service.save(plat);
	}
	@GetMapping
	@ResponseBody
	public void findAll() {
		List<Platform> plat = service.findAll();
		for (Platform p : plat) {
			System.out.println(p);
		}
	}
	
	@GetMapping("1")
	@ResponseBody
	public void findOne(Integer pid) {
		Platform p = service.findOne(pid);
		System.out.println(p);
	}
	
	@DeleteMapping
	@ResponseBody
	public void delete(Integer pid) {
		service.delete(pid);
	}
	
	@PutMapping
	@ResponseBody
	public void update(Platform plat) {
		service.update(plat);
	}
}
