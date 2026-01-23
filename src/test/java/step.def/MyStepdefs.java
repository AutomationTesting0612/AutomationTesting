package step.def;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import io.restassured.response.Response;

public class MyStepdefs {

    private String identity;
    private Response response;

    @Given("^enter the required identity <\"([^\"]*)\"> to check the concern$")
    public void enterTheRequiredIdentityToCheckTheConcern(String arg0) throws Throwable {

        this.identity = identity;
        System.out.println("✅ Identity provided: " + identity);

    }


}
