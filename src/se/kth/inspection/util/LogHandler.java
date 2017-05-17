package se.kth.inspection.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * This class is responsible for the log.
 *
 */
public class LogHandler {
	
	private static final String LOG_FILE_NAME = "inspection-log.txt";
	private PrintWriter logFile;
	
	public LogHandler() throws IOException {
		logFile = new PrintWriter(new FileWriter(LOG_FILE_NAME), true);
	}
	
	/**
	 * Writes log entries.
	 * 
	 * @param entry The log entry.
	 */
	public void logException(Exception exception) {
		StringBuilder logMsgBuilder = new StringBuilder();
		logMsgBuilder.append("Exception was thrown: ");
		logMsgBuilder.append(exception.getMessage());
		logFile.println(logMsgBuilder);
		exception.printStackTrace(logFile);
	}
} 
