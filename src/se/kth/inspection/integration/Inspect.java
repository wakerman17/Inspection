package se.kth.inspection.integration;

/**
 * The thing to inspect.
 *
 */
public class Inspect {
	private final String inspect;
	
    /**
     * Creates a new instance.
     *
     * @param inspect The thing to bee inspected
     */
	public Inspect (String inspect) {
        this.inspect = inspect;
    }
	
	@Override
	public String toString () {
		return inspect;
	}
}