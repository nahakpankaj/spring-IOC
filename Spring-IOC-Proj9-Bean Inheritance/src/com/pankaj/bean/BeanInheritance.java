package com.pankaj.bean;

public class BeanInheritance {
	
	private String brand;
	private String model;
	private String color;
	private int cc;
	private float milage;
	private double price;

	// Setter and Getter
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public float getMilage() {
		return milage;
	}

	public void setMilage(float milage) {
		this.milage = milage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BeanIneritance [brand=" + brand + ", model=" + model + ", color=" + color + ", cc=" + cc + ", milage="
				+ milage + ", price=" + price + "]";
	}
}
