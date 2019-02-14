package com.manish.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Collectors;



public class Order_Check {
	
	public static void main(String args[])
	{
		
		ArrayList<Order_Data> view = new ArrayList<Order_Data>();
		
		view.add(new Order_Data("MANISH",11000));
		view.add(new Order_Data("RISHAV",12000));
		view.add(new Order_Data("AMIT",9000));
		view.add(new Order_Data("RAVI",15000));
		view.add(new Order_Data("SURAJ",8000));
		
		
		Consumer<Order_Data> c = i -> {
			
			if(i.getOrder_amount() > 10000)
			{
				System.out.println(i+"   "+"ORDER ACCEPTED!!");
			}
			else
				System.out.println(i+"   "+"ORDER NOT ACCEPTED!!");
			
		};
		
		  ArrayList<Order_Data> input = (ArrayList<Order_Data>) view.stream().filter(i -> i.getOrder_amount()>10000).collect(Collectors.toList());
		 
		
		  view.stream().forEach(c);
		
	}

}
