package com.corso.figure;

public class Rettangolo implements Figura {

	private double base;
	private double altezza;
	
	
	@Override
	public Double area() {
		
		return this.base*this.altezza;
	}
	
	@Override
	public String toString() {
		return "Rettangolo [base=" + base + ", altezza=" + altezza + ", area()=" + area() + "]";
	}

	public double getBase() {
		return base;
	}

	public Rettangolo(double base, double altezza) {
		super();
		this.base = base;
		this.altezza = altezza;
	}
	

}
