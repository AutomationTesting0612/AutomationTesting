package com.automation.def;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class TestBase {


    public static WebDriver driver;
    public static Properties properties = new Properties();
    public static FileInputStream file;

    public void setup() throws IOException {
       if (driver==null) {
           file = new FileInputStream("application.properties");
           properties.load(file);
       }
       if (properties.getProperty("browser").equalsIgnoreCase("chrome")) {
           WebDriverManager.chromedriver().setup(); //System.setproperty("webdriver.driver.
           ChromeOptions options = new ChromeOptions();
           options.addArguments("--start-maximized");
           options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36");
           //           options.addArguments("--headless");
//           options.addArguments("--remote-allow-origins=*");
//           options.addArguments("--ignore-ssl-errors=ye");
           options.addArguments("--ignore-certificate-errors");
//
//           options.addArguments("--no-sandbox");
//           options.addArguments("--disable-dev-shm-usage");
//           options.addArguments("start-maximized");
           driver = new ChromeDriver();
//           driver.get(properties.getProperty("url"));
       }
    }

    public void tearDown() {
        driver.quit();
    }


}
