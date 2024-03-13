package com.CruiseBooking;
public class Cruise {
    private int cruiseID;
    private String departurePort;
    private String[] portsOfCall;
    private String arrivalPort;
    private String departureDate;
    private String departureTime;
    private String arrivalDate;
    private String arrivalTime;
    private String shipName;
    private String captain;
    private String[] passengerList;
    private double cruisePrice;
    private int maxCapacity;
    private int cabinNumber;
    private int cabinsAvailable;

    public Cruise(int cruiseID, String departurePort, String[] portsOfCall, String arrivalPort, String departureDate, String departureTime, String arrivalDate, String arrivalTime, String shipName, String captain, String[] passengerList, double cruisePrice, int maxCapacity, int cabinNumber, int cabinsAvailable) {
        this.cruiseID = cruiseID;
        this.departurePort = departurePort;
        this.portsOfCall = portsOfCall;
        this.arrivalPort = arrivalPort;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.shipName = shipName;
        this.captain = captain;
        this.passengerList = passengerList;
        this.cruisePrice = cruisePrice;
        this.maxCapacity = maxCapacity;
        this.cabinNumber = cabinNumber;
        this.cabinsAvailable = cabinsAvailable;
    }

    public static void main(String[] args) {
        Cruise cruise = new Cruise(123, "Bridgetown", null, "Port of Spain", "15/07/2024", "09:00", "25/07/2024", "11:00", "Boaty McBoatFace", "Jack Sparrow", null, 1500, 750, 345, 100);
        System.out.println(cruise);
    }

    // Return name of ship to backend user
    public void getShipName() {

    }

    // Return list of passengers to backend user
    public void getPassengerList() {

    }

    // Return name of captain to backend user
    public void getCaptain() {

    }

    // Show route to customer
    public void getRoute() {

    }

    // Calculate and display price to customer
    public void getPrice() {

    }

    // If cabinsAvailable = 0, return "No availability"
    public void checkAvailability() {

    }
}
