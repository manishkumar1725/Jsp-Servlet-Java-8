package com.manish.collection;

import java.util.*;

import com.manish.collection.Date;

public class HashMap_Implemenatation {
	
	public static void main(String args[])
	{
	
		Hashtable<Date,String> view = new Hashtable<Date,String>();
		
		view.put(new Date(12,9,2016), "Manish");
		view.put(new Date(13,8,2016),"Rishav");
		view.put(new Date(14,7,2016),"Ravi");
		view.put(new Date(15,6,2016),"Rahul");
		view.put(new Date(16,5,2016),"Amit");

		


}
}
