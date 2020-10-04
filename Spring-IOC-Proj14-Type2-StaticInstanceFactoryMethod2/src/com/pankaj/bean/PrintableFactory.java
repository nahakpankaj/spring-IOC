package com.pankaj.bean;

public class PrintableFactory {
	public static Printable getPrintable() {
		//return new B();
		 return new A();
	}
}
