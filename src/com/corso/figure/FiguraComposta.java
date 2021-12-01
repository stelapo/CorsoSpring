package com.corso.figure;

import java.util.List;

public class FiguraComposta implements Figura {
	
	List<Figura> figure = null;

	public FiguraComposta(List<Figura> figure) {
		super();
		this.figure = figure;
	}

	@Override
	public String toString() {
		return "FiguraComposta [figure=" + figure + "]";
	}

	@Override
	public Double area() {
		
		double s = 0; 
		for(Figura f:figure) {
			s = f.area();  	
		} 
		
		return s;
	}
	
	


}
