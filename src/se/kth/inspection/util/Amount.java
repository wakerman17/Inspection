package se.kth.inspection.util;

/**
 * The amout of the cost.
 *
 */
public class Amount {
	
	public final int amount;

	/**
	 * Creates a new instance, representing the specified amount.
	 *
	 * @param amount The amount represented by the newly created instance.
	 */
	public Amount (int amount) {
		this.amount = amount;
	}
	
	 /**
	  * The method to print the <code>Amount</code> object.
	  * 
	  */
	 public String toString () {
		 StringBuilder amountBuilder = new StringBuilder();
		 amountBuilder.append(amount);
		 return amountBuilder.toString();
	 }
}
