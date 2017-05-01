package se.kth.inspection.integration;

import se.kth.inspection.util.Inspect;
import se.kth.inspection.util.Receipt;
import se.kth.inspection.util.Vehicle;
import se.kth.inspection.integration.DatabaseManager;

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
		printPrivate(receipt);
	}
	
	/**
	 * This method prints the result and vehicle information to <code>System.out</code> instead of the printer.
	 * 
	 * @param result The result of the inspection.
	 * @param vehicle Information about the vehicle.
	 * @param databaseManager Interface to databaseManager
	 */
	public void print (Inspect[] result, Vehicle vehicle, DatabaseManager databaseManager) {
		printPrivate(result, vehicle, databaseManager);
	}
	
	
	private void printPrivate (Receipt receipt) {
		System.out.println(receipt.receiptString());
	}
	
	private void printPrivate (Inspect[] result, Vehicle vehicle, DatabaseManager databaseManager) {
		System.out.println("No more inspections! \n\nPrintout: \n");
		
		int inspectionAmount = result.length - 1;
		Inspect[] inspect = databaseManager.getInspection(vehicle);
		String regNo = vehicle.getVehiclePrimitive();
		
		for(int index = 0; index <= inspectionAmount; index++)
			System.out.println("The inspection with " + inspect[index] + " got the result: " + result[index]);
		System.out.println("Vechicle registration number: " + regNo);
	}
}
