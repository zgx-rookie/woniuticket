package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.Cinema;
import com.woniuxy.domain.Page;

public interface ICinemaService {
	void save(Cinema cinema);
	void delete(Integer cid);
	void Update(Cinema cinema);
	List<Cinema> findAll(Cinema cinema);
	Cinema findOne(Integer cid);
	Page<Cinema> findByPage(Cinema cinema,int... pages);
}
