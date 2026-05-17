package com.deepanshu.spring_core_learning.lifecycle.annotations;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

/*
 * Bean class demonstrating annotation based lifecycle methods.
 */
public class Laptop {

    private String laptopName;

    /*
     * Setter method for dependency injection.
     */
    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    /*
     * This method is automatically called after bean creation and dependency injection.
     * 
     * Used for initialization tasks.
     */
    @PostConstruct
    public void start() {

        System.out.println("PostConstruct method called.");
        System.out.println("Starting resources for : " + laptopName);
    }

    /*
     * Business method.
     */
    public void displayLaptopInfo() {

        System.out.println("Laptop Name : " + laptopName);
    }

    /*
     * This method is automatically called before bean destruction.
     * 
     * Used for cleanup tasks.
     */
    @PreDestroy
    public void close() {

        System.out.println("PreDestroy method called.");
        System.out.println("Closing resources for : " + laptopName);
    }
}