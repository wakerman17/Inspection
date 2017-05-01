package se.kth.inspection.util;

public final class Vehicle {
	
	public final String vehiclePrimitive;
	public Vehicle vehicle;
	
	public Vehicle(String vehiclePrimitive){
		this.vehiclePrimitive = vehiclePrimitive;
	}
	
	public Vehicle getVehicle(){
		return vehicle;
	}
	
	public String getVehiclePrimitive(){
		return vehiclePrimitive;
	}
	
	/**
	 * The method to print the <code>Vehicle</code> object 
	 * 
	 */
	public String toString (){
		StringBuilder vehicleMaker = new StringBuilder();
		vehicleMaker.append(vehicle);
		return vehicleMaker.toString();
	 }
	
}
