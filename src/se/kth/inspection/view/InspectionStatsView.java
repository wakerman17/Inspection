package se.kth.inspection.view;

import se.kth.inspection.model.ResultObserver;

/**
 * Handles calls to the the inspection status display.
 * 
 * This implementation prints to
 * <code>System.out</code> instead of the inspection status display.
 * 
 */
class InspectionStatsView implements ResultObserver {
	
	private int passAmount = 0;
	private int failAmount = 0;
	
	@Override
	public void newResult (String result) {
		addNewResult(result);
		printCurrentState();
	}
	
	private void addNewResult (String result) {
		if (result.equals ("pass")) 
			passAmount++;
		else 
			failAmount++;
	}
	
	private void printCurrentState () {
		System.out.println("\nAmount of failed inspections: " + failAmount + "\nAmount of passed inspections: " + passAmount + "\n");
	}
}
