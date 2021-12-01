package com.corso.figure.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.corso.figure.Quadrato;

public class SpringInitMethodTest {

	public static void main(String[] args) {
		/* 
		 Resource resource=new ClassPathResource("beans.xml");  
		 BeanFactory factory=new XmlBeanFactory(resource);  
		 */
		 ConfigurableApplicationContext factory = new ClassPathXmlApplicationContext("resources/beans.xml");
		 factory.registerShutdownHook(); // this should be it, destroys are called before your app exits		 
		 
		 
		 Quadrato c1 =(Quadrato)factory.getBean("quadrato");  
		 System.out.println(c1);
		 
		 //c1.area();

		
		 
	}

}
