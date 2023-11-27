package step.def.forgotPassword;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;

public class ForgotPassword {

    @Given("^Open the Url$")
    public void openTheUrl() {
        System.out.println("Opening the URL");
    }

    @When("^User is entering the valid credentials$")
    public void userIsEnteringTheValidCredentials() {
        System.out.println("User is entering the valid credentials");
    }

    @Then("^User should be able to login in the home page$")
    public void userShouldBeAbleToLoginInTheHomePage() {
        System.out.println("Login in the home page");
    }

    @When("^User is entering the credentials \"([^\"]*)\",\"([^\"]*)\"$")
    public void userIsEnteringTheCredentials(String username, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(username);
        System.out.println(password);
    }

    @Then("^User should not be able to login in the home page$")
    public void userShouldNotBeAbleToLoginInTheHomePage() {
        System.out.println("Error message should get display");
        Assertions.assertEquals("Test", "Test1");
    }
}
