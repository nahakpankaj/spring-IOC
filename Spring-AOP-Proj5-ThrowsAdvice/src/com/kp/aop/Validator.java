package com.kp.aop;

public class Validator {
	public void validate(int age) throws Exception{
		if(age<18) {
			throw new ArithmeticException("Not a vaild Age for Vote...");
		}
		else {
			System.out.println("Ypu can Vote & Please Do Vote...");
		}
	}
}
