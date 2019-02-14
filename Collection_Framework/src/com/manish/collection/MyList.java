package com.manish.collection;

import java.util.ArrayList;

public class MyList<type>

{
	
	public type display;
	
	
ArrayList<type> arr = new ArrayList<>();
	
	public void getAdd()
	{
		arr.add(display);
	}
	
	public ArrayList<type> getArr()
	{
		return arr;
	}


	
	public void add(type display)
	{
		this.display= display;
	}
	
	public type get()
	{
		return display;
	}

	
}


