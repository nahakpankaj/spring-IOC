package com.pankaj.controller;

import java.nio.file.FileSystemAlreadyExistsException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.pankaj.bean.AmazonIn;

public class AmazonINStore {
	public static void main(String[] args) {

		// create BeanFactory Object to Create IOC Container
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/com/pankaj/cfgs/applicationContext.xml"));
		// get Bean Object
		AmazonIn amazonInd = factory.getBean("amazon", AmazonIn.class);
		String bill = amazonInd.purchase(new String[] { "TAB", "IPAD", "AIR BOOK", "Headset" });
		System.out.println("your Bill Please pay.   "+bill);
	}
}
