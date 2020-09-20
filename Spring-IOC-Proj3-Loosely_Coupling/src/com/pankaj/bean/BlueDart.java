package com.pankaj.bean;

public class BlueDart implements Courier {
	// Constructor
	public BlueDart() {
		System.out.println("BlueDart Courier Services Welcomes You..!!!");
	}

	@Override
	public String deilver(int orderId) {
		return "BlueDart Courier Services Always With you.. we ready with your product.. Stay Home. Stay Save.."
				+ orderId;
	}
}
