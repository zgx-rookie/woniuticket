package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.Page;
import com.woniuxy.domain.Room;

public interface IRoomService {
	void save(Room room);
	void delete(Integer rid);
	void update(Room room);
	void findOne(Integer rid);
	List<Room> findAll();
	
	
	//分页
	Page findByPage(int startLine, int size);
}
