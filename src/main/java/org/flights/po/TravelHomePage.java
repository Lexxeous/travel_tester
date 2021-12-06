package main.java.org.flights.po;

import org.openqa.selenium.WebDriver;

import main.java.org.flights.ac.SearchFlightAvail;
import main.java.org.flights.ac.StrategyFactor;
import main.java.org.flights.pc.Footer;
import main.java.org.flights.pc.NavigationBar;

import java.util.HashMap;

public class TravelHomePage {
    WebDriver driver; // when you use the driver object, you will search the entire page
    SearchFlightAvail chosenStrategy;

    // Constructor
    public TravelHomePage(WebDriver driver) {
        // Must pass <driver> for different section elements to use same WebDriver across all page objects/components.
        this.driver = driver;
    }

    public void goTo(String url) {
        driver.get(url);
    }

    // Single Responsibility Principle (SRP) design pattern allows isolation of individual section(s) within page objects
    public NavigationBar getNavigationBar(String airline) {
        // Scope element selection to the navigation bar only.
        return new NavigationBar(driver, airline);
    }

    // Single Responsibility Principle (SRP) design pattern allows isolation of individual section(s) within page objects
    public Footer getFooter(String airline) {
        // Scope element selection to the footer section only.
        return new Footer(driver, airline);
    }

    public void setBookingStrategy(String strategyType, String airlineName) {
        StrategyFactor strategyFactor = new StrategyFactor(driver);
        chosenStrategy = strategyFactor.createStrategy(strategyType, airlineName);
        this.chosenStrategy = chosenStrategy;
    }

    public void checkAvail(HashMap<String,String> reservationDetails) {
        chosenStrategy.checkAvail(reservationDetails);
    }
    
    public String getTitle() {
        System.out.println("Hello");
        return driver.getTitle();
    }
}
