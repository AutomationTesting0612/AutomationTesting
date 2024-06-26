package step.def;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class HomeStepDef extends TestBase {

    int count=0; //class reference variable or data member

    @Then("^validate the title$")
    public void validateTheTitle() {

        String expectedTitle="Swag Labs"; //local variable

        Assert.assertEquals(expectedTitle, driver.getTitle());
    }

    @When("^User is clicking on all the Add To Cart button$")
    public void userIsClickingOnAllTheAddToCartButton() throws InterruptedException {

        List<WebElement> element = driver.findElements(By.xpath("//button[contains(text(),'Add to cart')]"));

        for (int i =0; i<element.size()-1;i++) {
            element.get(i).getText();
            element.get(i).click();
            count = count+1;

        }


    }

    @Then("^Add To Cart Button text should be display as Remove button$")
    public void addToCartButtonTextShouldBeDisplayAsRemoveButton() {

        List<WebElement> removeTextButtonList = driver.findElements(By.xpath(properties.getProperty("removeButton")));


        for(WebElement listOfRemoveButton: removeTextButtonList) {

           String actualRemoveButtonText= listOfRemoveButton.getText();
           String expectedRemoveButtonText="Remove";
           Assert.assertEquals(expectedRemoveButtonText, actualRemoveButtonText);
        }
    }

    @Then("^Cart Icon should be increment by one on clicking the Add to cart button$")
    public void cartIconShouldBeIncrementByOneOnClickingTheAddToCartButton() {


        WebElement cartIcon = driver.findElement(By.xpath(properties.getProperty("cartIconNoOfProductAdded")));
        String actualCartIcon= cartIcon.getText();

        Assert.assertEquals(String.valueOf(count),actualCartIcon);
    }

    @When("^User is clicking on cart icon$")
    public void userIsClickingOnCartIcon() {

        driver.findElement(By.xpath(properties.getProperty("cartIcon"))).click();
    }

    @And("^Click on the Checkout button$")
    public void clickOnTheCheckoutButton() {
        driver.findElement(By.xpath(properties.getProperty("checkoutButton"))).click();
    }

    @And("^Handle the exception$")
    public void handleTheException() {
        try {
            driver.findElement(By.xpath(properties.getProperty("zzzzz")));
        } catch (Exception e) {
            e.getMessage();
        }

    }

    @And("^Enter the details in checkout page$")
    public void enterTheDetailsInCheckoutPage() {

    }

    @When("^User is clicking on checkout icon$")
    public void userIsClickingOnCheckoutIcon() {
        driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
    }

    @And("^click on checkout button$")
    public void clickOnCheckoutButton() {
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
    }

    @And("^Enter the Customer details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void enterTheCustomerDetails(String firstName, String lastName, String zipCode) throws InterruptedException {

        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys(firstName);
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys(lastName);
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys(zipCode);

        Thread.sleep(10000L);
    }
}
