package com.kp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.kp.aop.Validator;

public class Test {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("com/kp/cfgs/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Validator validator = factory.getBean("proxy", Validator.class);
		try {
			validator.validate(32);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
