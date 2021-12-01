package com.corso.figure;

import com.corso.aop.Loggable;

public class Quadrato extends Rettangolo implements PoligonoRegolare{


	
	public Quadrato(double lato) {
		super(lato,lato);
		System.out.println("costruttore con double");
	}

	public Quadrato(String lato) {
		super(Double.parseDouble(lato),Double.parseDouble(lato));
		System.out.println("costruttore con stringhe");
	}	
	
	public double getLato() {
		return super.getBase(); 
	} 
	

	@Override
	public String toString() {
		return "Quadrato [lato=" + this.getLato() + ", area()=" + area() + "]";
	}
	
	public void init() {
		System.out.println("metodo init invocato!"); 
	}
	
	public void destroy() {
		System.out.println("metodo destroy invocato!"); 
	}
}
