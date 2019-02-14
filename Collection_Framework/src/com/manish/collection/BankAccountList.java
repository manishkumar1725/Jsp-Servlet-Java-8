package com.manish.collection;


import java.util.TreeSet;

public class BankAccountList {
	
     public static void main(String args[])
     {
    	 TreeSet<SavingAccount> view=new TreeSet<SavingAccount>(new Id_Comp());
    	 
    	 view.add(new  SavingAccount("MANISH",5500,17,true));
    	 view.add(new  SavingAccount("RISHAV",5000,23,false));
    	 view.add(new  SavingAccount("AMIT",6000,21,true));
    	 view.add(new  SavingAccount("RAVI",5200,15,false));
    	 view.add(new  SavingAccount("MANISH",5500,17,true));
    	 
    	 
    	 
    	
    	 
    	 
    	 
    	 for(SavingAccount view1 : view)
 	    {
 	    	System.out.println(view1);
 	    }
     }

}
