package com.deepanshu.spring_core_learning.lifecycle.xml_config;

/*
 * Bean class demonstrating spring Bean Lifecycle Methods.
 */
public class Bike {

    private String bikeName;

    /*
     * Setter method for dependency injection.
     */
    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    /*
     * This method will be called automatically after bean creation and dependency injection.
     * 
     * Used for initialization tasks.
     */
    public void init() {

        System.out.println("Init method called.");
        System.out.println("Starting resources for : " + bikeName);
    }

    /*
     * Business method.
     */
    public void displayBikeInfo() {

        System.out.println("Bike Name : " + bikeName);
    }

    /*
     * This method will be called automatically
     * before bean destruction.
     * 
     * Used for cleanup tasks.
     */
    public void destroy() {

        System.out.println("Destroy method called.");
        System.out.println("Closing resources for : " + bikeName);
    }
}