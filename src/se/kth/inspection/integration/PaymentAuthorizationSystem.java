package se.kth.inspection.integration;

import se.kth.inspection.model.CreditCardInformation;

/**
 * A system which tell if it's ok to use the credit car to pay
 *
 */
public class PaymentAuthorizationSystem {
	
	/**
	 * A request if the credit card is Ok or not.
	 * 
	 * @param creditCardInformation The information given about the credit card
	 * @return A <code>boolenan</code> which is always <code>true</code>
	 */
	public boolean cardRequest (CreditCardInformation creditCardInformation) {
		return true;
	}
}
