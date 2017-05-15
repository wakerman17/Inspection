package se.kth.inspection.controller;

import se.kth.inspection.integration.DatabaseManager;
import se.kth.inspection.integration.Inspect;
import se.kth.inspection.integration.Vehicle;

/**
 * Controller which handles what to inspect.
 *
 */
public class InspectionController {
	
	private DatabaseManager databaseManager;
	
	/**
	 * Creates a new instance.
	 * 
	 * @param databasemManager Interface to databasemManager.
	 */
	public InspectionController (DatabaseManager databasemManager) {
		this.databaseManager = databasemManager;
	}
	
	/**
	 * Gives what should be inspected.
	 * 
	 * @param vehicle Information about the vehicle.
	 * @return What the inspector should inspect.
	 */
	public Inspect whatToInspect (Vehicle vehicle) {
		return databaseManager.whatToInspect(vehicle);
	}
}
