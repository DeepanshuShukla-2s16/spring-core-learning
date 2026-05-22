package com.deepanshu.spring_core_learning.spring_java_config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 * Dependency bean class.
 */
@Component
public class Address {

    @Value("Lucknow")
    private String city;

    @Value("Uttar Pradesh")
    private String state;


	public void setCity(String city) {
		this.city = city;
	}


	public void setState(String state) {
		this.state = state;
	}


	@Override
    public String toString() {

        return "Address [city=" + city +
                ", state=" + state + "]";
    }
}