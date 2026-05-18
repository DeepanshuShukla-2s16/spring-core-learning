package com.deepanshu.spring_core_learning.autowiring.bytype;

/*
 * Dependency bean class.
 * 
 * Spring will inject this bean
 * based on its class type.
 */
public class Address {

    private String city;
    private String state;

    /*
     * Setter method for city property.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /*
     * Setter method for state property.
     */
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {

        return "Address [city=" + city +
                ", state=" + state + "]";
    }
}