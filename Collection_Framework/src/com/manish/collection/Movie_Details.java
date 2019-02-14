package com.manish.collection;

public class Movie_Details
{

	String mov_Name;
	String lead_actor;
	String lead_actress;
	String genre;
	
	
	public Movie_Details(String mov_Name, String lead_actor,String lead_actress, String genre) 
	{
	
		this.mov_Name = mov_Name;
		this.lead_actor = lead_actor;
		this.lead_actress = lead_actress;
		this.genre = genre;
	}

    //GETTERS...
	
	public String getMov_Name() {
		return mov_Name;
	}


	public String getLead_actor() {
		return lead_actor;
	}


	public String getLead_actress() {
		return lead_actress;
	}


	public String getGenre() {
		return genre;
	}

    // SETTERS..
	
	public void setMov_Name(String mov_Name) {
		this.mov_Name = mov_Name;
	}


	public void setLead_actor(String lead_actor) {
		this.lead_actor = lead_actor;
	}


	public void setLead_actress(String lead_actress) {
		this.lead_actress = lead_actress;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	
}
