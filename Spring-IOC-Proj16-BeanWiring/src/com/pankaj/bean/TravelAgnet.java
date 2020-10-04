package com.pankaj.bean;

public class TravelAgnet {
	private TourPlan tp;

	public TravelAgnet() {
		System.out.println("TravelAgnet.TravelAgnet()");
	}

	public TravelAgnet(TourPlan tp) {
		System.out.println("TravelAgnet.TravelAgnet()-1");
		this.tp = tp;
	}

	// setter
	public void setTp(TourPlan tp) {
		this.tp = tp;
	}

//toString
	@Override
	public String toString() {
		return "TravelAgnet [tp=" + tp + "]";
	}
}
