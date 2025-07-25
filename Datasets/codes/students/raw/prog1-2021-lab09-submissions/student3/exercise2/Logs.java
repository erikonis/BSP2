package lu.uni.programming1.lab9.exercise2;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

public class Logs {
	private static String log = "";

	public static void log(String logs){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();
		
		log += dtf.format(now) + " - " + logs + "\n";
		System.out.println(logs);
	}

	public static void printLogs(){
		System.out.println("\nLogs:\n" + log);
	}

	@Override
	public String toString() {
		return log;
	}
}
