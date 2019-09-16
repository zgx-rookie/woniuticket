package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.CinemaMapper;
import com.woniuxy.domain.Cinema;
import com.woniuxy.service.ICinemaService;



@Service
@Transactional
public class CinemaServiceImpl implements ICinemaService{
	@Autowired
	private CinemaMapper mapper;
	@Override
	public List<Cinema> find() {
		return mapper.selectAll();
	}

	

}
