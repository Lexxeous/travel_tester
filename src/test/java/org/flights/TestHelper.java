package test.java.org.flights;

// import com.fasterxml.jackson.core.type.TypeReference;
// import com.fasterxml.jackson.databind.ObjectMapper;
// import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

// Airlines
import main.java.org.flights.ac.Airline;
import main.java.org.flights.airlines.Delta;
import main.java.org.flights.airlines.Southwest;

// import java.io.File;
// import java.io.IOException;
// import java.nio.charset.StandardCharsets;
// import java.util.HashMap;
// import java.util.List;

public class TestHelper {

    public WebDriver initDriver(String loc, String webBroswerName) {
        String sys_prop;
        String exe;
        WebDriver driver;

        if(webBroswerName.equalsIgnoreCase("chrome") || (webBroswerName.equalsIgnoreCase("gc") || (webBroswerName.equalsIgnoreCase("google chrome")))) {
            sys_prop = "chrome";
            exe = "chromedriver.exe";
            driver = new ChromeDriver();
        }
        else if(webBroswerName.equalsIgnoreCase("firefox") || (webBroswerName.equalsIgnoreCase("ff"))) {
            sys_prop = "firefox";
            exe = "geckodriver.exe";
            driver = new FirefoxDriver();
        }
        else if(webBroswerName.equalsIgnoreCase("edge") || (webBroswerName.equalsIgnoreCase("msedge") || (webBroswerName.equalsIgnoreCase("microsoft edge")))) {
            sys_prop = "edge";
            exe = "msedgedriver.exe";
            driver = new EdgeDriver();
        }
        else if(webBroswerName.equalsIgnoreCase("internet explorer") || (webBroswerName.equalsIgnoreCase("ie"))) {
            sys_prop = "ie";
            exe = "IEDriverServer.exe";
            driver = new InternetExplorerDriver();
        }
        else {
            return null;
        }
        
        System.setProperty("webdriver." + sys_prop + ".driver", loc + exe);
        return driver;

    }

    // public List<HashMap<String, String>> getJsonData(String jsonFilePath) throws IOException {

    //     // convert JSON file content to JSON string
    //     String jsonContent = FileUtils.readFileToString(new File(jsonFilePath),
    //             StandardCharsets.UTF_8);

    //     ObjectMapper mapper = new ObjectMapper();
    //     List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {
    //     });

    //     return data;
    // }
}
