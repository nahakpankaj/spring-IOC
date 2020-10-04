package com.pankaj.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Motor {
	private String beanId;

	public Motor() {
		System.out.println("motor constuctor");
	}

	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	public void move() {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/com/pankaj/cfgs/applicationContext.xml"));
		Engine engine = factory.getBean(beanId, Engine.class);
		engine.start();
		System.out.println("motor start for supply.");
	}
}