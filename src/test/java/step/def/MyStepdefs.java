package step.def;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class MyStepdefs {
    @Given("^Open the browser$")
    public void openTheBrowser() {

    }

    @When("^Enter the URL$")
    public void enterTheURL() {
        System.out.println("AutomationTest2");
    }

    @When("^User is entering username and password$")
    public void userIsEnteringUsernameAndPassword() {
        System.out.println("AutomationTest3");
    }

    @Then("^Click the Submit button$")
    public void clickTheSubmitButton() {
        System.out.println("AutomationTest4");
    }
}
