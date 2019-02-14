package com.manish.lambda;

import java.util.ArrayList;

public class Odd_Length {

	public static void main(String[] args) {
	
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("MANISH");
		name.add("TIGER");
		name.add("SOHAM");
		name.add("ABHISHEK");
		name.add("NITYANS");
		
		
		name.removeIf(i -> ( i.length() % 2 !=0));
		
		for(String i : name)
		System.out.println(i);
	}

}
