package main.java.org.flights.airlines;

import org.openqa.selenium.By;

import main.java.org.flights.ac.Airline;

public class Southwest extends Airline {
    
    private static final String URL = "https://www.southwest.com/";
    private static final String NAME = "southwest";
    private static final By NAVBAR = By.className("transition-position");
    
    // Constructor
    public Southwest() {
        super(Southwest.URL, Southwest.NAME, Southwest.NAVBAR);
        System.out.println("Southwest Constructor");
    }
}
