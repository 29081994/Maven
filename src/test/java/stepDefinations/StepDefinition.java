package stepDefinations;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinition {

    @Given("^User is on Bank landing page$")
    public void user_is_on_bank_landing_page() throws Throwable {
    	System.out.println("Landing page");
       
    }

    @When("^User login with valid username and valid password$")
    public void user_login_with_valid_username_and_valid_password() throws Throwable {
    	System.out.println("username and password");
    }
    
    @Then("^user is navigated to homepage$")
    public void user_is_navigated_to_homepage() throws Throwable {
    	System.out.println("navigated to homepage");
    }

    @And("^cards are visible$")
    public void cards_are_visible() throws Throwable {
    	System.out.println("cards details are visible");
    }

}

    
 from second user

