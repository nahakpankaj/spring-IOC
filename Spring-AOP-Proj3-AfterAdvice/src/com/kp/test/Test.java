package com.kp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.kp.aop.A;

public class Test {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("com/kp/cfgs/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
		A a = factory.getBean("proxy", A.class);
		a.m();
	}
}