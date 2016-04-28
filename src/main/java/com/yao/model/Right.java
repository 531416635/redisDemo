package com.yao.model;


public class Right {
	
	private int id;
	
	private String operight;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOperight() {
		return operight;
	}

	public void setOperight(String operight) {
		this.operight = operight;
	}

	@Override
	public String toString() {
		return "Right [id=" + id + ", operight=" + operight + "]";
	}
	
}
