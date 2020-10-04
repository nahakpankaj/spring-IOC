package com.pankaj.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.pankaj.bean.A;

public class Test {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/com/pankaj/cfgs/applicationContext.xml"));
		A a = factory.getBean("a", A.class);
		a.msg();
	}

}
