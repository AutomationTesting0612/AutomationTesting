package step.def;

import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomeStepDef extends TestBase {

    @Then("^validate the title$")
    public void validateTheTitle() {

        String expectedTitle="Swag Labs";

        Assert.assertEquals(expectedTitle, driver.getTitle());
    }

    @When("^User is clicking on all the Add To Cart button$")
    public void userIsClickingOnAllTheAddToCartButton() throws InterruptedException {

        List<WebElement> element = driver.findElements(By.xpath(properties.getProperty("addToCartButtonXpath")));

        for (int i =0; i<element.size()-1;i++) {
            element.get(i).getText();
            element.get(i).click();

            Thread.sleep(30000L);

        }

//        for(WebElement addToCartButton:element) {
//            addToCartButton.click();
//        }

    }
}
