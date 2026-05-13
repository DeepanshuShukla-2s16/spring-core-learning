package com.deepanshu.spring_core_learning.setter_injection;

/*
 * POJO Class (Plain Old Java Object)
 * 
 * This class contains properties, getters, setters,
 * and business methods.
 * 
 * Spring container injects values into this class
 * using setter methods.
 */

public class Student {
	

	// Student id property
	private int staudentId;
	// Student name property
	private String studentName;
	// Student address property
	private String studentAddress;
	
	public Student() {
		super();
	}
	
	
	public int getStaudentId() {
		return staudentId;
	}

	/*
     * Setter method used for dependency injection.
     * Spring container calls this method to inject value.
     */
	public void setStaudentId(int staudentId) {
		this.staudentId = staudentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentAddress() {
		return studentAddress;
	}
	
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	@Override
	public String toString() {
		return "Student [staudentId=" + staudentId + ", studentName=" + studentName + ", studentAddress="
				+ studentAddress + "]";
	}
	

}
