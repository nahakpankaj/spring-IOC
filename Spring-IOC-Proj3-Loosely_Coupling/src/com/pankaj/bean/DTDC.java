package com.pankaj.bean;

public class DTDC implements Courier {
	//constructor
	public DTDC() {
		System.out.println("DTDC Courier Services Welcomes You..!!! Always Fast.. ");
	}
	@Override
	public String deilver(int orderId) {
		return "DTDC Courier Services Always Fast.. we ready with your product.. Stay Home & Save.."
				+ orderId;
	}

}
