package com.manish.collection;

import java.util.*;

import com.manish.collection.*;

public class TreeSet_Object {
	
	public static void main(String Args[])
{
		TreeSet<TreeSet_Implementation> display1 = new TreeSet<TreeSet_Implementation>(new WeightComp());
		
	    display1.add(new TreeSet_Implementation("MANISH",55,6));
	    display1.add(new TreeSet_Implementation("RISHAV",56,5)); 
	    display1.add(new TreeSet_Implementation("AMIT",57,7));
	    display1.add(new TreeSet_Implementation("VIKASH",70,4));
	    
	    for(TreeSet_Implementation view1 : display1)
	    {
	    	System.out.println(view1);
	    }
       
}
}