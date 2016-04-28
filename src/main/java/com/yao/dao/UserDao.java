package com.yao.dao;

import java.util.List;

import com.yao.model.Right;
import com.yao.model.User;

public interface UserDao {
	
	User findUser(Integer id);
	
	String addUser(User user);
	
	List<User> userList();
	
	List<Right>  rightlist();

}
