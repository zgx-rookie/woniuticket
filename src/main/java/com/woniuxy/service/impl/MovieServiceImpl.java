package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.MovieMapper;
import com.woniuxy.domain.Movie;
import com.woniuxy.domain.Page;
import com.woniuxy.service.IMovieService;

@Service
@Transactional
public class MovieServiceImpl implements IMovieService{

	@Autowired
	private MovieMapper mapper;
	
	@Override
	public void save(Movie m) {
		mapper.insert(m);
	}

	@Override
	public void update(Movie m) {
		mapper.updateByPrimaryKey(m);
	}

	@Override
	public void delete(Integer movid) {
		mapper.deleteByPrimaryKey(movid);
	}

	@Override
	public Movie findOne(Integer movid) {
		return mapper.selectByPrimaryKey(movid);
	}

	@Override
	public List<Movie> findAll() {
		return mapper.selectByExample(null);
	}

	@Override
	public List<Movie> findlimit(Page<Movie> page) {
		
		return mapper.selectByLimitQuery(page);
	}

	

	@Override
	public int getRowCount(String name,String mtype) {
			
		return mapper.selectBySearchName(name,mtype);
	}

	@Override
	public List<String> getType() {
		return mapper.selectByType();
	}


	

}
