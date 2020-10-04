package com.pankaj.bean;

public class PrintableFactory {
	public Printable getPrintable() {
		return new B();
		// return new A();
	}
}
