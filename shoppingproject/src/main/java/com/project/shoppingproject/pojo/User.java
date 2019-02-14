package com.project.shoppingproject.pojo;

public class User {
	
	private String emaiId;
	private double userId;
	private String name;
	private double phoneNo;
	private String password;
	
	public User() {
		
	}
	
	public User(String emaiId, double userId, String name, double phoneNo, String password) {
		super();
		this.emaiId = emaiId;
		this.userId = userId;
		this.name = name;
		this.phoneNo = phoneNo;
		this.password = password;
	}
	public String getEmaiId() {
		return emaiId;
	}
	public void setEmaiId(String emaiId) {
		this.emaiId = emaiId;
	}
	public double getUserId() {
		return userId;
	}
	public void setUserId(double userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(double phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [emaiId=" + emaiId + ", userId=" + userId + ", name=" + name + ", phoneNo=" + phoneNo
				+ ", password=" + password + "]";
	}
	
	

}
