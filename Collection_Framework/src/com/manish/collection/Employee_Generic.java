package com.manish.collection;

public class Employee_Generic {
	
	
	String name;
	int id;
	
	
	public Employee_Generic(String name, int id) 
	{
		this.name=name;
		this.id=id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Employee_Generic [name=" + name + ", id=" + id + "]";
	}
	

}
