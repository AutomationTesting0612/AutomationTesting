package step.def;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

import java.nio.file.Files;
import java.nio.file.Paths;

public class GetEndpointWithResponseStepDef {

    private String identity;
    private Response response;

    String url="http://localhost:8080/card-accounts-users-mx/projects/";
    @Given("^enter the required identity \"([^\"]*)\" to check the concern$")
    public void enterTheRequiredIdentityToCheckTheConcern(String arg0) throws Throwable {
        this.identity = identity;
        System.out.println("✅ Identity provided: " + identity);

    }

    @When("^User hit the Get API$")
    public void userHitTheGetAPI() {

      response=  RestAssured.given()
                .header("Content-Type", "application/json")
                .when()
                .get(url + "/699804"+"/accounts"+ "/" + identity);
    }

    @Then("^the reponse should be \"([^\"]*)\"$")
    public void theReponseShouldBe(String statusCode) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(statusCode, response.getStatusCode());
    }



    @When("^User hit the Get API with \"([^\"]*)\"$")
    public void userHitTheGetAPIWith(String header) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        response=  RestAssured.given()
                .header("Content-Type", "application/json")
                .header("profile_ref_id",header)
                .when()
                .get(url + "/699804"+"/accounts"+ "/" + identity);
    }

    @Then("^the response should be \"([^\"]*)\" body should match expected \"([^\"]*)\"$")
    public void theResponseShouldBeBodyShouldMatchExpected(String expectedStatusCode, String expectedJsonFile) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String expectedJson = new String(
                Files.readAllBytes(Paths.get("src/test/resources/" + expectedJsonFile)));
        String actualJson = response.getBody().asString().trim().replaceAll("\\s+", "");
        expectedJson = expectedJson.trim().replaceAll("\\s+", "");
        Assert.assertEquals(String.valueOf(response.getStatusCode()),expectedStatusCode);
        Assert.assertEquals(actualJson,expectedJson);
    }

}
