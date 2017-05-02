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
	Amount cost;

	@Test
	public void testWhatToPay () {
		cost = costManager.whatToPay(inspectionAmount);
		Amount expected = new Amount(600);
		assertEquals("1 The numbers isn't equal!",expected ,cost);
		//Fail despite there is right - the objects have the same value
	}
	
	@Test
	public void testGetLatestCostTrue () {
		cost = costManager.getLatestCost(approvalTrue);
		assertNotNull("It dosn't return the cost", cost);
	}
	
	@Test
	public void testGetLatestCostFalse () {
		cost = costManager.getLatestCost(approvalFalse);
		assertNull("It dosn't return null", cost);
	}
	
	@Test
	public void testGetCost () {
		cost = costManager.getCost();
		Amount expected = new Amount(0);
		assertEquals("2 The numbers isn't equal!",expected ,cost);
		//Fail despite there is right - the objects have the same value
	}
}
