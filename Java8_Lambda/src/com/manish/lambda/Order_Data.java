package com.manish.lambda;

public class Order_Data {
	
	
	String name;
	int order_amount;
	
	
	public Order_Data(String name, int order_amount) {
		super();
		this.name = name;
		this.order_amount = order_amount;
	}

     // GETTERS..
	public String getName() {
		return name;
	}


	public int getOrder_amount() {
		return order_amount;
	}

    // SETTERS..
	public void setName(String name) {
		this.name = name;
	}


	public void setOrder_amount(int order_amount) {
		this.order_amount = order_amount;
	}

	@Override
	public String toString() {
		return "Order_Data [name=" + name + ", order_amount=" + order_amount
				+ "]";
	}
	
	
}
