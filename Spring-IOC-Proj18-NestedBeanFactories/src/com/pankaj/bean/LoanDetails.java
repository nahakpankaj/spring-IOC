package com.pankaj.bean;

public class LoanDetails {
	private int londId;
	private String loadType;
	private String customer;

	public LoanDetails() {
		System.out.println("LoanDetails.LoanDetails()");
	}

	public int getLondId() {
		return londId;
	}

	public void setLondId(int londId) {
		this.londId = londId;
	}

	public String getLoadType() {
		return loadType;
	}

	public void setLoadType(String loadType) {
		this.loadType = loadType;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "LoanDetails [londId=" + londId + ", loadType=" + loadType + ", customer=" + customer + "]";
	}
}
