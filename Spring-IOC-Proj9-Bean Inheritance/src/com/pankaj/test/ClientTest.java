package com.pankaj.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.pankaj.bean.BeanInheritance;

public class ClientTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		BeanInheritance bean = null;
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/pankaj/cfgs/applicationContext.xml");

		bean = factory.getBean("bike2", BeanInheritance.class);
		System.out.println("Bike 2 - " +bean);
	}
}
