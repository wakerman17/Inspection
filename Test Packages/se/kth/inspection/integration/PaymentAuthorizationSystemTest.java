package se.kth.inspection.integration;

import static org.junit.Assert.*;

import org.junit.Test;

import se.kth.inspection.util.CreditCardInformation;

public class PaymentAuthorizationSystemTest {
	int pin = 1234;
	int number = 5678;
	String holder = "William";
	String expireDate = "02/20";
	int cvc = 123;
	CreditCardInformation creditCardInformation = new CreditCardInformation(pin, number, holder, expireDate, cvc);
	PaymentAuthorizationSystem paymentAuthorizationSystem = new PaymentAuthorizationSystem();

	@Test
	public void testCardRequest () {
		boolean approval = paymentAuthorizationSystem.cardRequest(creditCardInformation);
		assertEquals("Don't return true", true, approval);
	}
}
