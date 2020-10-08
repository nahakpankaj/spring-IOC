package com.pankaj.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.pankaj.bean.BankLoanApprover;

public class ClientTest {

	public static void main(String[] args) {
		// parent IOC container
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/com/pankaj/cfgs/loanBeans.xml"));
		// chile IOC container
		BeanFactory factory2 = new XmlBeanFactory(new FileSystemResource("src/com/pankaj/cfgs/approvalBeans.xml"),factory);
		// get bean
		BankLoanApprover bla = factory2.getBean("approver", BankLoanApprover.class);
		System.out.println(bla.approveLoan());
	}

}
