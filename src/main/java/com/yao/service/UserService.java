package com.yao.service;

import java.util.List;

import com.yao.model.Right;
import com.yao.model.User;

public interface UserService {

	User findUser(Integer id);

	String addUser(User user);

	List<User> userList();
	
	List<Right>  rightlist();

}
