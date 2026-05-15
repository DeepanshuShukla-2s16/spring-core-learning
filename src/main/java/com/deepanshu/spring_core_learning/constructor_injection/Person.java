package com.deepanshu.spring_core_learning.constructor_injection;
/*
 * Person class demonstrating constructor injection in Spring Core.
 * 
 * Spring container injects values using parameterized constructor.
 */
public class Person {

	private int personId;
	private String personName;
	private int personAge;
	
	/*
     * Parameterized constructor used for constructor injection.
     */
	public Person(int personId, String personName, int personAge) {
		super();
		System.out.println("First Parameterized constructor called.");

		this.personId = personId;
		this.personName = personName;
		this.personAge = personAge;
	}
	
	/*
     * Parameterized constructor used for constructor injection.
     */
	public Person(String personName, int personAge, int personId) {
		super();
		System.out.println("Second Parameterized constructor called.");

		this.personId = personId;
		this.personName = personName;
		this.personAge = personAge;
	}
	
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personAge=" + personAge + "]";
	}
}
