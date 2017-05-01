package se.kth.inspection.view;

import se.kth.inspection.controller.GarageDoorController;
import se.kth.inspection.controller.SimultaniusDisplayAndGarageDoorController;
import se.kth.inspection.util.Amount;
import se.kth.inspection.util.Inspect;
import se.kth.inspection.util.Vehicle;
import se.kth.inspection.controller.CostController;
import se.kth.inspection.controller.PaymentController;
import se.kth.inspection.model.CreditCardInformation;
import se.kth.inspection.controller.InspectionController;
import se.kth.inspection.controller.ResultController;

/**
 * No view is generated despite the name, it only shows output
 *
 */
public class View {
	
	private GarageDoorController garageDoorContr;
	private SimultaniusDisplayAndGarageDoorController simuContr;
	private CostController costContr;
	private PaymentController paymentContr;
	private InspectionController inspectionContr;
	private ResultController resultContr;
	private String status;
	private String regNo = "ABC123";
	private Amount cost = new Amount(0);
	private int pin = 1234;
	private int number = 5678;
	private String holder = "William";
	private String expireDate = "02/20";
	private int cvc = 123;
	private String result;
	private CreditCardInformation creditCardInformation = new CreditCardInformation(pin, number, holder, expireDate, cvc);
	

	public View(GarageDoorController garageDoorContr, SimultaniusDisplayAndGarageDoorController simuContr, 
			    CostController costContr, PaymentController paymentContr, InspectionController inspectionContr,
			    ResultController resultContr) {
		this.garageDoorContr = garageDoorContr;
		this.simuContr = simuContr;
		this.costContr = costContr;
		this.paymentContr = paymentContr;
		this.inspectionContr = inspectionContr;
		this.resultContr = resultContr;
	}
	/**
	 * A hardcoded execution
	 * 
	 */
	public void sampleExecution () {
		System.out.println("New inspection is made - new queue number and open door");
		simuContr.newInspection();
		status = "closed";
		System.out.println("Door closes");
		garageDoorContr.activateDoor(status);
		Vehicle vehicle = new Vehicle(regNo);
		cost = costContr.whatToPay(vehicle);
		System.out.println("The cost is " + cost);
		paymentContr.doPayment(creditCardInformation);
		Inspect toInspect = inspectionContr.whatToInspect(vehicle); 
		System.out.println("You shold inspect: " + toInspect);
		result = "pass";
		resultContr.saveResult(result, vehicle);
		toInspect = inspectionContr.whatToInspect(vehicle);
		System.out.println("You shold inspect: " + toInspect);
		resultContr.saveResult(result, vehicle);
		toInspect = inspectionContr.whatToInspect(vehicle);
		System.out.println("You shold inspect: " + toInspect + "\n");
		resultContr.saveResult(result, vehicle);
		System.out.println("\n");
		status = "opened";
		System.out.println("Door opens");
		garageDoorContr.activateDoor(status);
		status = "closed";
		System.out.println("Door closes");
		garageDoorContr.activateDoor(status);
		System.out.println("\nNew inspection is made - new queue number and open door");
		simuContr.newInspection();
		System.out.println("...");
	}
	
}