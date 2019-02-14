package com.manish.lambda;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;







public class Map_String {

	public static void main(String[] args) {
	  
		
		HashMap<Integer ,String> view  =new HashMap<Integer,String>();
		
		view.put(17, "MANISH");
		view.put(25, "RISHAV");
		view.put(71, "AMIT");
		view.put(52, "RAVI");
		
		
		for(Entry<Integer, String> m : view.entrySet())
	    {
		System.out.println(+m.getKey()+":"+m.getValue());
		}
		
		ArrayList<String> arr = (ArrayList<String>)view.entrySet().stream().map(index -> index.getKey()+index.getValue()).collect(Collectors.toList());
		System.out.println(arr);
		
		String arr1 =  arr.stream().map(index -> index).reduce("", String :: concat);
		System.out.println(arr1);
	  }
		 

	}


