package com.manish.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet_LinkedHashSet {

	public static void main(String[] args) {
		
		
		HashSet<String> display = new HashSet();
		
		display.add("MANISH");
		display.add("RAHUL");
		display.add("AMIT");
		display.add("RAVI");
		display.add("NIX");
		
		
		for(String view : display)
		{
			System.out.println(view);
		}
	   System.out.println("-----------------------------");
	   
	   
       LinkedHashSet<String> display1 = new LinkedHashSet();
		
		display1.add("MANISH");
		display1.add("RAHUL");
		display1.add("AMIT");
		display1.add("RAVI");
		display1.add("NIX");
		
		
		for(String view : display1)
		{
			System.out.println(view);
		}
		
	}

}
