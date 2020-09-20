package com.pankaj.bean;

import java.util.Date;

public class Employee {
	private Date date;
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	private int empid;
	private String empname;
	private String desg;
	private float salary;
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
//logic
	public void print() {
		System.out.println("Date ::"+date);
		System.out.println("Employees Details :: id=> "+empid+" name=> "+empname+" desgination=> "+desg+ " & Salary=>"+salary);
	}
}
