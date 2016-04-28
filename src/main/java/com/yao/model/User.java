package com.yao.model;

import java.util.List;

public class User {
	

	private int id;
	
	private String name;
	
	private int age;
	
	private List<String> user_right_id;
	
	private List<Right> rights;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public List<String> getUser_right_id() {
		return user_right_id;
	}
	
	public void setUser_right_id(List<String> user_right_id) {
		this.user_right_id = user_right_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Right> getRights() {
		return rights;
	}

	public void setRights(List<Right> rights) {
		this.rights = rights;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age
				+ ", user_right_id=" + user_right_id + ", rights=" + rights
				+ "]";
	}

}
