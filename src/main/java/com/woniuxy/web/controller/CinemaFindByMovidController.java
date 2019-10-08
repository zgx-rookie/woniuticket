package com.woniuxy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.domain.Cinema;
import com.woniuxy.domain.Movie;
import com.woniuxy.service.ICinemaFindService;

@Controller
@RequestMapping("cinemafind")
public class CinemaFindByMovidController {

@Autowired
private ICinemaFindService service;
@GetMapping
@ResponseBody
List<Cinema> findByMovid(Integer movid){
	
	List<Cinema> findByMovid = service.findByMovid(movid);
	for (Cinema cinema : findByMovid) {
		System.out.println(cinema);
	}
	
	return findByMovid;
}	
@GetMapping("aa")
@ResponseBody
Movie findMovieInfo(Integer movid) {
	
	return service.findMovieInfo(1);
}
}
