package step.def;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.List;

public class SeleniumTest {

    public static void main (String args[]) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        String path =System.getProperty("user.dir")+ File.separator+"test";

        System.getProperty("user.dir");


        driver.get("https://tus.io/demo");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//input[@id='P0-0']"));
        element.sendKeys(path);
    }
}
