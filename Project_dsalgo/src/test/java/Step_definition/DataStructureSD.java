package Step_definition;

import Page_Factory.Data_Structure;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStructureSD {

	Data_Structure DS = new Data_Structure();
	
	@Given("The user is in the Home page after logged in")
	public void the_user_is_in_the_home_page_after_logged_in() {
		System.out.println("User is on Home page after logged in ");
	    
	 }

	@When("The user clicks  Get Started button below the Data structures-Introduction")
	public void the_user_clicks_get_started_button_below_the_data_structures_introduction() {
	DS.getstartedDS();
	}

	@Then("The user should land in Data Structures- Introduction Page")
	public void the_user_should_land_in_data_structures_introduction_page() {
	 System.out.println("User is on Data Structure Introduction Page");
	}

	@Given("The user is on the Data Structures Introduction after logged in")
	public void the_user_is_on_the_data_structures_introduction_after_logged_in() {
	
	}

	@When("The user clicks Time Complexity button")
	public void the_user_clicks_time_complexity_button() {
	DS.timec();
	}

	@Then("The user should be redirected to time complexity of Data structures-Introduction")
	public void the_user_should_be_redirected_to_time_complexity_of_data_structures_introduction() {
	   
	}

	@Given("The user clicks the Time Complexity page")
	public void the_user_clicks_the_time_complexity_page() {
	
	}

	@When("The user clicks Try Here button")
	public void the_user_clicks_try_here_button() {
	DS.tryhere();
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() throws Exception {
	DS.print();
	DS.runbutton();
	}

	@Then("user direct to home page")
	public void user_direct_to_home_page() {
	DS.homepage();
	}

	
}
