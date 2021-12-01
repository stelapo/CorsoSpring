package com.corso.figure.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.corso.edilizia.Muratore;
import com.corso.figure.*;

public class FigureTest2 {

	public static void main(String[] args) {  
	    Resource resource=new ClassPathResource("resources/beans.xml");
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    Cerchio c1 =(Cerchio)factory.getBean("cerchio2");  
	    Cerchio c2 =(Cerchio)factory.getBean("cerchio2");  
        
        System.out.println(c1);
        System.out.println(c2);	    
	    
        c2.setRaggio(5); 
        
        // Cerchio c1 = new Cerchio(4);
        // Cerchio c2 = new Cerchio(5);
        
        
        System.out.println(c1);
        System.out.println(c2);
        
        
        
        
        
        Muratore m = new Muratore(); 
		
		int num = m.calcolaNumeroMattonelle(c1, c2); // Figura 
		
		System.out.println("numero mattonelle " + num );
	} 

}
