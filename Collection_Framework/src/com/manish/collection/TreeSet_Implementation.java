package com.manish.collection;
import java.util.*;
import java.util.Comparator;

public class TreeSet_Implementation {
	
	
	public String name;
	public int weight;
	public int height;
	
	public TreeSet_Implementation(String name, int weight, int height) {
		
		this.name = name;
		this.weight = weight;
		this.height = height;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int weight) {
		this.weight = weight;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return "[NAME=" + name + ", WEIGHT=" + weight
				+ ", HEIGHT=" + height + "]";
	}
	

 }

class WeightComp implements Comparator<TreeSet_Implementation>{
	 
    
	public int compare(TreeSet_Implementation person1, TreeSet_Implementation person2) {
		
		if(person1.getWeight() > person2.getWeight())
		{
			return 1;
		}
		else if(person1.getWeight()== person2.getWeight())
		{
			if(person1.getHeight() > person2.getHeight())
			{
				return 1;
		    }
		else
			return -1;
		}
		else 
			return -1;
	}

	

}


 
