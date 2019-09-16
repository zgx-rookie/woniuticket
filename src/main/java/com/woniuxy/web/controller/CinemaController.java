package com.woniuxy.web.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.woniuxy.domain.Cinema;
import com.woniuxy.service.ICinemaService;

@Controller
@RequestMapping("/find")
public class CinemaController {
	
	@Autowired
	private ICinemaService service;
	
	@GetMapping
	@ResponseBody
	public List<Cinema> find() {
		System.out.println("controller()..");
		List<Cinema> list=service.find();
		System.out.println(list.size());
		for (Cinema cinema : list) {
			System.out.println(cinema);
		}
		
		return list;
	}
}
