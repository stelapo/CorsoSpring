package com.corso.figure;

import java.io.File;

// Singleton
// obiettivo: ottenere una unica istanza di
// una data classe in tutto il progetto. 



// Singleton Lazy 
public class FiguraUnica {
	 
	private static FiguraUnica instance = null;
	
	private static String prova = new String("prova");   
	
	public static FiguraUnica getInstance() {
		System.out.println("Singleton: getInstance()");
		//...
		
			if (instance == null) {
				System.out.println("Sto creando una istanza");
				
				synchronized (prova) {
					if (instance == null) {
						instance = new FiguraUnica();
					}
				}
				System.out.println("istanza: " + instance);
			}
		
		
		// ... 
		
		return instance;
	} 
	
	
	private FiguraUnica() {
		
	}
	
}
