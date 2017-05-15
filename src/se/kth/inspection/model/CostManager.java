package se.kth.inspection.model;

import se.kth.inspection.integration.InspectionAmount;

/**
 * Takes care of calculating and giving the cost of the inspection.
 *
 */
public class CostManager {
	
	private int costPrimitive;
	private int costPerPart = 200;
	private Amount cost;
	
	/**
	 * Calculates the cost to pay.
	 * 
	 * @param inspectionAmount How many parts to inspect.
	 * @return The cost to pay.
	 */
	public Amount whatToPay (InspectionAmount inspectionAmount) {
		return whatToPayPrivate(inspectionAmount);
	}
	
	/**
	 * Gives the cost that latest were payed for this inspection.
	 * 
	 * @param approval Information if the payment authorization system is Ok or not.
	 * @return The latest cost.
	 */
	public Amount getLatestCost (boolean approval) {
		return getLatestCostPrivate(approval);
	}
	
	/**
	 * Gives the cost that latest were payed for this inspection but without <code>approval</code>, because thats already checked.
	 * 
	 * @return The latest cost.
	 */
	public Amount getCost () {
		cost = new Amount(costPrimitive);
		return cost;
	}
	
	
	private Amount whatToPayPrivate (InspectionAmount inspectionAmount) {
			int inspectionAmountPrimitive = inspectionAmount.getPrimitiveInspectionAmount();
			costPrimitive = inspectionAmountPrimitive * costPerPart;
			cost = new Amount(costPrimitive);
			return cost;
	}
	
	private Amount getLatestCostPrivate (boolean approval) {
		if (approval == true) {
			cost = new Amount(costPrimitive);
			return cost;
		}
		else
			return null;
	}
}
