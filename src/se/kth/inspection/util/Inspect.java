package se.kth.inspection.util;

/**
 * The thing to inspect.
 *
 */
public class Inspect {
	private final String inspected;
	
    /**
     * Creates a new instance.
     *
     * @param inspect The interface of inspect.
     */
	public Inspect (String inspected) {
        this.inspected = inspected;
    }
	
	@Override
	public String toString () {
		return inspected;
	}
}
