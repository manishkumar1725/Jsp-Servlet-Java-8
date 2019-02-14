package com.manish.collection;

import java.util.HashMap;

public class Employee_HashImp {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("MANISH",17);
		Employee emp2 = new Employee("RISHAV",18);
		
		
		 HashMap<Employee, String> view = new HashMap<Employee, String>();
		 System.out.println(emp1.equals(emp2));
		 System.out.println(emp1.hashCode());
		 
		 view.put(emp1,"KUMAR");
		 view.put(emp2, "SINGH");
		 
		 
		 for(Employee emp :view.keySet())
		 {
			 System.out.println(view.get(emp).toString());
		 }
	}

}
