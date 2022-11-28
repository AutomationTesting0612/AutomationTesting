package step.def;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;

public class HomeStepDef {
    @Given("^Navigate to Home Page after Login$")
    public void navigateToHomePageAfterLogin() {

        System.out.println("Welcome to Home Page");
    }

    @Then("^validate the title$")
    public void validateTheTitle() {

        System.out.println("Title Name  :");
    }
}
