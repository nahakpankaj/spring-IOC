package com.pankaj.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.pankaj.bean.TravelAgnet;

public class TourTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/com/pankaj/cfgs/applicationContext.xml"));
		TravelAgnet ta = (TravelAgnet) factory.getBean("target");
		System.out.println(ta);
	}

}
