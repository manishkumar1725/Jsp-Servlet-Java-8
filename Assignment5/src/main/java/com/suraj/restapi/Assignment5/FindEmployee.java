package com.suraj.restapi.Assignment5;

import java.util.ArrayList;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("allemployee")
public class FindEmployee {

	DatabaseClass obj=new DatabaseClass();
	Map<Integer,Employeeinfo> index=obj.getEmployess();
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String findAllEmployess(){
		ArrayList<String> arr=new ArrayList<String>();
		for(Employeeinfo count:index.values()){
			arr.add(count.getEmpName());
		}
		return arr.toString();
	}

}
