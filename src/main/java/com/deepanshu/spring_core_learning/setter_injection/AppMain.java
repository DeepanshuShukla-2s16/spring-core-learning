package com.deepanshu.spring_core_learning.setter_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppMain 
{
    public static void main( String[] args )
    {
    	/*
         * Loading Spring configuration file
         * and creating Spring IoC container.
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("com/deepanshu/spring_core_learning/setter_injection/setter_injection_config.xml");

        /*
         * Retrieving bean object from Spring container.
         */
        Student student = (Student) context.getBean("student1");

        /*
         * Calling business method.
         */
        System.out.println(student.toString());
    }
}
