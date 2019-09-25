package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.dao.CinemaMapper;
import com.woniuxy.domain.Cinema;
import com.woniuxy.domain.Page;
import com.woniuxy.service.ICinemaService;

@Service
public class CinemaService implements ICinemaService {
	
	@Autowired
	private CinemaMapper mapper;
	
	  
	@Override
	public void save(Cinema cinema) {
		mapper.insertSelective(cinema);
	}

	@Override
	public void delete(Integer cid) {
		mapper.deleteByPrimaryKey(cid);

	}

	@Override
	public void Update(Cinema cinema) {
		mapper.updateByPrimaryKeySelective(cinema);

	}

	@Override
	public List<Cinema> findAll(Cinema cinema) {
		
		return mapper.selectByExample(null);
	}

	@Override
	public Cinema findOne(Integer cid) {
		
		return mapper.selectByPrimaryKey(cid);
	}

	@Override
	public Page<Cinema> findByPage(Cinema cinema,int...pages) {
		Integer allRow = mapper.getRow(cinema);
		
		Page<Cinema> page=new Page<Cinema>(pages[0],pages[1],allRow);
		cinema.setStartLine((page.getPage()-1)*page.getRow());
		cinema.setRow(page.getRow());
		List<Cinema> list = mapper.findByPage(cinema);
		page.setList(list);
		System.out.println(cinema.getCname()+"    "+cinema.getCid());
		return page;
	}


}
