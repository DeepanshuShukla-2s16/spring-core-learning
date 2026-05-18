package com.deepanshu.spring_core_learning.autowiring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Main class to demonstrate
 * constructor based autowiring.
 */
public class AppMain {

    public static void main(String[] args) {

        /*
         * Loading Spring configuration file.
         */
        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "autowire_constructor_config.xml");

        /*
         * Retrieving OrderService bean.
         */
        OrderService orderService =
                (OrderService) context.getBean("orderService");

        /*
         * Calling business method.
         */
        orderService.processOrder();
    }
}