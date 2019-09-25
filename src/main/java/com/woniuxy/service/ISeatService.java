package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.Seat;

public interface ISeatService {

	public void save(Seat seat);
	public void delete(Integer sid);
	public void find(Integer sid);
	public List<Seat> findAll();
	public void update(Seat seat);

}
