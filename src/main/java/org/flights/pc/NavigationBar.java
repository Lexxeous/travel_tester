package main.java.org.flights.pc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import main.java.org.flights.ac.AbstractComponent;

import main.java.org.flights.airlines.Delta;

// When selenium executes any method in this class, scope of selenium should be in the navbar only.
public class NavigationBar extends AbstractComponent {

    // WebElement sectionElement;
    // WebDriver driver;
    // Airline airline;

    By flights = By.cssSelector("[title='Flights']");
    By links = By.cssSelector("a");

    // Constructor
    public NavigationBar(WebDriver driver, String airlineName) {
        super(driver, airlineName); // when you inherit parent class, you should invoke parent class constructor in child constructor
        // By elem = pickAirline(airline);
        this.sectionElement = driver.findElement(this.airline.getNavbar());
    }

    // private By pickAirline(String airline) {
    //     return this.airline.getNavbar();
    //     else if("sw")
    //     return null;
    // }

    public int getLinkCount() {
        return findElems(links).size();
    }
}
