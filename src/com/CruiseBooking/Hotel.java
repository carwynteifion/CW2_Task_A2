package com.CruiseBooking;
public class Hotel {
    private int hotelID;
    private String hotelName;
    private String hotelAddress;
    private String hotelCountry;
    private int totalRooms;
    private int roomsAvailable;
    private int maxCapacity;
    private double costPerNight;
    private int numberOfNights;
    private String arrivalDate;
    private String departureDate;
    private String checkInTime;
    private String checkOutTime;
    private int roomNumber;

    public Hotel(int hotelID, String hotelName, String hotelAddress, String hotelCountry, int totalRooms, int roomsAvailable, int maxCapacity, double costPerNight, int numberOfNights, String arrivalDate, String departureDate, String checkInTime, String checkOutTime, int roomNumber) {
        this.hotelID = hotelID;
        this.hotelName = hotelName;
        this.hotelAddress = hotelAddress;
        this.hotelCountry = hotelCountry;
        this.totalRooms = totalRooms;
        this.roomsAvailable = roomsAvailable;
        this.maxCapacity = maxCapacity;
        this.costPerNight = costPerNight;
        this.numberOfNights = numberOfNights;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.roomNumber = roomNumber;
    }

    public static void main(String[] args) {
        Hotel preCruiseHotel = new Hotel(123, "Fawlty Towers", "Torquay", "UK", 10, 3, 20, 50, 1, "14/07/2024", "15/07/2024", "14:00", "10:00", 2);
        System.out.println(preCruiseHotel);
    }

    // Display hotel details to customer
    public void getBookingDetails() {

    }

    // Display name of hotel to user
    public void getHotelName() {

    }

    // Calculate total cost of hotel stay based on hotel and number of nights
    public void getTotalCost() {

    }

    // Return "No rooms available" if roomsAvailable is 0
    public void checkAvailability() {

    }
}
