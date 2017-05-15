package se.kth.inspection.model;

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
     * Two <code>Amount</code>s are equal if they represent the same amount.
     *
     * @param other The <code>Amount</code> to compare with this amount.
     * @return The statement <code>true</code> if the two specified amounts is equal to each other,
     *         <code>false</code> if they isn't equal.
     */
	 @Override
	 public boolean equals(Object other) {
		 if (other == null || !(other instanceof Amount)) 
			 return false;
	    Amount otherAmount = (Amount) other;
	    return amount == otherAmount.amount;
	 }
	 
	 @Override
	 public String toString () {
		 return Integer.toString(amount);
	 }
}