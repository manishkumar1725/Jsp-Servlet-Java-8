package com.manish.collection;

public class Generic_Impl {
	
	public static void main(String args[])
	{
	
	MyList<Employee_Generic> emp = new MyList<Employee_Generic>();
	
	    emp.add(new Employee_Generic("Manish",1725));
	    emp.getAdd();
	    emp.add(new Employee_Generic("Rishav",172));
	    emp.getAdd();
	    emp.add(new Employee_Generic("Amit",17));
	    emp.getAdd();
	    
	    
	    
	MyList<Account_Generics> acc = new MyList<Account_Generics>();  
	   
	   acc.add(new Account_Generics("Manish",5000));
	   acc.getAdd();
	   acc.add(new Account_Generics("Rishav",500));
	   acc.getAdd();
	   acc.add(new Account_Generics("Amit",50));
	   acc.getAdd();
	   
	   System.out.println(emp.getArr());
	
	   System.out.println(acc.getArr());
	   
	   
	
	  
	
	}
	
	
}	

