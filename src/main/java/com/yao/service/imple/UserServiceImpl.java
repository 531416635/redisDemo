package com.yao.service.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yao.dao.UserDao;
import com.yao.model.Right;
import com.yao.model.User;
import com.yao.service.UserService;

@Service("userservice")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User findUser(Integer id) {
		// TODO Auto-generated method stub
		return userDao.findUser(id);
	}

	@Override
	public String addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	@Override
	public List<User> userList() {
		// TODO Auto-generated method stub
		return userDao.userList();
	}

	@Override
	public List<Right> rightlist() {
		// TODO Auto-generated method stub
		return userDao.rightlist();
	}

}
