package main.java.org.flights.pc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import main.java.org.flights.ac.AbstractComponent;

// When selenium executes any method in this class, scope of selenium should be in the footer only.
public class Footer extends AbstractComponent {

    By links = By.cssSelector("a");

    // Constructor
    public Footer(WebDriver driver, String airlineName) {
        super(driver, airlineName); // when you inherit parent class, you should invoke parent class constructor in child constructor
    }

    public int getLinkCount() {
        return findElems(links).size();
    }
}
