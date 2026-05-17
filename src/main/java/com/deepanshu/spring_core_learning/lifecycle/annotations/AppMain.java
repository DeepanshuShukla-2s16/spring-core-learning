package com.deepanshu.spring_core_learning.lifecycle.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Main class to demonstrate
 * annotation based lifecycle methods.
 */
public class AppMain {

    public static void main(String[] args) {

        /*
         * Loading Spring configuration file
         * and creating Spring container.
         */
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle_annotation_config.xml");

        /*
         * Registering shutdown hook
         * for @PreDestroy execution.
         */
        context.registerShutdownHook();

        /*
         * Retrieving bean object.
         */
        Laptop laptop = (Laptop) context.getBean("laptop");

        /*
         * Calling business method.
         */
        laptop.displayLaptopInfo();
        
        context.close();
    }
}