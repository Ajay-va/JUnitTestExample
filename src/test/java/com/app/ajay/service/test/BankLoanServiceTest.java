package com.app.ajay.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.app.ajay.service.BankLoanService;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class BankLoanServiceTest {
	private  BankLoanService b=new BankLoanService();
	@BeforeEach
	public void setUp() {
		 b=new BankLoanService();
	}
	@Test
	@Order(-2)
	@DisplayName("ajay")
	@Tag("uat")
	public void simpleAmountInterestTest() {
		 b=new BankLoanService();
		int actual =b.simpleAmountInterest(100000, 2, 12);
		int expected=124000;
		assertEquals(actual, expected);
	}
	@Test
	@Tag("prod")
	@Order(-3)
	@DisplayName("a")
	public void simpleAmountInterestWithExceptionTest() {
		 b=new BankLoanService();
		assertThrows(IllegalArgumentException.class,()->{
			b.simpleAmountInterest(0, 0, 0);} );
	}
	@Test
	@Order(1)
	@Tag("dev")
	@DisplayName("abc")
	public void simpleAmountInterestWithDurationTest() {
		 b=new BankLoanService();
		assertTimeout(Duration.ofMillis(1000),()->{
			b.simpleAmountInterest(0, 0, 0);
		});
	}
	@AfterEach
	public void setStop() {
		b=null;
	}
	@Order(-10)
	@ParameterizedTest
	@ValueSource(ints={1,3,5,32,8,6,3,9})
	public void isOddTest(int num) {
//		boolean flag=b.isOdd(num);
		assertTrue(b.isOdd(num));
	}
	@Order(-11)
	@ParameterizedTest
	@ValueSource(strings= {"ajay","vijay"})
	public void sayHelloTest(String user) {
		String s=b.sayHello(user);
		assertEquals("hello"+user, b.sayHello(user));
	}
	@ParameterizedTest
//	@ValueSource(strings= {"","  ","d"})
	@NullSource
	public void isAEmptyString(String data) {
		assertTrue(b.isEmpty(data));
	}
}