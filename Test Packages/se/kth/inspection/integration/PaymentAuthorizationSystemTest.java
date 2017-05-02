package se.kth.inspection.integration;

import static org.junit.Assert.*;

import org.junit.Test;

import se.kth.inspection.util.CreditCardInformation;

public class PaymentAuthorizationSystemTest {
	private int pin = 1234;
	private int number = 5678;
	private String holder = "William";
	private String expireDate = "02/20";
	private int cvc = 123;
	private CreditCardInformation creditCardInformation = new CreditCardInformation(pin, number, holder, expireDate, cvc);
	private PaymentAuthorizationSystem paymentAuthorizationSystem = new PaymentAuthorizationSystem();

	@Test
	public void testCardRequest () {
		boolean approval = paymentAuthorizationSystem.cardRequest(creditCardInformation);
		assertEquals("Don't return true", true, approval);
	}
}