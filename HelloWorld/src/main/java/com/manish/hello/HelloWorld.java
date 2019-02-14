package com.manish.hello;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.manish.model.Message;
import com.manish.service.MessageService;


@Path("print")
public class HelloWorld 
{
	@GET
	@Produces(MediaType.APPLICATION_XML)
	 public List<Message> show()
	 {    
		MessageService message=new MessageService();
		
		return message.getAllMessage();
	 }

}
