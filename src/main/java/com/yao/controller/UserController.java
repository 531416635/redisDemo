package com.yao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import redis.clients.jedis.Jedis;

import com.alibaba.fastjson.JSONArray;
import com.yao.model.Right;
import com.yao.model.User;
import com.yao.service.RediService;
import com.yao.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userservice;

	@Autowired
	private RediService rediservice;

	@RequestMapping("/find")
	public String findUser(Model model) {

		Jedis connredis = rediservice.getRedisConn();
		System.out.println(connredis.get("key1"));
		User user = userservice.findUser(1);
		model.addAttribute("user", user);
		return "userfind";

	}
	@RequestMapping("/user")
	public String userList(Model model) {

		Jedis connredis = rediservice.getRedisConn();
		System.out.println(connredis);
		List<User> users = userservice.userList();
		model.addAttribute("users", users);
		return "user";

	}
	@RequestMapping("/add")
	public String addUser(Model model) {
		List<Right> rights = userservice.rightlist();
		model.addAttribute("rights", rights);
		return "useradd";

	}
	@ResponseBody
	@RequestMapping("/addto")
	public String addUserTo(Model model,User user) {

		Jedis connredis = rediservice.getRedisConn();
		System.out.println(connredis);
		String users = userservice.addUser(user);
		model.addAttribute("users", users);
		return "useradd";

	}
}
