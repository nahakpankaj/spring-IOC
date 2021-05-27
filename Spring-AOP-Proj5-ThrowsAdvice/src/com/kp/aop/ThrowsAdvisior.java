package com.kp.aop;

import org.springframework.aop.ThrowsAdvice;

public class ThrowsAdvisior implements ThrowsAdvice {
	public void afterThrowing(Exception ex) {
		System.out.println("additional concern if exception occurs");
	}
}
