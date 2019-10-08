package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.Cinema;
import com.woniuxy.domain.Movie;

public interface ICinemaFindService {
List<Cinema> findByMovid(Integer movid);
Movie findMovieInfo(Integer movid);
}
