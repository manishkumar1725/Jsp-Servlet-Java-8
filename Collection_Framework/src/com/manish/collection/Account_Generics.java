package com.manish.collection;

public class Account_Generics {
	
	String name;
	int amount;
	
	public Account_Generics(String name, int amount) {
		
		this.name = name;
		this.amount = amount;
	}
	
	
	public String getName() {
		return name;
	}
	public int getAmount() {
		return amount;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Account_Generics [name=" + name + ", amount=" + amount + "]";
	}
	
	

}
