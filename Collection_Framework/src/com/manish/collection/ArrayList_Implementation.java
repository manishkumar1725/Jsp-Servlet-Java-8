package com.manish.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList_Implementation {

	public static void main(String[] args) {
		
		
		
		ArrayList<String> display = new ArrayList();
		
		display.add("MANISH");
		display.add("RAHUL");
		display.add("RAVI");
		display.add("AMIT");
		display.add("RISHAV");
		
	
	     ListIterator<String> view=display.listIterator();    
		
		
		  System.out.println("Displaying List in Forward Direction : "); 
		  
	     while(view.hasNext())
	        {    
	           System.out.println("index:"+view.nextIndex()+" value:"+view.next());    
	        }    
	       System.out.println("Displaying List in Backward Direction :");
	        
	     while(view.hasPrevious())
	     {    
	          System.out.println("index:"+view.previousIndex()+" value:"+view.previous());    
	     }    
		
	}

}
