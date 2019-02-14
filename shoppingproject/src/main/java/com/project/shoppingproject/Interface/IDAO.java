package com.project.shoppingproject.Interface;

import java.util.List;

import com.project.shoppingproject.pojo.User;

public interface IDAO {
	
	public void get();
	public List<User> getAll();
	public int add(User user);
	public int update(User user);
	public double remove(double userId);
	
	
}
