package com.deepanshu.spring_core_learning.lifecycle.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Main class to demonstrate
 * interface based lifecycle methods.
 */
public class AppMain {

    public static void main(String[] args) {

        /*
         * Loading Spring configuration file
         * and creating Spring container.
         */
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("lifecycle_interface_config.xml");

        /*
         * Registering shutdown hook
         * for destroy method execution.
         */
        context.registerShutdownHook();

        /*
         * Retrieving bean object.
         */
        Car car = (Car) context.getBean("car");

        /*
         * Calling business method.
         */
        car.displayCarInfo();
        
        context.close();
    }
}