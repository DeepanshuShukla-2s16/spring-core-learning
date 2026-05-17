package com.deepanshu.spring_core_learning.lifecycle.xml_config;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Main class to demonstrate
 * Spring Bean Lifecycle.
 */
public class AppMain {

    public static void main(String[] args) {

        /*
         * Loading Spring configuration file
         * and creating container.
         */
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle_config.xml");

        /*
         * Registering shutdown hook to call destroy method automatically.
         */
        context.registerShutdownHook();

        /*
         * Retrieving bean object.
         */
        Bike bike = (Bike) context.getBean("bike");

        /*
         * Calling business method.
         */
        bike.displayBikeInfo();
        
        context.close();
    }
}