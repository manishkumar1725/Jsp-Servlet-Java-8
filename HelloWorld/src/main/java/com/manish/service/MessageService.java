package com.manish.service;

import java.util.ArrayList;
import java.util.List;

import com.manish.model.Message;

public class MessageService 
{
	public List<Message> list = new ArrayList<Message>();
    
	public List<Message> getAllMessage()
	{
	  
	   
	   Message m1=new Message(1,"HII TO ALL","MANISH");
	   Message m2=new Message(2,"HII ALL","RISHAV");
	   
	   list.add(m1);
	   list.add(m2);
		
	   
	   return list;
	   		
	}

}
