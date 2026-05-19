package com.deepanshu.spring_core_learning.annotations.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Main class to demonstrate
 * @Qualifier annotation.
 */
public class AppMain {

    public static void main(String[] args) {

        /*
         * Loading Spring configuration file.
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("qualifier_annotaion_config.xml");

        /*
         * Retrieving bean object.
         */
        OrderService orderService =
                (OrderService) context.getBean("orderService");

        /*
         * Calling business method.
         */
        orderService.placeOrder();
    }
}