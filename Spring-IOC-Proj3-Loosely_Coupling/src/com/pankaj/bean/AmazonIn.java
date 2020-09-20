package com.pankaj.bean;

import java.util.Random;

public class AmazonIn {

	private Courier courier;

	// constructor
	public AmazonIn() {
		System.out.println("AMAZON INDIA... A to Z - Service & Product you can get here...");
	}

//Setter Injection
	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	public String purchase(String item[]) {
		// generate Random Id for Item
		Random random = new Random();
		int orderId = random.nextInt(500000);
		// deliver Message
		String itemStatus = courier.deilver(orderId);
		return itemStatus + "  Total BIll Amount for your order is => " + orderId + " is 8000";
	}
}
