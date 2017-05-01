package se.kth.inspection.controller;

import se.kth.inspection.model.PrintCheck;
import se.kth.inspection.util.Vehicle;

/**
 * Controller which take care of the result of the inspection (pass or fail).
 *
 */

public class ResultController {
	
	private PrintCheck printCheck;
	
	 /**
     * Creates a new instance.
     *
     * @param printCheck Interface to printCheck.
     */
	public ResultController (PrintCheck printCheck) {
		this.printCheck = printCheck;
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
		printCheck.saveResult (result, vehicle);
	}
}
