package step.def;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import fluentDOP.LoginFluent;

import static step.def.TestBase.driver;

public class LoginDOPStepDef {

    public void enterTheUsernameAndAndClickOnSubmitButton(String user, String pass) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            LoginFluent.using(driver)
                    .enterUserName(user)
                    .enterPassword(pass)
                    .submitButton();
        }
    }

