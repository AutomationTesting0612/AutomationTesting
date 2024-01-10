package fluentDOP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pom.Home;
import pom.Login;
import step.def.TestBase;

public class LoginFluent extends TestBase {

    WebDriver driver;

    @FindBy(xpath ="//input[@id='user-name']")
    private WebElement loginField;

    @FindBy(xpath ="//input[@id='password']")
    private WebElement password;

    @FindBy(xpath ="//input[@id='login-button']")
    private WebElement submit;

    public LoginFluent(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public LoginFluent enterUserName(String text) {
        loginField.sendKeys(text);
        return this;
    }

    public LoginFluent enterPassword(String text) {
        password.sendKeys(text);
        return this;
    }

    public HomeFluent submitButton() {
        submit.click();
        return new HomeFluent(driver);
    }

    public static LoginFluent using(WebDriver driver) {
        return new LoginFluent(driver);
    }
}
