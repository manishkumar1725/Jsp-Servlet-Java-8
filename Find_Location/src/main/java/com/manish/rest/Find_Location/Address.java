package com.manish.rest.Find_Location;

public class Address {
	
	String state;
	String city;
	String country;
	String zipcode;
	
	public Address()
	{
		
	}

	public Address(String state, String city, String country,String zipcode)
	{
		
		this.state = state;
		this.city = city;
		this.country = country;
		this.zipcode = zipcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", country="
				+ country + "]";
	}
	
	
	

}
