package com.corso.figure.test;

import com.corso.figure.FiguraUnica;
import com.corso.figure.FiguraUnicaEnum;
import com.corso.thread.UsaFigureThread;

public class FiguraUnicaTest {

	public static void main(String[] args) {
		
		for (int i=0; i<10; i++) {
			UsaFigureThread usaFigura = new UsaFigureThread();
			usaFigura.start();
			
		}
		
		FiguraUnicaEnum fu = FiguraUnicaEnum.istanzaUnica; 
			
	}

}
