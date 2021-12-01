package com.corso.figure;

public class FiguraUnicaInner {

	// Singleton Lazy 
	public static class FiguraUnica {
		private static FiguraUnicaInner.FiguraUnica instance = new FiguraUnicaInner.FiguraUnica();
			
		public static FiguraUnica getInstance() {
			return instance;
		} 
		
		private FiguraUnica() {
			
		}
	}
}
