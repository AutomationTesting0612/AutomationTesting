package step.def;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import fluentDOP.LoginFluent;

import static step.def.TestBase.driver;

public class LoginDOPStepDef {
    @When("^Enter the username \"([^\"]*)\" and \"([^\"]*)\" and click on submit button$")
    public void enterTheUsernameAndAndClickOnSubmitButton(String arg0, String arg1) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            LoginFluent.using(driver)
                    .enterUserName(arg0)
                    .enterPassword(arg1)
                    .submitButton();
        }
    }

