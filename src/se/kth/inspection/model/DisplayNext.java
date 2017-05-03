package se.kth.inspection.model;

import se.kth.inspection.integration.Display;
import se.kth.inspection.util.QueueNumber;

/**
 * Holding the Queue Number which display may show.
 *
 */
public class DisplayNext {

	private int nextQueueNumber = 1;
	private int queueNumberRightNow = 0;
	
	/**
	 * Increase the queue number.
	 * 
	 * @param display The interface of display.
	 * @param queueNumber The number to show to the customer.
	 */
	public void increaseQueueNumber (Display display, QueueNumber queueNumber) {
		increaseQueueNumberPrivate(display, queueNumber);
	}
	
	
	private void increaseQueueNumberPrivate (Display display, QueueNumber queueNumber) {
		queueNumberRightNow += nextQueueNumber;
		queueNumber = new QueueNumber(queueNumberRightNow);
		display.showQueueNumber(queueNumber);
	}
}
