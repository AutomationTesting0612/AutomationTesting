package com.automation.utils.ui.pom;

import com.automation.def.TestBase;
import org.openqa.selenium.By;

public class LoginDOPStepDef extends TestBase {

    public void enterTheUsernameAndAndClickOnSubmitButton(String userXpath, String user, String userProceedButton,
                                                           String passXpath, String pass, String passProceedButton) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            driver.findElement(By.xpath(userXpath)).sendKeys(user);
            driver.findElement(By.xpath(userProceedButton)).click();
        driver.findElement(By.xpath(passXpath)).sendKeys(pass);
        driver.findElement(By.xpath(passProceedButton)).click();
        }
    }

