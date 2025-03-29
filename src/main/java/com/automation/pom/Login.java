package com.automation.pom;

import com.automation.def.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
