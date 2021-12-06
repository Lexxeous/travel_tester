package main.java.org.flights.pc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import main.java.org.flights.ac.AbstractComponent;
import main.java.org.flights.ac.SearchFlightAvail;

import java.util.HashMap;

public class RoundTrip extends AbstractComponent implements SearchFlightAvail {

    private By from = By.id("todo"); // origin
    private By to = By.id("todo"); // destination

    private By roundTripBtn = By.id("todo");
    private By search = By.id("todo");

    // Constructor
    public RoundTrip(WebDriver driver, String airlineName) {
        super(driver, airlineName);
    }


    @Override
    public void checkAvail(HashMap<String, String> reservationDetails) {
        findElem(roundTripBtn).click();
        findElem(from).click();
        selectOriginCity(reservationDetails.get("origin"));
        selectDestinationCity(reservationDetails.get("destination"));
        findElem(search).click();
    }

    public void selectOriginCity(String origin) {
        findElem(from).click();
        findElem(By.xpath("(//a[@value='"+origin+"'])[1]")).click();
    }

    public void selectDestinationCity(String destination) {
        findElem(to).click();
        findElem(By.xpath("(//a[@value='"+destination+"'])[2]")).click();
    }
}
