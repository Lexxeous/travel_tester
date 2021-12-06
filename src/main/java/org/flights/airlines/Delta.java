package main.java.org.flights.airlines;

import org.openqa.selenium.By;

import main.java.org.flights.ac.Airline;

public class Delta extends Airline {
    
    private static final String URL = "https://www.delta.com/";
    private static final String NAME = "delta";
    private static final By NAVBAR = By.className("navbar");
    
    // Constructor
    public Delta() {
        super(Delta.URL, Delta.NAME, Delta.NAVBAR);
        System.out.println("Delta Constructor");
    }
}
