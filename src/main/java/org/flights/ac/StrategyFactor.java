package main.java.org.flights.ac;

import org.openqa.selenium.WebDriver;

// Strategies
import main.java.org.flights.pc.MultiTrip;
import main.java.org.flights.pc.OneWayTrip;
import main.java.org.flights.pc.RoundTrip;


public class StrategyFactor {
    WebDriver driver;

    // Constructor
    public StrategyFactor(WebDriver driver) {
        this.driver = driver;
    }

    // Strategy design pattern allows us to use multiple potential inputs for the same interface
    public SearchFlightAvail createStrategy(String strategyType, String airlineName)
    {
        if(strategyType.equalsIgnoreCase("multitrip")) {
           return new MultiTrip(driver, airlineName);
        }

        if(strategyType.equalsIgnoreCase("roundtrip")) {
            return new RoundTrip(driver, airlineName);
        }

        if(strategyType.equalsIgnoreCase("onewaytrip")) {
            return new OneWayTrip(driver, airlineName);
        }
        return null;
    }
}
