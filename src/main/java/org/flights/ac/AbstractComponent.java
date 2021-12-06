package main.java.org.flights.ac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Airlines
import main.java.org.flights.ac.Airline;

import java.util.List;

// This class allows us to use it's abstract methods with any page component class methods.
public abstract class AbstractComponent {

    public WebElement sectionElement;
    public WebDriver driver;
    public Airline airline;

    // Constructor
    protected AbstractComponent(WebDriver driver, String airlineName) {
        // This constructor method gets invoked when super() is called from child classes.
        this.driver = driver;
        this.airline = Airline.setAirline(airlineName);
        // this.sectionElement = driver.findElement(sectionElement);
    }

    public WebElement findElem(By elem) {
        return sectionElement.findElement(elem);
    }

    public List<WebElement> findElems(By elem) {
        return sectionElement.findElements(elem);
    }

    public void waitForElementToDisappear(By elem) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(elem));
    }
}
