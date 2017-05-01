package se.kth.inspection.util;
/**
 * The anmount of inspections that has to be done.
 * 
 */
public class InspectionAmount {
	
	 public final int inspectionAmountPrimitive;
	 public InspectionAmount inspectionAmount;
	 
	 /**
	  * Creates a new instance, representing the specified amount of inspections.
	  *
	  * @param amount The amount of inspections represented by the newly created instance.
	  */
	 public InspectionAmount (int primitiveInspectionAmount) {
		 this.inspectionAmountPrimitive = primitiveInspectionAmount;
	 }
	 
	 /**
	  * Get the InsoectionAmount in an int.
	  * 
	  * @return The inspectionAmount in an int.
	  */
	 public InspectionAmount getInspectionAmount () {
		 return inspectionAmount;
	 }
	 
	 /**
	  * Get the <code>InspectionAmount</code> in an int.
	  * 
	  * @return <code>InspectionAmount</code> in an int.
	  */
	 public int getPrimitiveInspectionAmount () {
		 return inspectionAmountPrimitive;
	 }
	 
	 /**
	  * The method to print the <code>InspectionAmount</code> object.
	  * 
	  * @return The <code>String</code> of the <code>InspectionAmount</code>.
	  */
	 public String toString () {
		 StringBuilder inspectionAmountBuilder = new StringBuilder();
		 inspectionAmountBuilder.append(inspectionAmount);
		 return inspectionAmountBuilder.toString();
	 }
}
