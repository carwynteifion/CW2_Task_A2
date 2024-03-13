package com.CruiseBooking;
public class MainBooking {
    private int bookingID;
    private Flight flight;
    private Cruise cruise;
    private Hotel hotel;
    private CruiseExcursion excursion;
    private Customer customer;
    private AirportParking airportParking;

    public MainBooking(int bookingID) {
        this.bookingID = bookingID;
    }

    public static void main(String[] args) {
        MainBooking booking = new MainBooking(123);
        System.out.println(booking);
    }

    // Add a cruise to the main booking
    public void addCruise() {

    }

    // Add a flight to the main booking
    public void addFlight() {

    }

    // Add a hotel to the main booking
    public void addHotel() {

    }

    // Add a cruise excursion to the main booking
    public void addExcursion() {

    }

    // Add airport parking to the main booking
    public void addParking() {

    }

    // Add up the prices of each part of the booking and display
    public void getTotalCost() {

    }

    // Display summary of purchased booking
    public void showBookingSummary() {

    }

    // Handle payment process
    public void processBookingPayment() {

    }

    // Collate dates and times of each section of the booking and display to user
    public void displayItinerary() {

    }
}
