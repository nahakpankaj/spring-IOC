package com.pankaj.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.pankaj.bean.Motor;

public class ClientTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		Motor bean = null;
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/pankaj/cfgs/applicationContext.xml");

		bean = factory.getBean("motor1", Motor.class);
		bean.move();
		System.out.println("Motor condition - " +bean.hashCode());
	}
}
