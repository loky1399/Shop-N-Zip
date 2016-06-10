package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyProfile_stepDef {
	public static WebDriver driver;

	public MyProfile_stepDef() {
		driver = Hooks.driver;
	}

	@When("^I selected  'My Profile' from drop down option$")
	public void i_selected_My_Profile_from_drop_down_option() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should redirected to 'My Profile' page$")
	public void i_should_redirected_to_My_Profile_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to see these available details in page$")
	public void i_should_be_able_to_see_these_available_details_in_page(
			DataTable arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		throw new PendingException();
	}

	@Then("^I should be able to see these fields in 'Edit profile' page$")
	public void i_should_be_able_to_see_these_fields_in_Edit_profile_page(
			DataTable arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		throw new PendingException();
	}

	@Then("^I should be able to redirected on 'Edit profile' page$")
	public void i_should_be_able_to_redirected_on_Edit_profile_page()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see it is in disable state\\(It should not be editable\\)$")
	public void i_should_see_it_is_in_disable_state_It_should_not_be_editable()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entered Valid name in name text box$")
	public void i_entered_Valid_name_in_name_text_box() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^click on save button$")
	public void click_on_save_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^It should be Accepted$")
	public void it_should_be_Accepted() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entered Invalid name in name text box$")
	public void i_entered_Invalid_name_in_name_text_box() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^It should be notaccepted$")
	public void it_should_be_notaccepted() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entered Valid name in phone number text box$")
	public void i_entered_Valid_name_in_phone_number_text_box()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entered Invalid name in phone number text box$")
	public void i_entered_Invalid_name_in_phone_number_text_box()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I clicked on Country drop-down option$")
	public void i_clicked_on_Country_drop_down_option() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to select country name from displaying drop down option$")
	public void i_should_be_able_to_select_country_name_from_displaying_drop_down_option()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I clicked on back button$")
	public void i_clicked_on_back_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I shoul be able to navigated on 'My profile' page$")
	public void i_shoul_be_able_to_navigated_on_My_profile_page()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^I clicked on 'Edit profile' link$")
	public void i_clicked_on_Edit_profile_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I clicked on Facebook sharing when user is not logged in with respective  socila sharing sites$")
	public void i_clicked_on_Facebook_sharing_when_user_is_not_logged_in_with_respective_socila_sharing_sites()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to redirected on facebook login page$")
	public void i_should_be_able_to_redirected_on_facebook_login_page()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I clicked on Twitter sharing when user is not logged in with respective  socila sharing sites$")
	public void i_clicked_on_Twitter_sharing_when_user_is_not_logged_in_with_respective_socila_sharing_sites()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to redirected on Twitterlogin page$")
	public void i_should_be_able_to_redirected_on_Twitterlogin_page()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I clicked on G\\+ socila sharing when user is not logged in with respective  socila sharing sites$")
	public void i_clicked_on_G_socila_sharing_when_user_is_not_logged_in_with_respective_socila_sharing_sites()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to redirected on G\\+ login page$")
	public void i_should_be_able_to_redirected_on_G_login_page()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I clicked on Facebook sharing when user is logged in with respective  socila sharing sites$")
	public void i_clicked_on_Facebook_sharing_when_user_is_logged_in_with_respective_socila_sharing_sites()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to redirected on facebook home page$")
	public void i_should_be_able_to_redirected_on_facebook_home_page()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to see,status is conned with respective icons$")
	public void i_should_be_able_to_see_status_is_conned_with_respective_icons()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I clicked on Twitter sharing when user is logged in with respective  socila sharing sites$")
	public void i_clicked_on_Twitter_sharing_when_user_is_logged_in_with_respective_socila_sharing_sites()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to redirected on Twitter home  page$")
	public void i_should_be_able_to_redirected_on_Twitter_home_page()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I clicked on G\\+ socila sharing when user is logged in with respective  socila sharing sites$")
	public void i_clicked_on_G_socila_sharing_when_user_is_logged_in_with_respective_socila_sharing_sites()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to redirected on G\\+ home page$")
	public void i_should_be_able_to_redirected_on_G_home_page()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
