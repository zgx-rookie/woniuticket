package com.woniuxy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.domain.Page;
import com.woniuxy.domain.Room;
import com.woniuxy.service.IRoomService;
import com.woniuxy.service.IRoomService;

@Controller
@RequestMapping("rooms")
public class RoomController {

	@Autowired
	private IRoomService service;
	
	
	@PostMapping
	@ResponseBody
	public void save(@RequestBody Room room) {
		service.save(room);
	} 
	

	@DeleteMapping
	@ResponseBody
	public void delete(Integer rid) {
		service.delete(rid);
		
	}
	
	
	
	@GetMapping("1")
	@ResponseBody
	public void find(Integer rid) {
		
		service.findOne(rid);
		
	}
	
	/*
	 * @GetMapping
	 * 
	 * @ResponseBody public List<Room> findAll() {
	 * System.out.println(service.findAll()); List<Room> list=service.findAll(); for
	 * (Room room : list) { System.out.println(room); }
	 * 
	 * return list ;
	 * 
	 * }
	 */
	
	@GetMapping
	@ResponseBody
	public Page<Room> findPage(Integer p){
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println(p);
		Page findByPage =service.findByPage(p, 5);
		return findByPage;
				
		}
	
	
	@PutMapping
	@ResponseBody
	
	public String update(Room room) {
		
		service.update(room);
		return "a";} 
}
