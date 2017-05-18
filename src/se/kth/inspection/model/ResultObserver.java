package se.kth.inspection.model;

/**
 * Declares the newResult method used by implementing classes to keep track of number of inspections passed or failed.
 *
 */
public interface ResultObserver {
	
	void newResult(String result);
} 
