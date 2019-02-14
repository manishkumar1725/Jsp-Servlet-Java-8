package com.suraj.restapi.Assignment5;

import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("search")
public class SearchEmployee {
	DatabaseClass obj=new DatabaseClass();
	Map<Integer,Employeeinfo> index=obj.getEmployess();
	
	@Path("{id}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String searchEmployee(@PathParam("id")Integer id){
		String x="Invalid EmployeeId";
		for (Map.Entry<Integer, Employeeinfo> entry : index.entrySet()) {
			
		   if(id==entry.getKey()){
			   Employeeinfo emp=entry.getValue();
			    x= emp.toString();
		   }			  
}
		 return x;
	}

}
