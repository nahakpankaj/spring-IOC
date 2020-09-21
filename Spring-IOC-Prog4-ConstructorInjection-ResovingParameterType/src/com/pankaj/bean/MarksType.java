package com.pankaj.bean;

public class MarksType {
	private int m1, m2, m3, m4;

	public MarksType(int m1, int m2, int m3, int m4) {
		System.out.println("Mark Type :: Constructor");
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
	}

	@Override
	public String toString() {
		return "MarksType [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", m4=" + m4 + "]";
	}
}
