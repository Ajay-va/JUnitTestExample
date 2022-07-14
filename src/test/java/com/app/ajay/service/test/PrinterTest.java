package com.app.ajay.service.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.app.ajay.service.Printer;

/*
 * Test cases written by Ajay Varma
 * 
 * 
 */


public class PrinterTest {

	@Test
	public void testPrinter() {
		Printer p1= Printer.getInstance();
		Printer p2=Printer.getInstance();
		assertSame(p1, p2);
		assertNotNull(p1);
		assertNotNull(p2);
		if(p1==null||p2==null)
			fail("p1,p2 both are not null");
	}
}