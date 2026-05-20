package com.deepanshu.spring_core_learning.stereotype.annotations.component_value;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Main class to demonstrate
 * stereotype annotations.
 */
public class AppMain {

    public static void main(String[] args) {

        /*
         * Loading Spring configuration.
         */
        ApplicationContext context =
                new ClassPathXmlApplicationContext("stereotype_component_value_config.xml");

        /*
         * Retrieving bean object.
         */
        Student student =
                (Student) context.getBean("collegeStudent");

        /*
         * Calling business method.
         */
        student.displayStudentInfo();
    }
}