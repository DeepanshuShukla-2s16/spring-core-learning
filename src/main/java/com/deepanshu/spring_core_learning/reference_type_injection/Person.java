package com.deepanshu.spring_core_learning.reference_type_injection;

/*
 * Person class containing reference type dependency (personAddress).
 * 
 * Spring container injects Address object
 * into Person object using setter injection.
 */

public class Person {

	private int personId;
	private String personName;
	// Reference type dependency
	private Address personAddress;
	
	public Person() {
		super();
	}
	
	public int getPersonId() {
		return personId;
	}
	
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	
	public String getPersonName() {
		return personName;
	}
	
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	public Address getPersonAddress() {
		return personAddress;
	}
	
	/*
     * Setter injection for Address object.
     */
	public void setPersonAddress(Address personAddress) {
		this.personAddress = personAddress;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personAddress=" + personAddress + "]";
	}
	
	
}
