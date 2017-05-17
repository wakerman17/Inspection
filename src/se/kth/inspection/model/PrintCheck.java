package se.kth.inspection.model;

import java.util.ArrayList;
import java.util.List;
import se.kth.inspection.integration.DatabaseManager;
import se.kth.inspection.integration.Printer;
import se.kth.inspection.integration.Result;
import se.kth.inspection.integration.Vehicle;

/**
 * Checks if the printer should print the results or save results.
 *
 */
public class PrintCheck {
	
	private List<ResultObserver> resultObservers = new ArrayList<>();
	private Result[] results;
	int index = 0;
	int amountOfTimesInside = 0;
	
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
		if (result.equals ("pass") || result.equals ("fail")) {
			results = databaseManager.saveResult(result);
			notifyObservers(result);
			if (results != null)
				printer.print(results, vehicle, databaseManager);
			}
		
		else {
			System.out.println("You have to choose either pass or fail");
			return;
		}
	}
	
	// Called by any method in this class that has changed
	// the class’ state.
	private void notifyObservers(String result) {
		for (ResultObserver obs : resultObservers) {
			obs.newResult(result);
		}
	}
	
	/**
	 * All the specified observers will be notified when a new valid result is saved.
	 * 
	 * @param observers The observers to notify. 
	 */
	public void addResultObserver(List<ResultObserver> observers) {
		resultObservers.addAll(observers);
	}
}
