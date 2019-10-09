package com.woniuxy.service;

import java.util.List;
import com.woniuxy.domain.Movie;
import com.woniuxy.domain.Page;

public interface IMovieService {

	void save(Movie m);
	void update(Movie m);
	void delete(Integer movid);
	Movie findOne(Integer movid);
	List<Movie> findAll();
	List<Movie> findlimit(Page<Movie> page);
	int getRowCount(String name,String mtype);
	List<String> getType();
	
}
