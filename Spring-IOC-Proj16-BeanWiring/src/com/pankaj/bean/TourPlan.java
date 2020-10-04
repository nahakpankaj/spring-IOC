package com.pankaj.bean;

import java.util.Arrays;

public class TourPlan {
	private String[] places;

	// setter
	public void setPlaces(String[] places) {
		this.places = places;
	}

	// toString
	@Override
	public String toString() {
		return "TourPlan [places=" + Arrays.toString(places) + "]";
	}
}
