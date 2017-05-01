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
    public QueueNumber(int queueNumberPrimitive) {
		this.queueNumberPrimitive = queueNumberPrimitive;
	}
    /**
     * The reference to <code>QueueNumber</code> becomes 0.
     * 
     */
	public QueueNumber() {
    	this(0);
    }
	
	/**
	 * The method to print the <code>InspectionAmount</code> object.
	 * 
	 */
    public String toString (){
		StringBuilder queueNumberBuilder = new StringBuilder();
		queueNumberBuilder.append(queueNumberPrimitive);
		return queueNumberBuilder.toString();
    }
}
