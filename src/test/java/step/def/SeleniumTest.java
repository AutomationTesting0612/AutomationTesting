package step.def;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class SeleniumTest {

    public static void main (String args[]) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);


        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        List<WebElement> element = driver.findElements(By.xpath("//input"));
        for (int i=0;i< element.size(); i++) {
            System.out.println(element);
        }
    }
}
