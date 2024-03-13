package com.CruiseBooking;

public class Captain extends Employee {
    private Cruise cruise;
    private int boatmasterLicenceID;

    public Captain(int employeeID, String firstName, String lastName, int boatmasterLicenceID) {
        super(employeeID, firstName, lastName);
        this.boatmasterLicenceID = boatmasterLicenceID;
    }

    public static void main(String[] args) {
        Captain captain = new Captain(123, "Joe", "Bloggs", 123);
        System.out.println(captain);
    }
}
