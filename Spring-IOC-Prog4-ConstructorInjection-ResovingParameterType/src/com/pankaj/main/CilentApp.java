package com.pankaj.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pankaj.bean.FacultyType;
import com.pankaj.bean.MarksType;
import com.pankaj.bean.StudentType;

public class CilentApp {
	public static void main(String[] args) {
		BeanFactory factory= null;
		StudentType stdType = null;
		MarksType markType = null;
		FacultyType facultyType = null;

		//IOC container Creation
		factory = new XmlBeanFactory(new ClassPathResource("com/pankaj/cfgs/applicationContext.xml"));
		
		//get Bean
		stdType = factory.getBean("std", StudentType.class);
		markType= factory.getBean("mark", MarksType.class);
		facultyType = factory.getBean("facul", FacultyType.class);
		
		//console
		System.out.println("Student Details => "+stdType);
		System.out.println("Marks Details => "+markType);
		System.out.println("Faculty Details => "+facultyType);
	}
}
