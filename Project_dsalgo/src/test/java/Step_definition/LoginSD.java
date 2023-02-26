package Step_definition;

import Page_Factory.BrowserManager;
import Page_Factory.login_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigfileReader;

public class LoginSD {
	login_page login = new login_page();
	
	@Given("user is on Home page")
	public void user_is_on_home_page() {
		login.loginpage();
		 login.url();
	}
	    
	@When("user click on Get started button")
	public void user_click_on_get_started_button() {
		login.getstarted();	    
	}
	@Then("user click login button")
	public void user_click_login_button() {
		login.Sign_in();
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("hello");
	    
	}
	@When("user enters Valid username and password")
	public void user_enters_valid_username_and_password() throws Exception {
		login.ID();
	}
	@Then("user enters login button")
	public void user_enters_login_button() {
		login.login_click();
	}
	
	
	

}
