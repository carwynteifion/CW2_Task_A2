package com.CruiseBooking;
public class Flight {
    private int flightID;
    private String aircraftName;
    private String pilot;
    private String[] passengerList;
    private int maxCapacity;
    private String departureAirport;
    private String arrivalAirport;
    private double flightPrice;
    private String departureDate;
    private String departureTime;
    private String arrivalDate;
    private String arrivalTime;
    private int seatNumber;
    private int availableSeats;

    public Flight(int flightID, String aircraftName, String pilot, String[] passengerList, int maxCapacity, String departureAirport, String arrivalAirport, double flightPrice, String departureDate, String departureTime, String arrivalDate, String arrivalTime, int seatNumber, int availableSeats) {
        this.flightID = flightID;
        this.aircraftName = aircraftName;
        this.pilot = pilot;
        this.passengerList = passengerList;
        this.maxCapacity = maxCapacity;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.flightPrice = flightPrice;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.seatNumber = seatNumber;
        this.availableSeats = availableSeats;
    }

    public static void main(String[] args) {
        Flight flight = new Flight(123, "Boeing 747", "Joe Bloggs", null, 150, "CWL", "BGI", 500, "14/07/2024", "05:00", "26/07/2024", "12:00", 14, 24);
        System.out.println(flight);
    }

    // Returns list of passengers to backend user
    public void getPassengerList() {

    }

    // Returns pilot name to backend user
    public void getPilot() {

    }

    // Returns aircraft name to backend user
    public void getAircraftName() {

    }

    // Displays price to customer
    public void getPrice() {

    }

    // If availableSeats = 0 return "No seats remaining"
    public void checkAvailability() {

    }
}
