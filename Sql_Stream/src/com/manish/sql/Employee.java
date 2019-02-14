package com.manish.sql;

public class Employee {
	
	int empno;
	String ename; 
	String job;
	int mgr;
	MyDate hiredate;
	int sal;
	int comm;
	int deptno;
	
	
	public Employee(int empno, String ename, String job, int mgr,
			MyDate hiredate, int sal, int comm, int deptno) 
	{
	
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}

	//GETTERS..

	public int getEmpno() {
		return empno;
	}


	public String getEname() {
		return ename;
	}


	public String getJob() {
		return job;
	}


	public int getMgr() {
		return mgr;
	}


	public MyDate getHiredate() {
		return hiredate;
	}


	public int getSal() {
		return sal;
	}


	public int getComm() {
		return comm;
	}


	public int getDeptno() {
		return deptno;
	}
	
	//SETTERS..

	public void setEmpno(int empno) {
		this.empno = empno;
	}

    public void setEname(String ename) {
		this.ename = ename;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public void setHiredate(MyDate hiredate) {
		this.hiredate = hiredate;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", job=" + job
				+ ", mgr=" + mgr + ", hiredate=" + hiredate + ", sal=" + sal
				+ ", comm=" + comm + ", deptno=" + deptno + "]";
	}
	
	
	
	
	

}
