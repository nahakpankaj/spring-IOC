package com.pankaj.bean;

import java.util.Date;

public class Dept {
	private int deptNo;
	private String name;
	private Date dop;

	public Dept(int deptNo, String name, Date dop) {
		System.out.println("Dept.Dept()");
		this.deptNo = deptNo;
		this.name = name;
		this.dop = dop;
	}

	@Override
	public String toString() {
		return "Dept [deptNo=" + deptNo + ", name=" + name + ", dop=" + dop + "]";
	}
}
