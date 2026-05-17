package com.deepanshu.spring_core_learning.lifecycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/*
 * Bean class demonstrating lifecycle methods using Spring interfaces.
 */
public class Car implements InitializingBean, DisposableBean {

    private String carName;

    /*
     * Setter method for dependency injection.
     */
    public void setCarName(String carName) {
        this.carName = carName;
    }

    /*
     * This method is automatically called
     * after dependency injection is completed.
     * 
     * Used for initialization tasks.
     */
    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("Initialization method called.");
        System.out.println("Starting resources for : " + carName);
    }

    /*
     * Business method.
     */
    public void displayCarInfo() {

        System.out.println("Car Name : " + carName);
    }

    /*
     * This method is automatically called
     * before bean destruction.
     * 
     * Used for cleanup tasks.
     */
    @Override
    public void destroy() throws Exception {

        System.out.println("Destroy method called.");
        System.out.println("Closing resources for : " + carName);
    }
}