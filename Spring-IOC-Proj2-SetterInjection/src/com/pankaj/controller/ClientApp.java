package com.pankaj.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.pankaj.bean.Employee;

public class ClientApp {

	public static void main(String[] args) {
		
		//Locate Spring Bean Configuration
		FileSystemResource res = new FileSystemResource("src/com/pankaj/cfgs/applicationContext.xml");
		//Activate Bean Factory Container
		BeanFactory factory =  new XmlBeanFactory(res);
		//Get Bean Class Object
		Employee bean = factory.getBean("emp",Employee.class);
	
		System.out.println("<==+:: Indian Paisa Leauge :: +==>");
		bean.print();
	}
}