package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.GroupsMapper;
import com.woniuxy.domain.Groups;
import com.woniuxy.domain.GroupsExample;
import com.woniuxy.service.IGroupsService;

@Service
@Transactional
public class GroupsServiceImpl implements IGroupsService {

	@Autowired
	private GroupsMapper mapper;
	
	@Override
	public void save(Groups groups) {

		mapper.insertSelective(groups);
	}

	@Override
	public void delete(Integer gid) {
		mapper.deleteByPrimaryKey(gid);
	}

	@Override
	public void find(Integer gid) {
		mapper.selectByPrimaryKey(gid);
	}


	@Override
	public List<Groups> findAll() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}

	@Override
	public void update(Groups groups) {
		mapper.updateByPrimaryKey(groups);
	}


}
