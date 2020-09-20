package com.pankaj.controller;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.pankaj.bean.Helloworld;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext res = new ClassPathXmlApplicationContext("com/pankaj/cfgs/applicationContext.xml");
		Helloworld bean = (Helloworld) res.getBean(Helloworld.class);
		
		bean.printHello();
	}
}