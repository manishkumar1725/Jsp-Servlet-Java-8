package com.manish.cart;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.manish.cart.ConnectionFactory1;
import com.manish.cart.Fashion;

public class FashionDAO implements IfashionDAO {
	
	 
	
	
   public ArrayList<Fashion> getData()	
    {
	  
    	ArrayList<Fashion> arr= new ArrayList<Fashion>();
    
        Connection connection =ConnectionFactory1.getConnection();
    
   try
     {
    	 PreparedStatement statement = connection.prepareStatement("select * from fashion");
	
	     ResultSet set = statement.executeQuery();
	
      while(set.next())
	    {
         String name=set.getString("name");
	     int price=set.getInt("price");
	
	     arr.add(new Fashion(name,price));
        }
     }
	catch(SQLException e)
	    {
		  e.printStackTrace();
	    }
	    return arr ;

	
}


 public static void main(String args[])
{
	
	System.out.println(new FashionDAO().getData());
}
}