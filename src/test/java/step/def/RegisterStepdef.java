package step.def;

import cucumber.api.java.en.When;

import org.openqa.selenium.By;

public class RegisterStepdef extends TestBase {

    @When("^Click on the Register tab$")
    public void clickOnTheRegisterTab() {
        System.out.println("Testing");
    }

    @When("^Enter the mobile Number in Register Page$")
    public void enterTheMobileNumberInRegisterPage() {
        driver.findElement(By.xpath("//input[@id='Mobile']")).sendKeys("ip420");
    }
}
