package com.manish.lambda;

public class Map_KeyValue {
	
	
	String name;
	int id;
	
	
	public Map_KeyValue(String name, int id) 
	{
        this.name = name;
		this.id = id;
	}

    // GETTERS...
	
	public String getName() {
		return name;
	}


	public int getId() {
		return id;
	}
	
    //SETTERS..
	
	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() 
	{
		return "Map_KeyValue [name=" + name + ", id=" + id + "]";
	}
	
	
}
