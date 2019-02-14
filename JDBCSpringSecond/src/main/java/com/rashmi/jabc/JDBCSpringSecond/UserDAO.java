package com.rashmi.jabc.JDBCSpringSecond;

import java.util.List;

public interface UserDAO {
	public boolean add(User user);
	public boolean remove(int id);
	public boolean update(User id);
	public List<User> getAllDetails();
	public List<User> getUserDetail(int id);
	public boolean isContain(int id);

}
