package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import scenarioContext.ScenarioContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static scenarioContext.ContextKeys.USERNAME;

public class UserLoginSteps {

    private final ScenarioContext context;

    public UserLoginSteps(ScenarioContext context) {
        this.context = context;
    }

    @Given("{string} login page is displayed")
    public void isDisplayed(String loginPage) {
        System.out.println("User is on the " + loginPage + " login page");
    }

    @When("user inserts valid {} and {}")
    public void insertValid(String username, String password) {
        context.set(USERNAME, username);
        System.out.println("User inserted" + username + " and " + password);
    }

    @Then("user is successfully logged in")
    public void userIsSuccessfullyLoggedIn() {
        System.out.println("User is successfully logged in as the necessary page is displayed");
    }

    @Then("successful {} is displayed")
    public void successfulIsDisplayed(String message) {
        if (context.get(USERNAME, String.class).equals("admin")) {
           assertEquals("Hello Admin, you have rights to edit, view and read", message);
        }
        else if (context.get(USERNAME, String.class).equals("regular")) {
            assertEquals("Hello Alice, you have rights to view and read", message);
        }
    }

}
