package com.deepanshu.spring_core_learning.autowiring.bytype;

/*
 * Main bean class demonstrating
 * autowiring byType.
 */
public class Employee {

    private int empId;
    private String empName;

    /*
     * Spring checks this datatype
     * and searches matching bean type.
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