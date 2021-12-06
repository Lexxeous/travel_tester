package main.java.org.flights.ac;

import org.openqa.selenium.By;

import main.java.org.flights.airlines.Delta;
import main.java.org.flights.airlines.Southwest;

public abstract class Airline {
    
    private String URL;
    private String NAME;
    private By NAVBAR;

    // Constructor
    protected Airline(String URL, String NAME, By NAVBAR) {
        this.URL = URL;
        this.NAME = NAME;
        this.NAVBAR = NAVBAR;
    }

    public static Airline setAirline(String airlineName) {
        if("delta".equalsIgnoreCase(airlineName)) { return new Delta(); }
        else if(airlineName.equalsIgnoreCase("sw") || airlineName.equalsIgnoreCase("southwest")) { return new Southwest(); }
        return null;
    }

    public String getUrl() {
        return this.URL;
    }

    public String getName() {
        return this.NAME;
    }

    public By getNavbar() {
        return this.NAVBAR;
    }
}

