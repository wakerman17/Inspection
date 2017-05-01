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
	
	/**
	 * The method to print the <code>Inspect</code> object.
	 * 
	 * @return The <code>String</code> of the <code>Inspect</code>
	 */
	public String toString () {
		StringBuilder inspectBuilder = new StringBuilder();
		inspectBuilder.append(inspected);
		return inspectBuilder.toString();
	}
}
