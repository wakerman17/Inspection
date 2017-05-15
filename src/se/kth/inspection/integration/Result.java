package se.kth.inspection.integration;

/**
 * The result of the inspection.
 *
 */
public class Result {
	
	private String result;
	
	
    /**
     * Creates a new instance.
     *
     * @param result The reult of the inspected part.
     */
	public Result (String result) {
        this.result = result;
    }
	
	@Override
	public String toString () {
		return result;
	}
}