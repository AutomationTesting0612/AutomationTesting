package step.def;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class TestBase {


    public static  WebDriver driver;
    public static Properties properties = new Properties();
    public static FileInputStream file;

    public void setup() throws IOException {
       if (driver==null) {
           file = new FileInputStream("C:\\Users\\HP\\IdeaProjects\\AutomationTesting\\application.properties");
           properties.load(file);
       }
       if (properties.getProperty("browser").equalsIgnoreCase("chrome")) {
           System.setProperty("webdriver.chrome.driver","config/chromedriver.exe");
           ChromeOptions options = new ChromeOptions();
           options.addArguments("--remote-allow-origins=*");
           driver = new ChromeDriver(options);
           driver.get(properties.getProperty("url"));
       }
    }

    public void tearDown() {
        driver.quit();
    }


}
