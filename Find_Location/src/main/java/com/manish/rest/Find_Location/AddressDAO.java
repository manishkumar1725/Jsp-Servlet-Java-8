package com.manish.rest.Find_Location;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class AddressDAO 
{
	
	
	 public List<Address> list = new ArrayList<Address>();
	   
	   public List<Address> getUserInfo()
	   {
		   Address user_1 = new Address("BIHAR","PATNA","INDIA", "123456");
		   Address user_2 = new Address("KARNATAKA","BANGALORE","INDIA","654321");
		  
		   
		  list.add(user_1);
		  list.add(user_2);
		
		  return list;
	
      /* public Map<Integer, Address> getUserInfo(){
		
		Map<Integer, Address> map=new HashMap<Integer, Address>();
		
		map.put(99501, new Address("Ak", "ANCHORAGE", "US"));
		map.put(123456, new Address("BIHAR","PATNA","INDIA"));
		map.put(654321, new Address("KARNATAKA","BANGALORE","INDIA"));
		
		return map;*/
		   

}
}