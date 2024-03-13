package com.CruiseBooking;
public class CruiseExcursion {
    private int excursionID;
    private String excursionName;
    private String excursionPort;
    private String excursionDate;
    private String excursionTime;
    private double excursionPrice;
    private int maxCapacity;
    private Cruise cruise;

    public CruiseExcursion(int excursionID, String excursionName, String excursionPort, String excursionDate, String excursionTime, double excursionPrice, int maxCapacity) {
        this.excursionID = excursionID;
        this.excursionName = excursionName;
        this.excursionPort = excursionPort;
        this.excursionDate = excursionDate;
        this.excursionTime = excursionTime;
        this.excursionPrice = excursionPrice;
        this.maxCapacity = maxCapacity;
    }

    public static void main(String[] args) {
        CruiseExcursion excursion = new CruiseExcursion(123, "Excursion", "Bridgetown", "17/07/2024", "09:00", 51.99, 25);
        System.out.println(excursion);
    }
}
