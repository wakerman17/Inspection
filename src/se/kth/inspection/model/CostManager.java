package se.kth.inspection.model;

import se.kth.inspection.util.Amount;
import se.kth.inspection.util.InspectionAmount;

/**
 * Takes care of calculating and giving the cost of the inspection
 *
 */
public class CostManager {
	
	private int costPrimitive;
	private int costPerPart = 200;
	private Amount objectCost;
	
	/**
	 * Calculates the cost to pay
	 * 
	 * @param inspectionAmount How many parts to inspect
	 * @return The cost to pay
	 */
	public Amount whatToPay (InspectionAmount inspectionAmount) {
		return whatToPayprivate(inspectionAmount);
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
		return objectCost;
	}
	
	
	private Amount whatToPayprivate (InspectionAmount inspectionAmount) {
		int inspectionAmountPrimitive = inspectionAmount.getPrimitiveInspectionAmount();
		costPrimitive = inspectionAmountPrimitive * costPerPart;
		objectCost = new Amount(costPrimitive);
		return objectCost;
	}
	
	private Amount getLatestCostPrivate (boolean approval) {
		if (approval == true)
			return objectCost;
		else
			return null;
		
	}
}
