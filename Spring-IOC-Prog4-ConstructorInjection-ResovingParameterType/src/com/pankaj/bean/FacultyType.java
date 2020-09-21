package com.pankaj.bean;

public class FacultyType {
	private int id;
	private String fname, subject;

	public FacultyType(int id, String fname, String subject) {
		System.out.println("Faculty Type :: Constructor");
		this.id = id;
		this.fname = fname;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "FacultyType [id=" + id + ", name=" + fname + ", subject=" + subject + "]";
	}
}
