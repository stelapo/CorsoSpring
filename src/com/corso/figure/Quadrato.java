package com.corso.figure;

public class Quadrato extends Rettangolo {

	public Quadrato(double lato) {
		super(lato,lato);
	}

	public double getLato() {
		return super.getBase(); 
	} 
	
	@Override
	public String toString() {
		return "Quadrato [lato=" + this.getLato() + ", area()=" + area() + "]";
	}
	
}
