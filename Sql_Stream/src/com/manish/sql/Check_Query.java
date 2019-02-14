package com.manish.sql;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Check_Query {

	public static void main(String[] args) {
		
		
	ArrayList<Employee> emp = new ArrayList<Employee>();
		
		emp.add(new Employee(7369,"SMITH","CLERK",7902,new MyDate(17,12,1980),800,0,20));
		emp.add(new Employee(7499,"ALLEN","SALESMAN",7698,new MyDate(20,02,1981),1600,300,30));
		emp.add(new Employee(7521,"WARD","SALESMAN",7698,new MyDate(22,02,1981),1250,500,30));
		emp.add(new Employee(7566,"JONES","MANAGER",7839,new MyDate(02,04,1981),2975,0,20));
		emp.add(new Employee(7654,"MARTIN","SALESMAN",7698,new MyDate(28,9,1981),1250,1400,30));
		emp.add(new Employee(7698,"BLAKE","MANAGER",7839,new MyDate(01,3,1981),2850,0,30));
		emp.add(new Employee(7782,"CLARK","MANAGER",7839,new MyDate(9,01,81),2450,0,10));
		emp.add(new Employee(7788,"SCOTT","ANALYST",7566,new MyDate(19,04,1987),3000,0,20));
		emp.add(new Employee(7839,"KING","PRESIDENT",0,new MyDate(17,11,1981),5000,0,10));
		emp.add(new Employee(7844,"TURNER","SALESMAN",7698,new MyDate(8,9,1981),1500,0,30));
		
		
	ArrayList<Department> dep = new ArrayList<Department>();
	    
	    dep.add(new Department(10,"ACCOUNTING","NEW YORK"));
	    dep.add(new Department(20,"RESEARCH","DALLAS"));
	    dep.add(new Department(30,"SALES","CHICAGO"));
	    dep.add(new Department(40,"OPERATIONS","BOSTON"));
	    
	    
	  //QUESTION NUMBER 1. 
		
	   System.out.println("QUESTION NUMBER 1.");
	    
	   ArrayList<String> dep_1=(ArrayList<String>) dep.stream().map(index->index.getDname()).collect(Collectors.toList()); 

	   System.out.println(dep_1);
	   
	  // QUESTION NUMBER 2.
		
	   System.out.println("----------------------------------");	
	   System.out.println("QUESTION NUMBER 2.");
	   
	   ArrayList<String> emp_1=(ArrayList<String>) emp.stream().map(index->index.getEname()).collect(Collectors.toList());
	   
	   System.out.println(emp_1);
	   
	 // QUESTION NUMBER 3.
		
	   System.out.println("----------------------------------");	
	   System.out.println("QUESTION NUMBER 3.");
	   
	   ArrayList<Employee> emp_2=(ArrayList<Employee>) emp.stream().filter(index->index.getDeptno()==30).collect(Collectors.toList());
	  
	   for(Employee index:emp_2)
	   {
		   System.out.println(index.getEname());
	   }
	   
	 // QUESTION NUMBER 4.
			
	   System.out.println("----------------------------------");	
	   System.out.println("QUESTION NUMBER 4.");
	   
	   ArrayList<Employee> emp_3=(ArrayList<Employee>) emp.stream().filter(index->index.getJob()=="CLERK").collect(Collectors.toList());

	   for(Employee index:emp_3)
	   {
		  System.out.println(index.getEname()+" - "+index.getEmpno()+" - "+index.getDeptno()); 
	   }
	  // QUESTION NUMBER 5.
		
	   System.out.println("----------------------------------");	
	   System.out.println("QUESTION NUMBER 5.");
	   
	   
	   ArrayList<Employee> emp_4=(ArrayList<Employee>) emp.stream().filter(index->index.getDeptno() >=20).collect(Collectors.toList());
	  
	   for(Employee index:emp_4)
	   {
		  System.out.println(index.getEname()+" - "+index.getDeptno()); 
	   }
	   
	 // QUESTION NUMBER 6.
		
	   System.out.println("----------------------------------");	
	   System.out.println("QUESTION NUMBER 6.");
	   
	   ArrayList<Employee> emp_5=(ArrayList<Employee>) emp.stream().filter(index->index.getComm()>index.getSal()).collect(Collectors.toList());
	   
	   for(Employee index:emp_5)
	   {
		  System.out.println(index.getEname()); 
	   }
	  
	   
	// QUESTION NUMBER 7.
		
	   System.out.println("----------------------------------");	
	   System.out.println("QUESTION NUMBER 7.");
	   
	   ArrayList<Employee> emp_6=(ArrayList<Employee>) emp.stream().filter(index->index.getComm()>(0.6) * index.getSal()).collect(Collectors.toList());
	   
	   for(Employee index:emp_6)
	   {
		  System.out.println(index.getEname()); 
	   }
	
	// QUESTION NUMBER 8.
	
	   System.out.println("----------------------------------");	
	   System.out.println("QUESTION NUMBER 8.");
	   
	   ArrayList<Employee> emp_7=(ArrayList<Employee>) emp.stream().filter(index->index.getComm()>(0.5) * index.getSal()).collect(Collectors.toList());
	   
	   for(Employee index:emp_7)
	   {
		  System.out.println(index.getEname()); 
	   }
	   
	// QUESTION NUMBER 9.
		
	   System.out.println("----------------------------------");	
	   System.out.println("QUESTION NUMBER 8.");
	   
	   ArrayList<Employee> emp_8=(ArrayList<Employee>) emp.stream().filter(index->index.getComm()+ index.getSal() >2000).collect(Collectors.toList());
	   
	  // ArrayList<Employee> emp_9= (ArrayList<Employee>) emp.stream().filter(index->index.getDeptno()=20).collect(Collectors.toList());
	   for(Employee index:emp_8)
	   {
		  System.out.println(index.getEname()); 
	   }
	}

}
