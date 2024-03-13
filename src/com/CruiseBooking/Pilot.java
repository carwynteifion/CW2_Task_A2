package com.CruiseBooking;

public class Pilot extends Employee {
    private Flight flight;
    private int pilotLicenceID;

    public Pilot(int employeeID, String firstName, String lastName, int pilotLicenceID) {
        super(employeeID, firstName, lastName);
        this.pilotLicenceID = pilotLicenceID;
    }

    public static void main(String[] args) {
        Pilot pilot = new Pilot(123, "Joe", "Bloggs", 123);
        System.out.println(pilot);
    }
}
