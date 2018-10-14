package com.rd.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rd.service.BankTransaction;

public class ClientApp {

	public static void main(String[] args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/rd/cfgs/applicationcontext.xml");
		BankTransaction bnk=ctx.getBean(BankTransaction.class);
		//calling bussiness mthods
		bnk.deposit(1000, 1);
		System.out.println("============================================================");
		bnk.withdraw(150, 2);
		
		((AbstractApplicationContext) ctx).close();
	}

}
