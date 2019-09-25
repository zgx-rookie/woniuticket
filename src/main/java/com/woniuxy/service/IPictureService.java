package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.Picture;

public interface IPictureService {
	void save(Picture picture);
	void delete(Integer pid);
	void Update(Picture picture);
	List<Picture> findAll(Picture picture);
	Picture findOne(Integer pid);
}
