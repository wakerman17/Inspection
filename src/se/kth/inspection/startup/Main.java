package se.kth.inspection.startup;

import se.kth.inspection.integration.GarageDoor;
import se.kth.inspection.model.DisplayNext;
import se.kth.inspection.integration.PaymentAuthorizationSystem;
import se.kth.inspection.integration.Printer;
import se.kth.inspection.integration.Display;
import se.kth.inspection.controller.GarageDoorController;
import se.kth.inspection.controller.SimultaniusDisplayAndGarageDoorController;
import se.kth.inspection.controller.CostController;
import se.kth.inspection.model.CostManager;
import se.kth.inspection.integration.DatabaseManager;
import se.kth.inspection.controller.PaymentController;
import se.kth.inspection.controller.InspectionController;
import se.kth.inspection.controller.ResultController;
import se.kth.inspection.model.PrintCheck;
import se.kth.inspection.view.View;
import java.io.IOException;

/**
 * The startup which make the references to all needed objects
 * 
 * @param args Has to bee in main
 */
public class Main {
	public static void main (String[] args) throws IOException {
		GarageDoor garageDoor = 					new GarageDoor();
		GarageDoorController garageDoorContr = 				new GarageDoorController(garageDoor);
		
		DisplayNext displayNext = 					new DisplayNext();
		Display display = 						new Display();
		SimultaniusDisplayAndGarageDoorController simuContr = new SimultaniusDisplayAndGarageDoorController(garageDoor, displayNext, display);
		
		DatabaseManager databaseManager = 				new DatabaseManager();
		CostManager costManager = 					new CostManager();
		CostController costContr = 					new CostController(databaseManager, costManager);
		
		PaymentAuthorizationSystem paymentAuthorizationSystem = new PaymentAuthorizationSystem();
		Printer printer = 						new Printer();
		PaymentController paymentContr = 				new PaymentController(paymentAuthorizationSystem, costManager, printer);
		InspectionController inspectionContr = 				new InspectionController(databaseManager);
		
		PrintCheck printCheck = 					new PrintCheck();
		ResultController resultContr = 					new ResultController(printCheck, printer, databaseManager);
		
		new View(garageDoorContr, simuContr, costContr, paymentContr, inspectionContr, resultContr).sampleExecution();
	}
}
