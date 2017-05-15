package se.kth.inspection.integration;

import se.kth.inspection.integration.DatabaseManager;
import se.kth.inspection.model.Receipt;


/**
 * Takes care of the calls to the printer.
 * 
 */

public class Printer {
	
	/**
	 * This method prints the receipt to <code>System.out</code> instead of the printer.
	 * 
	 * @param receipt Information about the payment.
	 */
	public void print(Receipt receipt){
		System.out.println(receipt.receiptString());
	}
	
	/**
	 * This method prints the result and vehicle information to <code>System.out</code> instead of the printer.
	 * 
	 * @param result The result of the inspection.
	 * @param vehicle Information about the vehicle.
	 * @param databaseManager Interface to databaseManager.
	 * @throws InvalidRegistrationNumberException 
	 */
	public void print (Result[] result, Vehicle vehicle, DatabaseManager databaseManager) {
		printPrivate(result, vehicle, databaseManager);
	}
	
	private void printPrivate (Result[] result, Vehicle vehicle, DatabaseManager databaseManager) {
		System.out.println("No more inspections! \n\nPrintout: \n");
		
		int inspectionAmount = result.length - 1;
		Inspect[] inspect = databaseManager.getInspection(vehicle);
		String regNo = vehicle.getVehiclePrimitive();
		
		for(int index = 0; index <= inspectionAmount; index++)
			System.out.println("The inspection with " + inspect[index] + " got the result: " + result[index]);
		System.out.println("Vechicle registration number: " + regNo);
	}
}
