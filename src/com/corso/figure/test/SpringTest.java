package com.corso.figure.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.corso.edilizia.Muratore;
import com.corso.figure.Figura;


public class SpringTest {
	public static void main(String[] args) {  
	    Resource resource=new ClassPathResource("beans.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
        Figura c =(Figura)factory.getBean("figura01");  
      
        System.out.println(c); 
        
        Figura q=(Figura)factory.getBean("figura02");  
      
        //Quadrato q = new Quadrato(4);
		
		Muratore m = new Muratore(); 
		
		int num = m.calcolaNumeroMattonelle(c, q); // Figura 
		
		//m.posaMosaico(q); // QUADRATO
		//m.posaPiastrelle(q); // RETTANGOLO
		
		System.out.println("numero mattonelle " + num );
	}  
}
