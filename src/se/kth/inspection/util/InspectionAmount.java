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
	  * Get the <code>InspectionAmount</code.
	  * 
	  * @return The <code>InspectionAmount</code in an object.
	  */
	 public InspectionAmount getInspectionAmount () {
		 return inspectionAmount;
	 }
	 
	 /**
	  * Get the <code>InspectionAmount</code>.
	  * 
	  * @return <code>InspectionAmount</code> in an int.
	  */
	 public int getPrimitiveInspectionAmount () {
		 return inspectionAmountPrimitive;
	 }
	 
	 @Override
	 public String toString () {
		 return Integer.toString(inspectionAmountPrimitive);
	 }
}
