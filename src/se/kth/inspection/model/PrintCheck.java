package se.kth.inspection.model;

import se.kth.inspection.integration.DatabaseManager;
import se.kth.inspection.integration.Printer;
import se.kth.inspection.util.Inspect;
import se.kth.inspection.util.Vehicle;

/**
 * Checks if the printer should print the results or save results.
 *
 */
public class PrintCheck {
	
	private Printer printer = new Printer();
	private DatabaseManager databaseManager = new DatabaseManager();
	
	/**
	 * Creates a new instance.
	 * 
	 * @param printer Interface to printer.
	 * @param databaseManager Interface to databaseManager.
	 */
	public PrintCheck (Printer printer, DatabaseManager databaseManager) {
		this.printer = printer;
		this.databaseManager = databaseManager;
	}
	/**
	 * Creates a new instance.
	 * 
	 */
	public PrintCheck () {}
	
	/**
	 * Save the result of the inspection, if all inspections are made call the printer.
	 * 
	 * @param result The result of the inspection.
	 * @param vehicle Information about the vehicle.
	 */
	public void saveResult (String result, Vehicle vehicle) {
		saveResultPrivate(result, vehicle);
	}
	
	
	private void saveResultPrivate (String result, Vehicle vehicle) {
		Inspect[] i = databaseManager.saveResult(result, vehicle);
		if (i != null)
			printer.print(i, vehicle, databaseManager);
	}
}
