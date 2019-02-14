package com.manish.rest.Find_Location;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;




@Path("zipcod")
public class MyResource {

   
   
    @Path("{zipcod}")	
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Address  getInfo(@PathParam("zipcod") String zipcode)
    {
    	
    
    		AddressDAO dao = new AddressDAO();
    		
    		Address show = null;
    		
    		for(Address add: dao.getUserInfo())
        	{
        		if(add.getZipcode().equals(zipcode))
                 	{
        			  show = add;
                 	}
        	}
    		
             return show;
             
             
    }      
    	
}    /*	   AddressDAO dao = new AddressDAO();
    	
    	   Address show = null;
    	   
          for (Entry<Integer, Address> entry : dao.getUserInfo().entrySet())  
          {
			 
			 if (zipcode==entry.getKey())
			 {
				 show = entry.getValue();
			
		     }  
	            
		   }
		return show;
	          
          
	      
    }*/
    	
    	
    	
    	
    

