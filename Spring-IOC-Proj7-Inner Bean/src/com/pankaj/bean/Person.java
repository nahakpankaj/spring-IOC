package com.pankaj.bean;

public class Person {
	private String name;
	private String adderss;
	private double bill;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdderss() {
		return adderss;
	}

	public void setAdderss(String adderss) {
		this.adderss = adderss;
	}

	public double getBill() {
		return bill;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", adderss=" + adderss + ", bill=" + bill + "]";
	}
}
