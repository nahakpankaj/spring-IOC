package com.pankaj.bean;

public class A {
	private static final A obj = new A();

	public A() {
		System.out.println("A - Constructor :: 0 - param");
	}

	public static A getObj() {
		return obj;
	}

	public void msg() {
		System.out.println("Hello User.");
	}
}
