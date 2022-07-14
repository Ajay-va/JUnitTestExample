package com.app.ajay.service;

public class Printer {

	public static Printer INSTANCE=new Printer();
	private Printer() {
		
	}
	
	public static Printer getInstance() {
		return INSTANCE;
	}
	
}
