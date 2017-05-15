package se.kth.inspection.integration;

/**
 * Thrown when the Registration number is invalid - there is no inspections to be made
 * 
 */
public class InvalidRegistrationNumberException extends Exception {
	
	public InvalidRegistrationNumberException (Vehicle vehicle) {
		super("Registration number " + vehicle.getVehiclePrimitive() + " is invalid");
	}
}
