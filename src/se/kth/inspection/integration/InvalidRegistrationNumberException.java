package se.kth.inspection.integration;

public class InvalidRegistrationNumberException extends Exception {
	
	public InvalidRegistrationNumberException (Vehicle vehicle) {
		super("Registration number " + vehicle.getVehiclePrimitive() + " is invalid");
	}
}