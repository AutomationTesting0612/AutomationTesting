package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import step.def.TestBase;

public class Login extends TestBase {

    WebDriver driver;

    @FindBy(xpath ="//input[@id='user-name']")
    private WebElement loginField;

    @FindBy(xpath ="//input[@id='password']")
    private WebElement password;

    @FindBy(xpath ="//input[@id='login-button']")
    private WebElement submit;

    public Login(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void enterUserName(String text) {
        loginField.sendKeys(text);
    }

    public void enterPassword(String text) {
        password.sendKeys(text);
    }

    public void submitButton() {
        submit.click();
    }

}
