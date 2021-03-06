package com.corso.figure.test;

import com.corso.figure.Figura;
import com.corso.figure.Quadrato;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AOPtest {

    public static void main(String[] args) {
        ConfigurableApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
        factory.registerShutdownHook(); // this should be it, destroys are called before your app exits

        //    Resource resource=new ClassPathResource("beans.xml");
        //    BeanFactory factory=new XmlBeanFactory(resource);

        Figura c1 = (Figura) factory.getBean("figura02");

        Double area = c1.area();

        System.out.println("area finale = " + area);

    }

}
