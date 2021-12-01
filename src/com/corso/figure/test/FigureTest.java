package com.corso.figure.test;

import com.corso.edilizia.Muratore;
import com.corso.figure.Cerchio;
import com.corso.figure.Quadrato;

public class FigureTest {

	public static void main(String[] args) {
			
		Cerchio c = new Cerchio(40);
		
		Quadrato q = new Quadrato(4);
		
		Muratore m = new Muratore(); 
		
		int num = m.calcolaNumeroMattonelle(c, q); // Figura 
		
		m.posaMosaico(q); // QUADRATO
		m.posaPiastrelle(q); // RETTANGOLO
		
		System.out.println("numwero mattonelle " + num );
		
	}

}
