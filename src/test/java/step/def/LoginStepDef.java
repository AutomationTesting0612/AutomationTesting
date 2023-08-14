package step.def;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import pom.Login;

import java.io.IOException;

public class LoginStepDef extends TestBase {

    Login login = new Login(driver);



    @And("^Enter the password$")
    public void enterThePassword() {
        login.enterUserName();
        enterThePassword();
    }

    @When("^Enter the username$")
    public void enterTheUsername() {
        login.enterPassword();
    }

    @And("^click on the login button$")
    public void clickOnTheLoginButton() {
        driver.findElement(By.xpath(properties.getProperty("login"))).click();
    }

    @Then("^User should be able to navigate to the home page$")
    public void userShouldBeAbleToNavigateToTheHomePage() {
    }
}
