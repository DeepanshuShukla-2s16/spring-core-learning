package com.deepanshu.spring_core_learning.spring_java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * Main class to demonstrate
 * Java Configuration.
 */
public class AppMain {

    public static void main(String[] args) {

        /*
         * Loading Java configuration class.
         */
        ApplicationContext context =
                new AnnotationConfigApplicationContext(JavaSpringConfig.class);

        /*
         * Retrieving bean object.
         */
        Student student = context.getBean(Student.class);

        /*
         * Calling business method.
         */
     
        student.displayStudentInfo();
       
    }
}