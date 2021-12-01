package com.corso.figure;

import com.corso.aop.Loggable;

public class Rettangolo implements Figura {

	private double base;
	private double altezza;
	
	@Loggable//(level = Loggable.Level.DEBUG)
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
