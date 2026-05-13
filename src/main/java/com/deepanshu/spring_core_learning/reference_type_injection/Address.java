package com.deepanshu.spring_core_learning.reference_type_injection;

/*
 * Address class used as a dependency object.
 * 
 * This object will be injected into Person class
 * using reference type setter injection.
 */

public class Address {

    private String city;
    private String state;
	
    public Address() {
		super();
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
    
    
	
    
}
