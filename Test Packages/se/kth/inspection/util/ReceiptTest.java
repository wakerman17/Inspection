package se.kth.inspection.util;

import static org.junit.Assert.*;
import org.junit.Test;
import se.kth.inspection.model.CostManager;
import se.kth.inspection.util.CreditCardInformation;
import se.kth.inspection.util.Amount;

public class ReceiptTest {
	
	@Test
	public void testReceiptString () {
		int pin = 1234;
		int number = 5678;
		String holder = "William";
		String expireDate = "02/20";
		int cvc = 123;
		
		CreditCardInformation creditCardInformation = new CreditCardInformation(pin, number, holder, expireDate, cvc);
		
		Amount cost = new Amount(0);
		CostManager costManager = new CostManager();
		
		Receipt instance = new Receipt(cost, costManager, creditCardInformation);
		
		String expResult = 		  "\nVehicle Inspection Receipt"
				         		+ "\nCost: " + cost 
				         		+ "\nHolder of vehicle: " + holder + "\n";
		String result = instance.receiptString();
		
		System.out.println("expResult:\n" + expResult + "result:\n" + result);
		assertTrue("Wrong output",result.contains(expResult));
	}
}