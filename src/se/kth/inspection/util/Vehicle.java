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
	
	@Override
	public String toString () {
		return vehiclePrimitive;
	 }
}
