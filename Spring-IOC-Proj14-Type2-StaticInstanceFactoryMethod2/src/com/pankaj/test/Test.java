package com.pankaj.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.pankaj.bean.A;
import com.pankaj.bean.Printable;

public class Test {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/com/pankaj/cfgs/applicationContext.xml"));
		Printable p = factory.getBean("p", Printable.class);
		p.print();
	}

}
