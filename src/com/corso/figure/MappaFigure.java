package com.corso.figure;

import java.util.*;

public class MappaFigure implements Figura {
	
	private LinkedHashMap<String, Figura> figure;

	public MappaFigure(LinkedHashMap<String, Figura> figure) {
		super();
		this.figure = figure;
	}

	@Override
	public Double area() {
		return new Double(100);
	} 
	
}
