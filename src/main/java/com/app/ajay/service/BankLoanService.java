package com.app.ajay.service;

public class BankLoanService {

	public int  simpleAmountInterest(int amount,int interest,int time) {
		
		System.out.println("time start....!");
		
		if(amount<=0||interest<=0||time<=0) 
			 throw new IllegalArgumentException();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("----------");
		}
		return amount*interest*time/100+amount;
	}
	
	
	public String  sayHello(String user) {
		
		return "hello"+user;
		
	}
	
	public boolean  isEmpty(String data) {
		return data.isBlank();
	}
	
	
	public boolean isOdd(int num) {
		if(num%2==0) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
}