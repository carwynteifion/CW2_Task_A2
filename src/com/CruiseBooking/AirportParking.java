package com.CruiseBooking;
public class AirportParking {
    private int parkingBookingID;
    private String airportLocation;
    private String parkingSpaceID;
    private int numberOfDaysBooked;
    private String startDate;
    private String endDate;
    private int numberOfSpaces;
    private int spacesLeft;
    private Flight flight;

    public AirportParking(int parkingBookingID, String airportLocation, String parkingSpaceID, int numberOfDaysBooked, String startDate, String endDate, int numberOfSpaces,  int spacesLeft) {
        this.parkingBookingID = parkingBookingID;
        this.airportLocation = airportLocation;
        this.parkingSpaceID = parkingSpaceID;
        this.numberOfDaysBooked = numberOfDaysBooked;
        this.startDate = startDate;
        this.endDate = endDate;
        this.numberOfSpaces = numberOfSpaces;
        this.spacesLeft = spacesLeft;
    }

    public static void main(String[] args) {
        AirportParking airportParking = new AirportParking(123, "EGFF", "A135", 14, "12/07/2024", "26/07/2024", 600, 57);
        System.out.println(airportParking);
    }

    // If spacesLeft = 0 return "no spaces remaining"
    public void checkAvailability() {

    }

    // Display parking booking details to customer
    public void getParkingDetails() {

    }
}
