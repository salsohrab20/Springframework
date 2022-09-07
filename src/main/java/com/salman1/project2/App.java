package com.salman1.project2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		
		  ApplicationContext ob= new ClassPathXmlApplicationContext("spring.xml");
		  Vehicle v=(Vehicle)ob.getBean("car"); v.drive();
		 
    	
    	ApplicationContext obj=new ClassPathXmlApplicationContext("spring.xml");
    	Tyre t=(Tyre) obj.getBean("tyre");
    	System.out.println(t);
    	
    };
}
