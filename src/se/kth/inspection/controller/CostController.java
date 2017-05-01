package se.kth.inspection.controller;

import se.kth.inspection.util.Amount;
import se.kth.inspection.util.InspectionAmount;
import se.kth.inspection.util.Vehicle;
import se.kth.inspection.integration.DatabaseManager;
import se.kth.inspection.model.CostManager;

/**
 * Controller which takes care of the cost.
 *
 */
public class CostController {
	
	private DatabaseManager databaseManager;
	private CostManager costManager;
	private InspectionAmount inspectionAmount;
	private Amount cost;
	
	/**
     * Creates a new instance.
     *
     * @param databaseManager Interface to databaseManager.
     * @param costManager Interface to costManager.
	 */
	public CostController (DatabaseManager databasemManager, CostManager costManager){
		this.databaseManager = databasemManager;
		this.costManager = costManager;
	}
	
	/**
     * Handles calls to calculate cost of inspection.
     *
     * @param vehicle Information about the vehicle.
     * @return Cost of the inspection
	 */
	public Amount whatToPay (Vehicle vehicle) {
		return whatToPayPrivate(vehicle);
	}
	
	
	private Amount whatToPayPrivate (Vehicle vehicle) {
		inspectionAmount = databaseManager.howManyInspections(vehicle);
		cost = costManager.whatToPay(inspectionAmount);
		return cost;
	}
}
