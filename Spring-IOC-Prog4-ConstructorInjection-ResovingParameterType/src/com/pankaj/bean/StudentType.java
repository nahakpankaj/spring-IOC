package com.pankaj.bean;

public class StudentType {
	private int std_Id;
	private String std_name;
	private float average;

	public StudentType(int std_Id, String std_name, float average) {
		System.out.println("Student Type :: Constructor");
		this.std_Id = std_Id;
		this.std_name = std_name;
		this.average = average;
	}

	@Override
	public String toString() {
		return "StudentType [std_Id=" + std_Id + ", std_name=" + std_name + ", average=" + average + "]";
	}
}
