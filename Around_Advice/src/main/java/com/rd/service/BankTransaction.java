package com.rd.service;

import org.springframework.stereotype.Component;

@Component
public class BankTransaction {

	//writing bussiness mthods
	public void deposit(int amount,int acnum) {
		System.out.println(amount+" is deposited in account number "+acnum);
		}
	
	public void withdraw(int amount,int acnum) {
		System.out.println(amount+" is withdraw from account number "+acnum);
		}
}
