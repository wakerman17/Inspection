package se.kth.inspection.util;

import se.kth.inspection.util.QueueNumber;

/**
 * The number which will stand on the display.
 *
 */
public class QueueNumber {
	
	public int queueNumberPrimitive;

	/**
     * Creates a new instance.
     *
     * @param queueNumberPrimitive The amount represented by the newly created instance.
     */
    public QueueNumber (int queueNumberPrimitive) {
		this.queueNumberPrimitive = queueNumberPrimitive;
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
	return Integer.toString(queueNumberPrimitive);
    }
}
