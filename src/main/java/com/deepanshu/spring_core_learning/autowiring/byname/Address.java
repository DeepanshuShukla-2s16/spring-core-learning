package com.deepanshu.spring_core_learning.autowiring.byname;

/*
 * Dependency class.
 * 
 * This bean will be injected automatically
 * into Employee class using autowiring byName.
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
        return "Address [city=" + city + ", state=" + state + "]";
    }
}