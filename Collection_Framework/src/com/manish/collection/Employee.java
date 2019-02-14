package com.manish.collection;

public class Employee {
	
	String name;
	int id;
	
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}


	@Override
	public boolean equals(Object obj) {
		
		if(this == obj)
			return true;
		
		if(obj == null || obj.getClass()!= this.getClass()) 
            return false; 
          
	     Employee emp = (Employee) obj;
	     
	     return emp.name.equals(this.name) && emp.id == (this.id);
	}


	@Override
	public int hashCode() {
		
		return this.id;
	}
	
}
