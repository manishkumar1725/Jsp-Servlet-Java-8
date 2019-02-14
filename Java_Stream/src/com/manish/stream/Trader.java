package com.manish.stream;

public class Trader {
	
	String name; 
	String city;
	
	public Trader(String name, String city)
	{
		
		this.name = name;
		this.city = city;
	}
   
	//GETTERS...
	
	public String getName() {
		return name;
	}

	public  String getCity() {
		return city;
	}
	
	//SETTERS..

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}
	
}
