package com.pankaj.bean;

import java.util.Date;

public class Helloworld {

	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	private Date date;
	
	//logic
	public void printHello() {
		System.out.println("Hello World ::: I am "+name+" & Time is ---->"+date);
	}
}
