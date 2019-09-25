package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.dao.PictureMapper;
import com.woniuxy.domain.Picture;
import com.woniuxy.service.IPictureService;

@Service
public class PictureService implements IPictureService {

	@Autowired
	private PictureMapper mapper;
	
	@Override
	public void save(Picture picture) {
		mapper.insertSelective(picture);
	}

	@Override
	public void delete(Integer pid) {
		mapper.deleteByPrimaryKey(pid);
	}

	@Override
	public void Update(Picture picture) {
		mapper.updateByPrimaryKeySelective(picture);
	}

	@Override
	public List<Picture> findAll(Picture picture) {
		return mapper.selectByExample(null);
	}

	@Override
	public Picture findOne(Integer pid) {
		return mapper.selectByPrimaryKey(pid);
	}

}
