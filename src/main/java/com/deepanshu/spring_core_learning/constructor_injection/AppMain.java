package com.deepanshu.spring_core_learning.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("constructor_injection_config.xml");
		
		System.out.println("Constructor Injection WITHOUT using type, name, inde ");
		Person person1 = (Person) context.getBean("person1");
		System.out.println(person1.toString());
		
		Person person2 = (Person) context.getBean("person2");
		System.out.println(person2.toString());
		
		System.out.println("Constructor Injection WITHOUT using type ");
		Person person3 = (Person) context.getBean("person3");
		System.out.println(person1.toString());
		
		Person person4 = (Person) context.getBean("person4");
		System.out.println(person2.toString());
		
		System.out.println("Constructor Injection WITHOUT using name ");
		Person person5 = (Person) context.getBean("person5");
		System.out.println(person1.toString());
		
		Person person6 = (Person) context.getBean("person6");
		System.out.println(person2.toString());
		
		System.out.println("Constructor Injection WITHOUT using index ");
		Person person7 = (Person) context.getBean("person5");
		System.out.println(person1.toString());
		
		Person person8 = (Person) context.getBean("person6");
		System.out.println(person2.toString());
	}

}
