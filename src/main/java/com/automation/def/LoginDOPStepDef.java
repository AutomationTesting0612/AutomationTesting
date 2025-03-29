package com.automation.def;


import com.automation.fluentDOP.LoginFluent;

import static com.automation.def.TestBase.driver;

public class LoginDOPStepDef {

    public void enterTheUsernameAndAndClickOnSubmitButton(String user, String pass, String url) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            driver.get(url);
            LoginFluent.using(driver)
                    .enterUserName(user)
                    .enterPassword(pass)
                    .submitButton();
        }
    }

