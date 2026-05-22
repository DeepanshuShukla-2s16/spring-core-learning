package com.deepanshu.spring_core_learning.spring_java_config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 * Main bean class.
 */
@Component
public class Student {

    @Value("101")
    private int studentId;

    @Value("Deepanshu")
    private String studentName;

    /*
     * Reference type dependency.
     */
    @Autowired
    @Qualifier("address")
    private Address address;

    /*
     * Business method.
     */
    public void displayStudentInfo() {

        System.out.println("Student Id : " + studentId);

        System.out.println("Student Name : " + studentName);

        System.out.println(address);
    }
}