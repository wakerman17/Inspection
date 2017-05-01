package se.kth.inspection.model;

import se.kth.inspection.integration.Display;
import se.kth.inspection.util.QueueNumber;

/**
 * Holding the Queue Number which display may show
 *
 */
public class DisplayNext {

	private QueueNumber queueNumber;
	private int nextQueueNumber = 1;
	private int queueNumberRightNow = 0;
	
    /**
     * Creates a new instance.
     *
     * @param queueNumber The interface of queueNumber.
     * @param display The interface of display.
     */
	public DisplayNext (QueueNumber queueNumber, Display display) {
		this.queueNumber = queueNumber;
	}
	
    /**
     * Creates a new instance.
     * 
     */
	public DisplayNext () {}
	
	/**
	 * Increase the queue number.
	 * 
	 * @param display The interface of display.
	 */
	public void increaseQueueNumber (Display display) {
		increaseQueueNumberPrivate(display);
	}
	
	
	private void increaseQueueNumberPrivate (Display display) {
		queueNumberRightNow += nextQueueNumber;
		queueNumber = new QueueNumber(queueNumberRightNow);
		display.showQueueNumber(queueNumber);
	}
}