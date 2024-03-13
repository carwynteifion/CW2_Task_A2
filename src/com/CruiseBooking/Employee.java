package com.CruiseBooking;

public class Employee {
    private int employeeID;
    private String firstName;
    private String lastName;

    public Employee(int employeeID, String firstName, String lastName) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(123, "Joe", "Bloggs");
        System.out.println(employee);
    }

    // Returns all employee params to backend user
    public void getEmployeeDetails() {

    }
}
