package com.corso.aop;

import java.util.List;

//import com.corso.aop.Loggable.Level;

public class Logger {
	public void log( String message, Object[] arguments ) {
		System.out.println(message);
	}

	public void log(String message, String signature, List<Object> arguments, Exception e) {
		System.out.println(message);
		
	}

	/*public void log(String message, Level level) {
		// TODO Auto-generated method stub
		
	}*/
	
	/*
	public void error(String message) { log(message);}
	public void info(String message) { log(message);}
	public void info(String message) { log(message);}
	public void error(String message) { log(message);}
	*/
	
	
}
