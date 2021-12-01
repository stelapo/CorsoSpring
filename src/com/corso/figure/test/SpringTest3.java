package com.corso.figure.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.corso.figure.*;

public class SpringTest3 {

	public static void main(String[] args) {
		  Resource resource=new ClassPathResource("resources/beans.xml");
		    BeanFactory factory=new XmlBeanFactory(resource);  
		      
		    Quadrato c1 =(Quadrato)factory.getBean("figura02");  
		    System.out.println(c1);
		    
		    
		    FiguraUnica fu0 =(FiguraUnica)factory.getBean("unica1");  
		    FiguraUnica fu1 =(FiguraUnica)factory.getBean("unica1");  
		    FiguraUnica fu2 =(FiguraUnica)factory.getBean("unica1");  
		    FiguraUnica fu3 =(FiguraUnica)factory.getBean("unica1");  
		    FiguraUnica fu4 =(FiguraUnica)factory.getBean("unica2");  
		    FiguraUnica fu5 =(FiguraUnica)factory.getBean("unica2");  
		    FiguraUnica fu6 =(FiguraUnica)factory.getBean("unica2");  
			
		    System.out.println(fu0);
		    System.out.println(fu1);
		    System.out.println(fu2);
		    System.out.println(fu3);
		    System.out.println(fu4);
		    System.out.println(fu5);
		    System.out.println(fu6);
		    
		    
		    
		    	    
	}
	        
}
