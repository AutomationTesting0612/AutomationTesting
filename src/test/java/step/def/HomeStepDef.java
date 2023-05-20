package step.def;

import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;

public class HomeStepDef extends TestBase {

    @Given("^Navigate to Home Page after Login$")
    public void navigateToHomePageAfterLogin() {

        System.out.println("Welcome to Home Page");
    }

    @Then("^validate the title$")
    public void validateTheTitle() {

        System.out.println("Title Name  :");
    }
}
