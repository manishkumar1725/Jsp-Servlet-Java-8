package com.manish.rest.EmployeeManagmentSystem;

import java.util.Map;

public class DisplayEmployee {
	
	 EmployeeService	obj = new EmployeeService();
     Map<Integer,EmployeeModel> index = obj.getInfo();
     
    

}
