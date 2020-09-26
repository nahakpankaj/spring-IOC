package com.pankaj.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.pankaj.bean.Customer;

public class ClientApp {
	public static void main(String[] args) {
		BeanFactory factory = null;
		Customer cust = null;

		factory = new XmlBeanFactory(new FileSystemResource("src/com/pankaj/cfgs/applicationContext.xml"));
		cust = factory.getBean("customerbean", Customer.class);
		System.out.println("Customer Details - " + cust);
	}
}
