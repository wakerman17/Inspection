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

	public CreditCardInformation (int pin, int number, String holder, String expireDate, int cvc) {
		this.pin = pin;
		this.number = number;
		this.holder = holder;
		this.expireDate = expireDate;
		this.cvc = cvc;
	}
	
	/**
     * Get the value of pin
     *
     * @return the value of pin
     */
    public int getPin () {
        return pin;
    }
    
	/**
     * Get the value of number
     *
     * @return the value of number
     */
    public int getNumber () {
        return number;
    }
    
	/**
     * Get the name of the holder
     *
     * @return the name of the holder
     */
    public String getHolder () {
        return holder;
    }
    
	/**
     * Get the expire date
     *
     * @return the expire tate
     */
    public String getExpireDate () {
        return expireDate;
    }
    
	/**
     * Get the value of cvc
     *
     * @return the value of cvc
     */
    public int getCvc () {
        return cvc;
    }
}
