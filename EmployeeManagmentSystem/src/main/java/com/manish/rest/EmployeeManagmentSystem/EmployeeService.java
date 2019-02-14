package com.manish.rest.EmployeeManagmentSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class EmployeeService 
{
	Map<Integer, EmployeeModel> map=new HashMap<Integer, EmployeeModel>();
	
	public EmployeeService()
	{

	   Map<Integer, EmployeeModel> map=new HashMap<Integer, EmployeeModel>();
	  
     
           map.put( 111,new EmployeeModel("MANISH", "CSE", "STUDENT",5000));
		   map.put(112, new EmployeeModel("RISHAV", "ECE", "TEACHER",6000));
		   
    }
	
	public  Map<Integer, EmployeeModel> getInfo()
	{
		return map;
	}
        
        
        
}