package com.manish.sql;

public class MyDate {
	
	int dd;
	int mm;
	int yyyy;
	
	public MyDate(int dd, int mm, int yyyy)
	{
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
    
	//GETTERS..
	
	public int getDd() {
		return dd;
	}

	public int getMm() {
		return mm;
	}

	public int getYyyy() {
		return yyyy;
	}
	
	//SETTERS..

	public void setDd(int dd) {
		this.dd = dd;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public void setYyyy(int yyyy) {
		this.yyyy = yyyy;
	}

	@Override
	public String toString() {
		return "MyDate [dd=" + dd + ", mm=" + mm + ", yyyy=" + yyyy + "]";
	}
	
}
