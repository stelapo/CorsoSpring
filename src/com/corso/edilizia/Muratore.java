package com.corso.edilizia;

import com.corso.figure.Figura;
import com.corso.figure.Quadrato;
import com.corso.figure.Rettangolo;
import com.corso.figure.test.*;

public class Muratore {
	public int calcolaNumeroMattonelle(Figura pavimento, Figura mattonella) {
		return (int) (pavimento.area()/mattonella.area()*1.1);
	}
	
	public void posaMosaico(Quadrato mattonella) {
		System.out.println("sto costruendo un mosaico con " + mattonella);
	}
	
	public void posaPiastrelle(Rettangolo mattonella) {
		System.out.println("sto costruendo un pavimento rettangolare con " + mattonella);
	}	
}
