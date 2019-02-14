package com.rashmi.jabc.JDBCSpringSecond;

public class User {

	public String userName;
	public String password;
	public int id;

	public User(String userName, String password, int id) {
		super();
		this.userName = userName;
		this.password = password;
		this.id = id;
	}

	public User() {

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password
				+ ", id=" + id + "]";
	}

}
