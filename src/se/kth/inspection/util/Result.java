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
	public Result(String result) {
		this.result = result;
    }
	
    /**
	 * The method to print the <code>Amount</code> object 
	 * 
	 */
	public String toString (){
		StringBuilder inspectMaker = new StringBuilder();
		inspectMaker.append(result);
		return inspectMaker.toString();
	}
	
}
