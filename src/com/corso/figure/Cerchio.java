package com.corso.figure;


public class Cerchio implements Figura {

	private double raggio;

	@Override
	public double area() {
		return this.raggio*this.raggio*Math.PI;
	}

	@Override
	public String toString() {
		return "Cerchio [raggio=" + raggio + ", area()=" + area() + "]";
	}

	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}

	public Cerchio(double raggio) {
		super();
		this.raggio = raggio;
	}

	public Cerchio() {
		super();
		System.out.println("costruttore di Cerchio");
		
		
    }
	
	
}
