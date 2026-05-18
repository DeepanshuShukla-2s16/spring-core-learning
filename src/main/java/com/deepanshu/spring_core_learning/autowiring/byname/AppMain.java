package com.deepanshu.spring_core_learning.autowiring.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Main class to demonstrate
 * autowiring byName.
 */
public class AppMain {

    public static void main(String[] args) {

        /*
         * Loading Spring configuration file.
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("autowire_byname_config.xml");

        /*
         * Retrieving Employee bean.
         */
        Employee employee = (Employee) context.getBean("employee");

        /*
         * Printing bean data.
         */
        System.out.println(employee);        
    }
}