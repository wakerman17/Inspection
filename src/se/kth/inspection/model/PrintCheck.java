package se.kth.inspection.model;

import se.kth.inspection.integration.DatabaseManager;
import se.kth.inspection.integration.Printer;
import se.kth.inspection.util.Result;
import se.kth.inspection.util.Vehicle;

/**
 * Checks if the printer should print the results or save results.
 *
 */
public class PrintCheck {
	
	private Result[] results;
	
	/**
	 * Save the result of the inspection, if all inspections are made call the printer.
	 * 
	 * @param result The result of the inspection.
	 * @param vehicle Information about the vehicle.
	 * @param printer Interface to printer.
	 * @param databaseManager Interface to databasemManager.
	 */
	public void saveResult (String result, Vehicle vehicle, Printer printer, DatabaseManager databaseManager) {
		saveResultPrivate(result, vehicle, printer, databaseManager);
	}
	
	
	private void saveResultPrivate (String result, Vehicle vehicle, Printer printer, DatabaseManager databaseManager) {
		results = databaseManager.saveResult(result, vehicle);
		if (results != null)
			printer.print(results, vehicle, databaseManager);
	}
}
