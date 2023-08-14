package pom;

import org.bouncycastle.util.io.TeeInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import step.def.TestBase;

public class Login extends TestBase {

    WebDriver driver;

    public Login(WebDriver driver) {
        this.driver=driver;
    }

    private By loginField =By.xpath("//input[@id='user-name']");
    private By passwordField =By.xpath("//input[@id='password']");

    public void enterUserName() {
        driver.findElement(loginField).sendKeys(properties.getProperty("username"));
    }

    public void enterPassword() {
        driver.findElement(passwordField).sendKeys(properties.getProperty("password"));
    }
}
