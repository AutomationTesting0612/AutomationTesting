package step.def;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import java.io.IOException;

public class LoginStepDef extends TestBase {

    @Before
    public void init() throws IOException {
        setup();
    }

    @After
    public void quit() {
        tearDown();
    }

    @And("^Enter the password$")
    public void enterThePassword() {
        driver.findElement(By.xpath(properties.getProperty("password"))).sendKeys(properties.getProperty("passwordValue"));

    }

    @When("^Enter the username$")
    public void enterTheUsername() {
        driver.findElement(By.xpath(properties.getProperty("username"))).sendKeys(properties.getProperty("usernameValue"));

    }

    @And("^click on the login button$")
    public void clickOnTheLoginButton() {
        driver.findElement(By.xpath(properties.getProperty("login"))).click();
    }

    @Then("^User should be able to navigate to the home page$")
    public void userShouldBeAbleToNavigateToTheHomePage() {
    }
}
