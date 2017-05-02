package se.kth.inspection.model;

import static org.junit.Assert.*;
import org.junit.Test;
import se.kth.inspection.util.Amount;
import se.kth.inspection.integration.DatabaseManager;
import se.kth.inspection.model.CostManager;
import se.kth.inspection.util.InspectionAmount;
import se.kth.inspection.util.Vehicle;

public class CostManagerTest {
	boolean approvalTrue = true;
	boolean approvalFalse = false;
	CostManager costManager = new CostManager();
	DatabaseManager databaseManager = new DatabaseManager();
	String regNo = "ABC123";
	Vehicle vehicle = new Vehicle(regNo);
	InspectionAmount inspectionAmount = databaseManager.howManyInspections(vehicle);


	@Test
	public void testWhatToPay () {
		Amount cost = costManager.whatToPay(inspectionAmount);
		Amount expected = new Amount(600);
		assertEquals("1 The numbers isn't equal!",expected ,cost);
	}
	
	@Test
	public void testGetLatestCostTrue () {
		Amount cost = costManager.getLatestCost(approvalTrue);
		assertNotNull("It dosn't return the cost", cost);
	}
	
	@Test
	public void testGetLatestCostFalse () {
		Amount cost = costManager.getLatestCost(approvalFalse);
		assertNull("It dosn't return null", cost);
	}
	
	@Test
	public void testGetCost () {
		Amount cost = costManager.getCost();
		Amount expResult = new Amount(0);
		assertEquals("1 The numbers isn't equal!",expResult ,cost);
	}
}
