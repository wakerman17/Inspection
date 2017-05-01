package se.kth.inspection.controller;

import se.kth.inspection.integration.GarageDoor;

/**
 * Controller which takes care of the garage door.
 *
 */
public class GarageDoorController {
	
	private GarageDoor garageDoor;
	
	 /**
     * Creates a new instance.
     *
     * @param garageDoor Interface to garageDoor.
	 */
	public GarageDoorController (GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	/**
         * Creates a new instance.
         *
         * @param status What the status the door is going to change, open or close.
	 */
	public void activateDoor (String status) {
		garageDoor.activateDoor(status);
	}
}
