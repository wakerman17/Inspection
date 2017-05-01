package se.kth.inspection.util;

/**
 * Information about the Vehicle.
 *
 */
public final class Vehicle {
	
	public final String vehiclePrimitive;
	public Vehicle vehicle;
	
    /**
     * Creates a new instance.
     *
     * @param vehiclePrimitive.
     */
	public Vehicle (String vehiclePrimitive) {
		this.vehiclePrimitive = vehiclePrimitive;
	}
	/**
	 * Get the vehicle information.
	 * 
	 * @return The information about the vehicle <code>Object</code>.
	 */
	public Vehicle getVehicle () {
		return vehicle;
	}
	
    /**
     * Get the vehicle information.
     *
     * @return The vehicle information in a <code>String</code>.
     */
	public String getVehiclePrimitive () {
		return vehiclePrimitive;
	}
	
	/**
	 * The method to print the <code>Vehicle</code> object.
	 * 
	 * @return The <code>String</code> of the <code>Vehicle</code>.
	 */
	public String toString () {
		StringBuilder vehicleBuilder = new StringBuilder();
		vehicleBuilder.append(vehicle);
		return vehicleBuilder.toString();
	 }
}
