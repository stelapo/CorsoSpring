package com.corso.figure;

import java.util.*;

public class StellaFactory {

	public FiguraComposta getStella() {
		
		List<Figura> figure = new ArrayList<Figura>(); 
		
		figure.add(new Quadrato(2)); 
		figure.add(new Rettangolo(2,4)); 
		figure.add(new Rettangolo(2,4)); 
		figure.add(new Rettangolo(2,4)); 
		figure.add(new Rettangolo(2,4)); 
		
		return new FiguraComposta(figure);
		
	}
    public FiguraComposta getStella(PoligonoRegolare regolare) {
		
		List<Figura> figure = new ArrayList<Figura>(); 
		
		figure.add(regolare); 
		figure.add(new Rettangolo(2,4)); 
		figure.add(new Rettangolo(2,4)); 
		figure.add(new Rettangolo(2,4)); 
		figure.add(new Rettangolo(2,4)); 
		
		return new FiguraComposta(figure);
		
	}

}
