package step.def;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;

public class Test {
//    WebDriver driver;
    @Given("^Open the browsers$")
    public void openTheBrowsers() {
        System.out.println("I am opening the browser");
    }

    @When("^Enter the URLs$")
    public void enterTheURLs() {
        System.out.println("I am entering the URL");
    }

    @When("^Enter the username and passwords$")
    public void enterTheUsernameAndPasswords() {
        System.out.println("I am entering the username and password");
    }

    @Then("^Click the Submit buttons$")
    public void clickTheSubmitButtons() {
        System.out.println("I am clicking on submit button");
    }

    @When("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enterAnd(String username, String passwords) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the username is " + username);
        System.out.println("the password is " + passwords);
    }
}
