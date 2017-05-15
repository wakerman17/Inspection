package se.kth.inspection.model;

import se.kth.inspection.model.QueueNumber;

/**
 * The number which will stand on the display.
 *
 */
public class QueueNumber {
	
	public int queueNumber;

	/**
     * Creates a new instance.
     *
     * @param queueNumberPrimitive The amount represented by the newly created instance.
     */
    public QueueNumber (int queueNumber) {
		this.queueNumber = queueNumber;
	}
    
    /**
     * The reference to <code>QueueNumber</code> becomes 0.
     * 
     */
	public QueueNumber() {
    	this(0);
    }
	
	@Override
    public String toString () {
		return Integer.toString(queueNumber);
    }
}