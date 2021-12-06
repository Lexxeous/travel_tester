package test.java.org.flights;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
// import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import main.java.org.flights.po.TravelHomePage;

// import java.io.IOException;
// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;

// import java.util.logging.Level;
// import java.util.logging.Logger;

// Airlines
import main.java.org.flights.ac.Airline;

public class MainTest extends TestHelper{

    WebDriver driver;
    TravelHomePage travelHomePage;
    Airline airline;

    private String winWebDriversLocation = "C:/Users/jagibson/webdrivers/";
    // private String macWebDriversLocation = "/"; // TODO

    @BeforeTest
    public void setup() {
        airline = Airline.setAirline("southwest");
        driver = initDriver(winWebDriversLocation, "chrome");
        travelHomePage = new TravelHomePage(driver);
    }

    @Test() // (dataProvider = "getData")
    public void flightTest() { // (HashMap<String,String> reservationDetails)
        travelHomePage.goTo(airline.getUrl());

        // System.out.println(travelHomePage.getFooter().getLinkCount());
        System.out.println(travelHomePage.getNavigationBar(airline.getName()).getLinkCount());
        
        // Factory design pattern abstracts away object creation from the test case
        // travelHomePage.setBookingStrategy("onewaytrip");

        // HashMap<String, String> cities = new HashMap<>();
        // cities.put("origin", "BNA");
        // cities.put("destination", "ORD");
        // cities.put("origin2", "BNA");
        // cities.put("destination2", "LAX");
        // travelHomePage.checkAvail(cities);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    // hashmaps, dataprovider, JSON, jackson, list
    // @DataProvider
    // public Object[][] getData() throws IOException {
    //     List<HashMap<String, String>> l = getJsonData(System.getProperty("./reservationDetails.json"));

    //     return new Object[][]
    //     {
    //         { l.get(0) },  { l.get(1) }
    //     };
    // }
}
