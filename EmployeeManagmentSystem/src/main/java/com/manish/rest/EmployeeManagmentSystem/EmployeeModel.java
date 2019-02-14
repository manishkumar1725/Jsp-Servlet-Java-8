package com.manish.rest.EmployeeManagmentSystem;

public class EmployeeModel 
{
	String employeeName;
	String employeeDepartment;
	String employeeDesignation;
	double employeeSalary;
	
	int employeeId;
	
	public EmployeeModel(String employeeName, String employeeDepartment,String employeeDesignation, double employeeSalary)
	{
		
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
		this.employeeDesignation = employeeDesignation;
		this.employeeSalary = employeeSalary;
	}
	
	

	public int getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}



	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}
	
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}



	@Override
	public String toString() {
		return "EmployeeModel [employeeName=" + employeeName
				+ ", employeeDepartment=" + employeeDepartment
				+ ", employeeDesignation=" + employeeDesignation
				+ ", employeeSalary=" + employeeSalary + ", employeeId="
				+ employeeId + "]";
	}
	
	
	
	
}
