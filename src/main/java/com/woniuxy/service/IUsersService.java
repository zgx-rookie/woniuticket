package com.woniuxy.service;

/**
 * 田普旭123
 */
import java.util.List;

import com.woniuxy.domain.Users;

public interface IUsersService {
	List<Users> find();
	void delete(Integer id);
	void update(Users user);
	void save(Users user);
}
