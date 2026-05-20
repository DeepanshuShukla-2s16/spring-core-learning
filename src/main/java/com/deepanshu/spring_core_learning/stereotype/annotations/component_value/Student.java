package com.deepanshu.spring_core_learning.stereotype.annotations.component_value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 * @Component tells Spring:
 * 
 * "Create object of this class
 * and store it inside container."
 */
@Component("collegeStudent")
public class Student {

    /*
     * @Value injects simple values
     * into variables.
     */
    @Value("101")
    private int studentId;

    @Value("Deepanshu")
    private String studentName;

    @Value("Spring Framework")
    private String courseName;

    /*
     * Business method.
     */
    public void displayStudentInfo() {

        System.out.println("Student Id : " + studentId);

        System.out.println("Student Name : " + studentName);

        System.out.println("Course Name : " + courseName);
    }
}