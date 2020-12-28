package com.myapp.step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_stepDefinition {


    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        System.out.println("User is on the landing page ");
    }


    @When("user enters credentials")
    public void user_enters_credentials() {
        System.out.println("user enters credentials");
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        System.out.println("User click a login button ");
    }

    @Then("user supposed to see welcome message")
    public void user_supposed_to_see_welcome_message() {
        System.out.println("User should see welcome massage");
    }

}
