package com.pankaj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pankaj.bean.Emp;

public class ClientTest {

	public static void main(String[] args) {
		ApplicationContext ctx= new FileSystemXmlApplicationContext("src/com/pankaj/cfgs/applicationContext.xml");
		//get bean
		Emp emp = ctx.getBean("emp", Emp.class);
		System.out.println(emp);
	}

}
