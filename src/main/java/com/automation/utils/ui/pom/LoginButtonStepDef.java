package com.automation.utils.ui.pom;

import com.automation.def.TestBase;
import org.openqa.selenium.By;

public class LoginButtonStepDef extends TestBase {

    public void clickLoginButton(String loginButtonXpath) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            driver.findElement(By.xpath(loginButtonXpath)).click();
        }
    }

