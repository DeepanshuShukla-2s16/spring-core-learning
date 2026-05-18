package com.deepanshu.spring_core_learning.autowiring.byname;

/*
 * Main bean class demonstrating
 * autowiring byName.
 */
public class Employee {

    private int empId;
    private String empName;

    /*
     * Property name is 'address'.
     * 
     * Spring will search bean with id="address"
     * and inject it automatically.
     */
    private Address address;

    /*
     * Setter method for employee id.
     */
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    /*
     * Setter method for employee name.
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /*
     * Setter injection for Address dependency.
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {

        return "Employee [empId=" + empId +
                ", empName=" + empName +
                ", address=" + address + "]";
    }
}