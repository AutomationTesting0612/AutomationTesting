package com.automation.utils.ui.pom;

import com.automation.def.TestBase;

public class EnterURLDOPStepDef extends TestBase{

    public void enterTheUsernameAndAndClickOnSubmitButton(String url) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            TestBase.driver.get(url);
            driver.manage().window().maximize();
        }
    }

