package com.manish.rest.EmployeeManagmentSystem;

import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("add")
public class AddEmployee {
	
	
      EmployeeService	obj = new EmployeeService();
      Map<Integer,EmployeeModel> index = obj.getInfo();
      
      @GET
      @Path("{employeeId}/{employeeName}/{employeeDepartment}/{employeeDesignation}/{employeeSalary}")
      @Produces(MediaType.TEXT_PLAIN)
      public String addEmployee(@PathParam("employeeId") int employeeId,@PathParam("employeeName") String employeeName,@PathParam("employeeDepartment") String employeeDepartment,
    		  @PathParam("employeeDesignation") String employeeDesignation,@PathParam("employeeSalary") double employeeSalary)
    		  {
    	  
    	        index.put(employeeId,new EmployeeModel(employeeName,employeeDepartment,employeeDesignation,employeeSalary));
				return index.toString();
    	  
    		  }

}
