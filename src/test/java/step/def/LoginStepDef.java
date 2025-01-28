package step.def;


import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fluentDOP.LoginFluent;
import org.openqa.selenium.By;
import pom.Login;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LoginStepDef extends TestBase {

    Login login = new Login(driver);

    @And("^Enter the password$")
    public void enterThePassword() {
        login = new Login(driver);
        login.enterPassword("secret_sauce");
    }

    @When("^Enter the username$")
    public void enterTheUsername() {
        login = new Login(driver);
        login.enterUserName("standard_user");
    }

    @And("^click on the login button$")
    public void clickOnTheLoginButton() {
        login.submitButton();
    }

    @Then("^User should be able to navigate to the home page$")
    public void userShouldBeAbleToNavigateToTheHomePage() {
    }

    @When("^Enter the username \"([^\"]*)\"$")
    public void enterTheUsername(String username) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterUserName(username);
    }

    @And("^Enter the password \"([^\"]*)\"$")
    public void enterThePassword(String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterPassword(password);
    }
}
