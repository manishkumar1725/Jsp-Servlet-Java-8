package com.suraj.restapi.Assignment5;

public class Employeeinfo {

	String empName,empDepartment,empDesignation;
	double empSalary;
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	public Employeeinfo(String empName, String empDepartment,
			String empDesignation, double empSalary) {
		
		this.empName = empName;
		this.empDepartment = empDepartment;
		this.empDesignation = empDesignation;
		this.empSalary = empSalary;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employeeinfo [empName=" + empName + ", empDepartment="
				+ empDepartment + ", empDesignation=" + empDesignation
				+ ", empSalary=" + empSalary + "]";
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the empDepartment
	 */
	public String getEmpDepartment() {
		return empDepartment;
	}
	/**
	 * @param empDepartment the empDepartment to set
	 */
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	/**
	 * @return the empDesignation
	 */
	public String getEmpDesignation() {
		return empDesignation;
	}
	/**
	 * @param empDesignation the empDesignation to set
	 */
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	/**
	 * @return the empSalary
	 */
	public double getEmpSalary() {
		return empSalary;
	}
	/**
	 * @param empSalary the empSalary to set
	 */
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
}
