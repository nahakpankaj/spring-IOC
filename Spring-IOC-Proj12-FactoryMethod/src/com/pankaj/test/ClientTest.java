package com.pankaj.test;

import java.util.Calendar;
import java.util.Properties;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class ClientTest {

	public static void main(String[] args) {
		BeanFactory factory= null;
		
		factory = new XmlBeanFactory(new FileSystemResource("src/com/pankaj/cfgs/applicationContext.xml"));
		Class com1= factory.getBean("com1", Class.class);
		System.out.println("Com1 data "+com1+"com1 class name "+com1.getClass());
		//get bean
		Properties prop = factory.getBean("props",Properties.class);
		System.out.println("props data "+prop+ " props class name "+prop.getClass());
		Calendar cale = factory.getBean("com2", Calendar.class);
		System.out.println("com2 data "+cale+" com2 class  name "+cale.getClass());
		
		String str1 = factory.getBean("ind1", String.class);
		System.out.println("ind 1 data "+str1+" ind1 class name "+str1.getClass());
		
		String str2 = factory.getBean("ind2", String.class);
		System.out.println("ind 2 data "+str2+" ind2 class name "+str2.getClass());
		
		String str3 = factory.getBean("sb1", String.class);
		System.out.println("ind 3 data "+str3+" ind3 class name "+str3.getClass());
	}

}
