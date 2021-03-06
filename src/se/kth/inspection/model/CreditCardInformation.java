package se.kth.inspection.model;

/**
 * Information about the credit card the customer use.
 *
 */
public class CreditCardInformation {
	
	private final int pin;
	private final int number;
	private final String holder;
	private final String expireDate;
	private final int cvc;
	
	/**
	 * The credit card information the customer gives
	 * 
	 * @param pin The code to the card
	 * @param number The number to the card
	 * @param holder The one who owns the card
	 * @param expireDate The expire date to the card
	 * @param cvc The cvc to the card
	 */
	public CreditCardInformation (int pin, int number, String holder, String expireDate, int cvc) {
		this.pin = 			pin;
		this.number = 		number;
		this.holder = 		holder;
		this.expireDate = 	expireDate;
		this.cvc = 			cvc;
	}
	
	/**
     * Get the value of pin.
     *
     * @return the value of pin.
     */
    public int getPin () {
        return pin;
    }
    
	/**
     * Get the value of number.
     *
     * @return the value of number.
     */
    public int getNumber () {
        return number;
    }
    
	/**
     * Get the name of the holder.
     *
     * @return the name of the holder.
     */
    public String getHolder () {
        return holder;
    }
    
	/**
     * Get the expire date.
     *
     * @return the expire date.
     */
    public String getExpireDate () {
        return expireDate;
    }
    
	/**
     * Get the value of cvc.
     *
     * @return the value of cvc.
     */
    public int getCvc () {
        return cvc;
    }
    
    /**
     * The method to print the <code>CreditCardInformation</code> object.
     * 
     * @return The <code>String</code> of the <code>CreditCardInformation</code>.
     */
    public String toString () {
		StringBuilder cardBuilder = new StringBuilder();
		
		cardBuilder.append("Pin = " + pin + "\n");
		cardBuilder.append("Number = " + number + "\n");
		cardBuilder.append("Holder = " + holder + "\n");
		cardBuilder.append("Expire date (MM/YY) = " + expireDate + "\n");
		cardBuilder.append("CVC = " + cvc + "\n");
		
		return cardBuilder.toString();
	}
}
