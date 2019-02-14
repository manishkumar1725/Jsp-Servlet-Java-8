package com.manish.cart;

public class Fashion {
	
	String name;
	int price;
	
	public Fashion(String name, int price)
	{
		
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}



	@Override
	public String toString() {
		return "Fashion [name=" + name + ", price=" + price + "]";
	}

	
	
	
	
	

}
