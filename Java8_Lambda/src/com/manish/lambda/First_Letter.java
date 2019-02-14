package com.manish.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class First_Letter {

	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<String>();
		
		
		name.add("MANISH");
		name.add("TIGER");
		name.add("SOHAM");
		name.add("ABHISHEK");
		name.add("NITYANSH");
		
		
		List<Character>arr = name.stream().map(index -> index.charAt(0)).collect(Collectors.toList());
		
		for(Character i : arr)
		{
			System.out.print(i);
		}
		
		
		
		

	}

}
