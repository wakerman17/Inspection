package se.kth.inspection.integration;

import se.kth.inspection.integration.InvalidRegistrationNumberException;

/**
 * Handles all calls to the database.
 *
 */
public class DatabaseManager {
	
	private Inspect[] inspect = 	new Inspect[3];
	private Result[] results = 		new Result[3];
	private int inspectionAmountPrimitive;
	private int inspectIndex = 		-1;
	private int resultIndex = 		0;
	
	/**
	 * Calculates the amount of inspections.
	 *
	 * @param vehicle Information about the vehicle.
	 * @return The amount of inspections.
	 * @throws InvalidRegistrationNumberException if the registration number is invalid.
	 */
	public InspectionAmount howManyInspections (Vehicle vehicle) throws InvalidRegistrationNumberException {
		String regNo = vehicle.getVehiclePrimitive();
		if (regNo != "ABC123") 
			throw new InvalidRegistrationNumberException(vehicle);
		inspectionAmountPrimitive = inspect.length;
		return new InspectionAmount(inspectionAmountPrimitive);
	}
	
	/**
	 * Gives information what to insect.
	 *
	 * @param vehicle Information about the vehicle.
	 * @return What to inspect.
	 */
	public Inspect whatToInspect (Vehicle vehicle) {
		inspectIndex++;
		inspect = 					inspectionArray(vehicle);
		return inspect[inspectIndex];
	}
	
	/**
	 * Save the results. If all inspections are made all of the results return.
	 * 
	 * @param result The result of the inspection.
	 * @param vehicle Information about the vehicle.
	 * @return The array with all of the results if the last inspection are made. Otherwise null.
	 */
	public Result[] saveResult (String result) {
		results[resultIndex] = new Result(result);
		resultIndex++;
		if (resultIndex >= inspect.length){
			return results;
		}
		return null;
	}
	
	/**
	 * Get the array of inspections.
	 * 
	 * @param vehicle Information about the vehicle.
	 * @return The array with all inspections
	 */
	public Inspect[] getInspection (Vehicle vehicle) {
		return inspectionArray(vehicle);
	}
	
	//Method only used by implementation
	private Inspect[] inspectionArray (Vehicle vehicleR) {
		String regNo = vehicleR.getVehiclePrimitive();
			if (regNo == "ABC123"){
				inspect[0] = new Inspect("Breakers");
				inspect[1] = new Inspect("Engine");
				inspect[2] = new Inspect("Windows");
				return inspect;
			}
		return null;
	}
}
