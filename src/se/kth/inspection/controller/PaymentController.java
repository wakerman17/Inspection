package se.kth.inspection.controller;

import se.kth.inspection.model.CostManager;
import se.kth.inspection.integration.Printer;
import se.kth.inspection.util.Amount;
import se.kth.inspection.util.CreditCardInformation;
import se.kth.inspection.util.Receipt;
import se.kth.inspection.integration.PaymentAuthorizationSystem;

/**
 * Controller which handles the payment.
 *
 */
public class PaymentController {
	
	private PaymentAuthorizationSystem paymentAuthorizationSystem;
	private CostManager costManager;
	private Printer printer;
	
	/**
     * Creates a new instance.
     *
     * @param costManager Interface to costManager.
     * @param printer Interface to printer.
     * @param paymentAuthorizationSystem Interface to paymentAuthorizationSystem.
     */
	public PaymentController (PaymentAuthorizationSystem paymentAuthorizationSystem, CostManager costManager, Printer printer) {
		this.costManager = costManager;
		this.printer = printer;
		this.paymentAuthorizationSystem = paymentAuthorizationSystem;
	}
	
	/**
	 * Handles calls to pay for the cost.
	 * 
	 * @param creditCardInformation The information given about the credit card.
	 */
	public void doPayment (CreditCardInformation creditCardInformation) {
		doPaymentPrivate(creditCardInformation);
	}

	
	private void doPaymentPrivate (CreditCardInformation creditCardInformation) {
		boolean approval = paymentAuthorizationSystem.cardRequest(creditCardInformation);
		Amount cost = costManager.getLatestCost(approval);
		Receipt receipt = new Receipt(cost, costManager, creditCardInformation);
		printer.print(receipt);
	}
}
