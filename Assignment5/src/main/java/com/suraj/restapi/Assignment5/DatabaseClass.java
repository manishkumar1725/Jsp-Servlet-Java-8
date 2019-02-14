package com.suraj.restapi.Assignment5;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {

	Map<Integer,Employeeinfo> emp=new HashMap<Integer, Employeeinfo>();
	
	public DatabaseClass(){
		emp.put(1, new Employeeinfo("Suraj", "Cloud", "Analyst", 10000));
		emp.put(2, new Employeeinfo("Sachin", "Business Intelligence", "SeniorAnalyst", 10000));
		emp.put(3, new Employeeinfo("Sanjay", "S.A.P", "Analyst", 10000));
	}
	public Map<Integer,Employeeinfo>  getEmployess(){
		return emp;
	}
}
