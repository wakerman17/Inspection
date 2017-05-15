package se.kth.inspection.view;

import se.kth.inspection.controller.GarageDoorController;
import se.kth.inspection.controller.SimultaniusDisplayAndGarageDoorController;
import se.kth.inspection.integration.Inspect;
import se.kth.inspection.integration.InvalidRegistrationNumberException;
import se.kth.inspection.integration.Vehicle;
import se.kth.inspection.model.Amount;
import se.kth.inspection.model.CreditCardInformation;
import se.kth.inspection.util.LogHandler;
import se.kth.inspection.view.ErrorMessageHandler;
import se.kth.inspection.controller.CostController;
import se.kth.inspection.controller.PaymentController;
import se.kth.inspection.controller.InspectionController;
import se.kth.inspection.controller.ResultController;
import java.io.IOException;

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
	private LogHandler logger;
	private String regNoWrong = "ABC125";
	private String regNoRight = "ABC123";
	private Amount cost = new Amount(0);
	private int pin = 1234;
	private int number = 5678;
	private String holder = "William";
	private String expireDate = "02/20";
	private int cvc = 123;
	private CreditCardInformation creditCardInformation = new CreditCardInformation(pin, number, holder, expireDate, cvc);
	private String result;
	private ErrorMessageHandler errorMessageHandler = new ErrorMessageHandler();
	
	/**
	 * Creates a new instance.
	 * 
	 * @param garageDoorContr The interface of garageDoorContr.
	 * @param simuContr The interface of simuContr.
	 * @param costContr The interface of costContr.
	 * @param paymentContr The interface of paymentContr.
	 * @param inspectionContr The interface of inspectionContr.
	 * @param resultContr The interface of resultContr.
	 */
	public View(GarageDoorController garageDoorContr, SimultaniusDisplayAndGarageDoorController simuContr, 
			    CostController costContr, PaymentController paymentContr, InspectionController inspectionContr,
			    ResultController resultContr) throws IOException {
		this.garageDoorContr = garageDoorContr;
		this.simuContr = simuContr;
		this.costContr = costContr;
		this.paymentContr = paymentContr;
		this.inspectionContr = inspectionContr;
		this.resultContr = resultContr;
		
		this.logger = new LogHandler();
		
		resultContr.addResultObserver(new InspectionStatsView());
	}
	
	/**
	 * A hardcoded execution.
	 * 
	 */
	public void sampleExecution () {
		System.out.println("New inspection is made - new queue number and open door");
		simuContr.newInspection();
		
		status = "close";
		System.out.println("Door closes");
		garageDoorContr.activateDoor(status);
		
		Vehicle vehicleWrong = new Vehicle(regNoWrong);
		System.out.println("Customer: What is your registration number? \n" + vehicleWrong);
		
		try {
			cost = costContr.whatToPay(vehicleWrong);
		} catch (InvalidRegistrationNumberException e) {
			errorExecution("Correctly failed. The registration number " +  vehicleWrong + " is invalid.", e);
		}
		
		Vehicle vehicleRight = new Vehicle(regNoRight);
		System.out.println("Customer: What is your registration number? \n" + vehicleRight);
		
		try {
			cost = costContr.whatToPay(vehicleRight);
		} catch (InvalidRegistrationNumberException e) {
			errorExecution("Failed wrong. The registration number " +  vehicleRight + " is valid.", e);
		}

		System.out.println("The cost is " + cost);
		System.out.println("Customer: Print your creditCardInformation");
		System.out.println(creditCardInformation);
		System.out.println("Payment process is starting");
		paymentContr.doPayment(creditCardInformation);
		
		Inspect toInspect = inspectionContr.whatToInspect(vehicleRight); 
		System.out.println("Inspector: \nYou shold inspect: " + toInspect);
		
		result = "pass";
		System.out.println("The inspection did: " + result);
		resultContr.saveResultFirst(result, vehicleRight);
		toInspect = inspectionContr.whatToInspect(vehicleRight);
		System.out.println("You shold inspect: " + toInspect);
		
		result = "fail";
		System.out.println("The inspection did: " + result);
		resultContr.saveResult(result, vehicleRight);
		toInspect = inspectionContr.whatToInspect(vehicleRight);
		System.out.println("You shold inspect: " + toInspect);
		
		result = "pass";
		System.out.println("The inspection did: " + result);
		resultContr.saveResult(result, vehicleRight);
		System.out.println();
		
		status = "open";
		System.out.println("Door opens");
		garageDoorContr.activateDoor(status);
		status = "close";
		System.out.println("Door closes");
		garageDoorContr.activateDoor(status);
		
	}
	
	private void errorExecution(String msg, Exception e){
		errorMessageHandler.showErrorMsg(msg);
		logger.logException(e);
	}
}
