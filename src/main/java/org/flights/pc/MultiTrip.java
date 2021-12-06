package main.java.org.flights.pc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import main.java.org.flights.ac.AbstractComponent;
import main.java.org.flights.ac.SearchFlightAvail;

import java.util.HashMap;
import java.util.function.Consumer;

public class MultiTrip extends AbstractComponent implements SearchFlightAvail {

    private By from = By.id("todo"); // origin
    private By to = By.id("todo"); // destination

    private By from2 = By.id("todo"); // origin2
    private By to2 = By.id("todo"); // destination2

    private By multiCityBtn = By.id("todo");
    private By popUp = By.id("todo");


    // Constructor
    public MultiTrip(WebDriver driver, String airlineName) {
        super(driver, airlineName);
    }

    @Override
    public void checkAvail(HashMap<String, String> reservationDetails) {

        makeStateReady(s -> 
            selectOriginCity(reservationDetails.get("origin")) // origin
        );
        selectDestinationCity(reservationDetails.get("destination")); // destination

        selectOriginCity2(reservationDetails.get("origin2")); // origin2
        selectDestinationCity2(reservationDetails.get("destination2")); // destination2
    }

    // Each independent drop-down contains all of the cities, each city result will be found up to 6 times
    public void selectOriginCity(String origin) {
        findElem(from).click();
        findElem(By.xpath("(//a[@value='"+origin+"'])[1]")).click();
    }

    public void selectDestinationCity(String destination) {
        findElem(to).click();
        findElem(By.xpath("(//a[@value='"+destination+"'])[2]")).click();
    }

    public void selectOriginCity2(String origin2) {
        findElem(from2).click();
        findElem(By.xpath("(//a[@value='"+origin2+"'])[3]")).click();
    }

    public void selectDestinationCity2(String destination2) {
        findElem(to2).click();
        findElem(By.xpath("(//a[@value='"+destination2+"'])[4]")).click();
    }

    // Execute Around design pattern to make test case state ready for it's operations
    public void makeStateReady(Consumer<MultiTrip> consumer) {
        findElem(multiCityBtn).click();
        findElem(popUp).click();
        waitForElementToDisappear(popUp);
        consumer.accept(this); // do pre-requisite code before executing class method
    }
}
