package com.manish.rest.services;

import java.util.ArrayList;
import java.util.List;

import com.manish.rest.model.User;



public class UserInfo {
	
	
	
   public List<User> list = new ArrayList<User>();
   
   public List<User> getUserInfo()
   {
	   User user_1 = new User("MANISH","1234");
	   User user_2 = new User("RISHAV","12345");
	   User user_3 = new User("RAVI","123");
	   
	  list.add(user_1);
	  list.add(user_2);
	  list.add(user_3);
	  return list;
	   
   }
   
  
}
