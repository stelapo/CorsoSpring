package com.corso.figure.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.corso.edilizia.Muratore;
import com.corso.figure.Figura;

public class FiguraCompostaTest5 {
	public static void main(String[] args) {
		Resource resource=new ClassPathResource("resources/beans.xml");
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    Figura c1 =(Figura)factory.getBean("figuraM");  
	    System.out.println(c1);
	 
	    Muratore m = new Muratore(); // accoppiamento 
		
	    Figura q=(Figura)factory.getBean("figura02");  
	      
		int num = m.calcolaNumeroMattonelle(c1, q); // Figura 
		
		//m.posaMosaico(q); // QUADRATO
		//m.posaPiastrelle(q); // RETTANGOLO
		
		System.out.println("numero mattonelle " + num );	    
	    
	}
}
