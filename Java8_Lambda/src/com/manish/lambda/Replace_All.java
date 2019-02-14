package com.manish.lambda;

import java.util.ArrayList;
import java.util.Collection;

public class Replace_All {
	
	public static void main(String args[])
	{
	
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("manish");
		name.add("tiger");
		name.add("aryan");
		name.add("abhishek");
		name.add("nityansh");
		
		name.replaceAll(index -> index.toUpperCase());
		
		for(String view : name)
		{
			System.out.println(view);
		}
	}

	
}
