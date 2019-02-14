package com.manish.sql;

public class Department 
{
	
	int deptno;
	String dname;
	String location;
	
	
	public Department(int deptno, String dname, String location) 
	{
		this.deptno = deptno;
		this.dname = dname;
		this.location = location;
	}
   
	//GETTERS..

	public int getDeptno() {
		return deptno;
	}


	public String getDname() {
		return dname;
	}


	public String getLocation() {
		return location;
	}
	
	//SETTERS..

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", dname=" + dname
				+ ", location=" + location + "]";
	}
	
	
	
	
}
