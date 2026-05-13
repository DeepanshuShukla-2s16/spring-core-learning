package com.deepanshu.spring_core_learning.reference_type_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Main class to load Spring container
 * and retrieve beans.
 */
public class AppMain {

	public static void main(String[] args) {
		
//          Loading Spring configuration file.
		ApplicationContext context = new ClassPathXmlApplicationContext("reference_type_injection_config.xml");
		
//		Retrieving Person bean from container.
		Person person1 = (Person) context.getBean("person1");
		System.out.println(person1.toString());
		
		System.out.println("\n========================================================================\n");
//		Retrieving Address bean from container.
		Address address = (Address) context.getBean("address");
		
		System.out.println(address.getCity());
		System.out.println(address.getState());
		System.out.println(address.toString());
		
	}
}
