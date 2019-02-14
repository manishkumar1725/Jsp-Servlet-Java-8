package com.manish.rest.Rest_Validation;

import java.util.ArrayList;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.manish.rest.services.UserInfo;
import com.manish.rest.model.User;

@Path("/validate")
public class MyResource 
{
	
	
	
	
    @POST
    @Produces(MediaType.TEXT_PLAIN)
	public String  getInfo(@FormParam("username") String username,@FormParam("password") String password) 
	{
    	
    	UserInfo user = new UserInfo();
    	
    	String check = null;
    	
    	for(User users: user.getUserInfo())
    	{
    		if(users.getUsername().equals(username) && users.getPassword().equals(password))
             	{
    			 check = "Valid User";
    			}
    	}
    	
	
		return check;
	}
}
    

