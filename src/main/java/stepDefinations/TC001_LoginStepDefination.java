package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001_LoginStepDefination {
	@Given("user is on Home page")
	public void user_is_on_home_page() {
	  System.out.println("User is on Home page");
	}
	@When("user clicks on Signin Link")
	public void user_clicks_on_signin_link() {
	   System.out.println("User clicks on Sign in link");
	}
	@Then("check title of next page")
	public void check_title_of_next_page() {
	  System.out.println("Check title");
	}
	@When("user enter valid username")
	public void user_enter_valid_username() {

System.out.println("Enter valid user name ");
	}
	@When("user enter valid password clicks on Submit button")
	public void user_enter_valid_password_clicks_on_submit_button() {
	   System.out.println("Enter valid password and click on  Submit button");
	}
	@Then("Check user name is valid and display message as Login successful.")
	public void check_user_name_is_valid_and_display_message_as_login_successful() {
	   System.out.println("Login Successful...");
	}
	@When("user enters invalid username and valid password clicks on Submit")
	public void user_enters_invalid_username_and_valid_password_clicks_on_submit() {
	   System.out.println("Enter invalid user name and valid password");
	}
	@Then("error message is displayed")
	public void error_message_is_displayed() {
	    System.out.println("Error message........");
	}
	@Then("user enter valid user name and invalid password clicks on Submit")
	public void user_enter_valid_user_name_and_invalid_password_clicks_on_submit() {
	    System.out.println("Enter valid user name and invalid password");
	}





}
