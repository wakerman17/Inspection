package se.kth.inspection.util;

/**
 * Should save result, isn't used yet!
 *
 */
public class Result {
	
	private String result;
	
    /**
     * Creates a new instance.
     *
     * @param result The information in result.
     */
	public Result (String result) {
		this.result = result;
    }
	
    /**
	 * The method to print the <code>Result</code> object.
	 * 
	 * @return The <code>String</code> of the <code>Result</code>.
	 */
	public String toString () {
		StringBuilder resultBuilder = new StringBuilder();
		resultBuilder.append(result);
		return resultBuilder.toString();
	}
}
