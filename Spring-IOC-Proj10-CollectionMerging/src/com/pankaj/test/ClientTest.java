package com.pankaj.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.pankaj.bean.CollectionMerging;

public class ClientTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		CollectionMerging bean = null;
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/pankaj/cfgs/applicationContext.xml");

		bean = factory.getBean("EEE", CollectionMerging.class);
		System.out.println("Branch EEE - " +bean);
	}
}
