package se.kth.inspection.controller;

import java.util.ArrayList;
import java.util.List;
import se.kth.inspection.integration.Vehicle;
import se.kth.inspection.integration.DatabaseManager;
import se.kth.inspection.integration.Printer;
import se.kth.inspection.model.PrintCheck;
import se.kth.inspection.model.ResultObserver;

/**
 * Controller which take care of the result of the inspection (pass or fail).
 *
 */

public class ResultController {
	
	private PrintCheck printCheck;
	private Printer printer;
	private DatabaseManager databaseManager;
	private List<ResultObserver> resultObservers = new ArrayList<>();
	
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
	 * Send instruction to <code>printCheck</code> the first time.
	 * 
	 * @param result The result of the inspection.
	 * @param vehicle Information about the vehicle.
	 */
	public void saveResultFirst (String result, Vehicle vehicle) {
		printCheck.addResultObserver(resultObservers);
		printCheck.saveResult (result, vehicle, printer, databaseManager);
	}
	
	/**
	 * Send instruction to <code>printCheck</code>.
	 * 
	 * @param result The result of the inspection.
	 * @param vehicle Information about the vehicle.
	 */
	public void saveResult (String result, Vehicle vehicle) {
		printCheck.saveResult (result, vehicle, printer, databaseManager);
	}
	
	/**
	 * The specified observer will be notified when a new valid result is saved. There will be
	 * notifications only for valid result that are reported after this method is called.
	 *
	 * @param obs The observer to notify.
	 */
	public void addResultObserver(ResultObserver obs) {
		resultObservers.add(obs);
	}
}
