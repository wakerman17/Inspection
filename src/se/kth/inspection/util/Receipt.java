package se.kth.inspection.util;

import se.kth.inspection.model.CostManager;

/**
 * A receipt of a inspection.
 * 
 */
public class Receipt {
	
	private Amount cost;
	private CostManager costManager;
	private CreditCardInformation creditCardInformation;
	
    /**
     * Creates a new instance.
     *
     * @param cost The amount of cost for the inspection.
     * @param costManager The interface of costManager.
     * @param creditCardInformation The interface of creditCardInformation.
     */
	public Receipt (Amount cost, CostManager costManager, CreditCardInformation creditCardInformation) {
		this.cost = cost;
		this.costManager = costManager;
		this.creditCardInformation = creditCardInformation;
	}
	
	/**
	 * Creates text which is written in the <code>System.out</code>.
	 * 
	 * @return The <code>String</code> of the <code>receipt</code>.
	 */
	public String receiptString () {
		return receiptStringPrivate();
	}
	
	private String receiptStringPrivate () {
		StringBuilder receiptBuilder = new StringBuilder();
		
		receiptBuilder.append("\nVehicle Inspection Receipt\n");
		cost = costManager.getCost();
		
		receiptBuilder.append("Cost: " + cost + "\n");
		String holder = creditCardInformation.getHolder();
		
		receiptBuilder.append("Holder of vehicle: " + holder + "\t\t\n");
		return receiptBuilder.toString();
	}
}
