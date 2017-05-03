package se.kth.inspection.controller;

import se.kth.inspection.integration.DatabaseManager;
import se.kth.inspection.integration.Printer;
import se.kth.inspection.model.PrintCheck;
import se.kth.inspection.util.Vehicle;

/**
 * Controller which take care of the result of the inspection (pass or fail).
 *
 */

public class ResultController {
	
	private PrintCheck printCheck;
	private Printer printer;
	private DatabaseManager databaseManager;
	
	 /**
     * Creates a new instance.
     *
     * @param printCheck Interface to printCheck.
     * @param printer Interface to printer.
	 * @param databasemManager Interface to databasemManager.
     */
	public ResultController (PrintCheck printCheck, Printer printer, DatabaseManager databaseManager) {
		this.printCheck = printCheck;
		this.printer = printer;
		this.databaseManager = databaseManager;
	}
	
	/**
	 * Send instruction to <code>printCheck</code>.
	 * 
	 * @param result The result of the inspection.
	 * @param vehicle Information about the vehicle.
	 */
	public void saveResult (String result, Vehicle vehicle) {
		saveResultPrivate (result, vehicle);
	}
	
	
	private void saveResultPrivate (String result, Vehicle vehicle) {
		printCheck.saveResult (result, vehicle, printer, databaseManager);
	}
}
