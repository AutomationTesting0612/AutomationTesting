package step.def;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
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
           file = new FileInputStream("application.properties");
           properties.load(file);
       }
       if (properties.getProperty("browser").equalsIgnoreCase("chrome")) {
           ChromeDriverManager.chromedriver().setup();
           ChromeOptions options = new ChromeOptions();
           options.addArguments("--headless");
           options.addArguments("--remote-allow-origins=*");
           options.addArguments("--ignore-ssl-errors=ye");
           options.addArguments("--ignore-certificate-errors");
           
           options.addArguments("--no-sandbox");
           options.addArguments("--disable-dev-shm-usage");
           options.addArguments("start-maximized");
           driver = new ChromeDriver(options);
           driver.get(properties.getProperty("url"));
       }
    }

    public void tearDown() {
        driver.quit();
    }


}
