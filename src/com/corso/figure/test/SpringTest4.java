package com.corso.figure.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.corso.figure.*;

public class SpringTest4 {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("resources/beans.xml");
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    FiguraComposta c1 =(FiguraComposta)factory.getBean("figuraX");  
	    System.out.println(c1);
	    	    
	}

}
