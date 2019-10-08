package com.woniuxy.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.aspectj.weaver.tools.cache.AsynchronousFileCacheBacking.RemoveCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.CinemaMapper;
import com.woniuxy.domain.Cinema;
import com.woniuxy.domain.Movie;
import com.woniuxy.service.ICinemaFindService;
@Service
@Transactional
public class CinemaFindServiceImpl implements ICinemaFindService{

	@Autowired
	private CinemaMapper mapper;
	@Override
	public List<Cinema> findByMovid(Integer movid) {
		List<Cinema> newList = new ArrayList<Cinema>();
		List<Cinema> oldList = mapper.findByMovid(movid);
		for (Cinema cinema : oldList) {
			cinema.getClogo();
		}
		//去重
		for(int i=0; i<oldList.size()-1;i++) {
			for(int j=oldList.size()-1; j>i; j--) {
				if(oldList.get(j).getClogo().equals(oldList.get(j).getClogo())) {
					newList.add(oldList.get(j));
					oldList.remove(j);
				}
			}
		}
		return newList;
	}
	public Movie findMovieInfo(Integer movid) {
		return mapper.findMovieInfo(movid);
	}
	

}
