package com.woniuxy.service;
/**
 * 田普旭
 */
import java.util.List;

import com.woniuxy.domain.Page;
import com.woniuxy.domain.User;

public interface IUserService {
	List<User> find();
	void delete(Integer id);
	void update(User user);
	void insert(User user);
	
	Page findByPage(int startLine,int size);
}
