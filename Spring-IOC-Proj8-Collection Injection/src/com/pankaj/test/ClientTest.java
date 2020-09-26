package com.pankaj.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.pankaj.bean.JavaCollections;

public class ClientTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		JavaCollections javacollections = null;
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/pankaj/cfgs/applicationContext.xml");

		javacollections = factory.getBean("collections", JavaCollections.class);

		javacollections.getList();
		javacollections.getSet();
		javacollections.getMap();
		javacollections.getProps();
	}
}
