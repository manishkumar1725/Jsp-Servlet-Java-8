package com.manish.lambda;

public class Lambda_Demo {
	
	
	
public static void main(String args[])
{
	

	Add ad = (int num) ->{  int fact = 1;
	        for(int value=num;value>=1;value--)
	        {
	        	fact = fact * value;
	        }
	        System.out.println(fact);
	        
	};
	
	    ad.factorial(5);
			
	        
}
}   