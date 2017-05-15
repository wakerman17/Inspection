package se.kth.inspection.controller;

import se.kth.inspection.integration.GarageDoor;
import se.kth.inspection.integration.Display;
import se.kth.inspection.model.DisplayNext;

/**
 * Controller which takes care of the display and garage door for a new inspection.
 *
 */
public class SimultaniusDisplayAndGarageDoorController {
	
	private GarageDoor garageDoor;
	private DisplayNext displayNext;
	private Display display;

	 /**
	 * Creates a new instance.
	 *
	 * @param garageDoor Interface to garageDoor.
	 * @param displayNext Interface to displayNext.
	 * @param display Interface to display.
	 */
	public SimultaniusDisplayAndGarageDoorController (GarageDoor garageDoor, DisplayNext displayNext, Display display) {
		this.garageDoor = garageDoor;
		this.displayNext = displayNext;
		this.display = display;
	}
	
	/**
	 * Takes care of all of the operations during a new inspection.
	 * 
	 */
	public void newInspection () {
		newInspectionPrivate();
	}
	
	
	private void newInspectionPrivate () {
		displayNext.increaseQueueNumber(display);
		garageDoor.activateDoor("open");
	}
}