package com.CruiseBooking;
public class Customer {
    private int customerID;
    private String emailAddress;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int passportNumber;
    private String[] bookings;

    public Customer(int customerID, String emailAddress, String firstName, String lastName, String phoneNumber, int passportNumber, String[] bookings) {
        this.customerID = customerID;
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.passportNumber = passportNumber;
        this.bookings = bookings;
    }

    public static void main(String[] args) {
        Customer customer = new Customer(123, "joe.bloggs@mail.com", "Joe", "Bloggs", "01234567890", 123456789, null);
        System.out.println(customer);
    }

    // Getters

    // if user is logged out, check if username and password match stored credentials
    // if true, login user. If false, display error message
    public void login() {

    }

    // if user is logged in, log user out
    public void logout() {

    }

    // check bookings associated with customer's ID and display in a list
    public void getBookingHistory() {

    }

    // Setters

    // Sets user's passport number to user input
    public void setPassportNumber() {

    }

    // Sets user's first name to user input
    public void setFirstName() {

    }

    // Sets user's surname to user input
    public void setLastName() {

    }

    // Sets user's email to user input
    public void setEmailAddress() {

    }

    // Sets user's phone number to user input
    public void setPhoneNumber() {

    }

    // Send card details, name, address etc. to main booking to process payment
    public void purchaseBooking() {

    }

}
