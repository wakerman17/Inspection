package se.kth.inspection.integration;

import se.kth.inspection.util.QueueNumber;

/**
 * Handles calls to the the Display.
 * 
 */
public class Display {
	
	/**
     * Shows the the specified QueueNumber. This implementation prints to
     * <code>System.out</code> instead of the display.
     * 
     * @param queueNumber The queue number to show.
     */
	public void showQueueNumber(QueueNumber queueNumber){
		showQueueNumberprivate(queueNumber);
	}
	
	
	private void showQueueNumberprivate(QueueNumber queueNumber){
		System.out.println("Queue number is " + queueNumber);
	}
}
