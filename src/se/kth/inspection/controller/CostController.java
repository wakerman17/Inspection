package se.kth.inspection.controller;

import se.kth.inspection.integration.DatabaseManager;
import se.kth.inspection.integration.InspectionAmount;
import se.kth.inspection.integration.InvalidRegistrationNumberException;
import se.kth.inspection.integration.Vehicle;
import se.kth.inspection.model.Amount;
import se.kth.inspection.model.CostManager;

/**
 * Controller which takes care of the cost.
 *
 */
public class CostController {
	
	private DatabaseManager databaseManager;
	private CostManager costManager;
	private InspectionAmount inspectionAmount;
	
	/**
	 * Creates a new instance.
	 *
	 * @param databaseManager Interface to databaseManager.
	 * @param costManager Interface to costManager.
	 */
	public CostController (DatabaseManager databasemManager, CostManager costManager) {
		this.databaseManager = databasemManager;
		this.costManager = costManager;
	}
	
	/**
	 * Handles calls to calculate cost of inspection.
	 *
	 * @param vehicle Information about the vehicle.
	 * @return Cost of the inspection
	 */
	public Amount whatToPay (Vehicle vehicle) throws InvalidRegistrationNumberException {
		inspectionAmount = databaseManager.howManyInspections(vehicle);
		return costManager.whatToPay(inspectionAmount);
	}
}
