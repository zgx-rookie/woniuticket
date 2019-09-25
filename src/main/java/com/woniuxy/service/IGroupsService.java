package com.woniuxy.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.domain.Groups;
import com.woniuxy.domain.GroupsExample;


public interface IGroupsService {

	public void save(Groups groups);
	public void delete(Integer gid);
	public void find(Integer gid);
	public List<Groups> findAll();
	public void update(Groups groups);


}
