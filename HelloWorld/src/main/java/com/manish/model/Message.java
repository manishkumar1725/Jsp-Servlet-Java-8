package com.manish.model;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	
	public int id;
	public String message;
	public Date date;
	public String author;
			
	//whenever we are having XML and JSON file we need  no argument constructor..		
	public Message()//Ensure that your model class have no argument constructor..
	{
		
	}
	
	public Message(int id,String message, String author)
	{
		
		this.id = id;
		this.message = message;
		this.date = new Date();
		this.author = author;
		
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

}
