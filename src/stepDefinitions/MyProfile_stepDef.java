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
	@Then("^I should be able to see these available details in page Profile heading with Name\\.$")
	public void i_should_be_able_to_see_these_available_details_in_page_Profile_heading_with_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be able to see these available details in page Email\\.$")
	public void i_should_be_able_to_see_these_available_details_in_page_Email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be able to see these available details in page phone\\.$")
	public void i_should_be_able_to_see_these_available_details_in_page_phone() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be able to see these available details in page country of current residence\\.$")
	public void i_should_be_able_to_see_these_available_details_in_page_country_of_current_residence() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be able to see these available details in page Socila sharing icons\\.$")
	public void i_should_be_able_to_see_these_available_details_in_page_Socila_sharing_icons() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be able to see these available details in page Edit profile option\\.$")
	public void i_should_be_able_to_see_these_available_details_in_page_Edit_profile_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I entered more than twelve digit in Phone\\.$")
	public void i_entered_more_than_twelve_digit_in_Phone() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should validation message  for <Fields>$")
	public void i_should_validation_message_for_Fields() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I entered less than ten digit in phone\\.$")
	public void i_entered_less_than_ten_digit_in_phone() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should validation message Not a valid phone number for <Fields>$")
	public void i_should_validation_message_Not_a_valid_phone_number_for_Fields() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I entered alfanumeri data should not be excepted in Phone\\.$")
	public void i_entered_alfanumeri_data_should_not_be_excepted_in_Phone() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should validation message not be excepted for <Fields>$")
	public void i_should_validation_message_not_be_excepted_for_Fields() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I entered more than six digit in Zip code\\.$")
	public void i_entered_more_than_six_digit_in_Zip_code() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should validation message Not a valid Zip code for <Fields>$")
	public void i_should_validation_message_Not_a_valid_Zip_code_for_Fields() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I entered less than four digit in Zip code\\.$")
	public void i_entered_less_than_four_digit_in_Zip_code() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I entered alfanumeric in Zip code\\.$")
	public void i_entered_alfanumeric_in_Zip_code() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should validation message Not a valid zip code for <Fields>$")
	public void i_should_validation_message_Not_a_valid_zip_code_for_Fields() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^Social sharing icons Facebook sharing is displaying with 'Connect' title connect title\\.$")
	public void social_sharing_icons_Facebook_sharing_is_displaying_with_Connect_title_connect_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I clicked on 'Connect' title  below of Facebook sharing when user is not logged in with respective  socila sharing sites$")
	public void i_clicked_on_Connect_title_below_of_Facebook_sharing_when_user_is_not_logged_in_with_respective_socila_sharing_sites() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be able to redirected on new popup on my screen facebook login page$")
	public void i_should_be_able_to_redirected_on_new_popup_on_my_screen_facebook_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^Social sharing icons Twitter sharing is displaying with 'Connect' title connect title\\.$")
	public void social_sharing_icons_Twitter_sharing_is_displaying_with_Connect_title_connect_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I clicked on 'Connect' title  below of Twitter sharing when user is not logged in with respective  socila sharing sites$")
	public void i_clicked_on_Connect_title_below_of_Twitter_sharing_when_user_is_not_logged_in_with_respective_socila_sharing_sites() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be able to redirected on new popup on my screen Twitterlogin page$")
	public void i_should_be_able_to_redirected_on_new_popup_on_my_screen_Twitterlogin_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^Social sharing icons G\\+ socila sharing is displaying with 'Connect' title connect title\\.$")
	public void social_sharing_icons_G_socila_sharing_is_displaying_with_Connect_title_connect_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I clicked on 'Connect' title  below of G\\+ socila sharing when user is not logged in with respective  socila sharing sites$")
	public void i_clicked_on_Connect_title_below_of_G_socila_sharing_when_user_is_not_logged_in_with_respective_socila_sharing_sites() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be able to redirected on new popup on my screen G\\+ login page$")
	public void i_should_be_able_to_redirected_on_new_popup_on_my_screen_G_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I clicked on 'Connect' title  below of Facebook sharing when user is logged in with respective  socila sharing sites$")
	public void i_clicked_on_Connect_title_below_of_Facebook_sharing_when_user_is_logged_in_with_respective_socila_sharing_sites() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be able to see new open window with 'close window' option\\.$")
	public void i_should_be_able_to_see_new_open_window_with_close_window_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on 'close window' option$")
	public void i_click_on_close_window_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be able to see,status is 'Disconnect'  with respective icons Facebook sharing\\.$")
	public void i_should_be_able_to_see_status_is_Disconnect_with_respective_icons_Facebook_sharing() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I clicked on 'Connect' title  below of Twitter sharing when user is logged in with respective  socila sharing sites$")
	public void i_clicked_on_Connect_title_below_of_Twitter_sharing_when_user_is_logged_in_with_respective_socila_sharing_sites() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be able to see,status is 'Disconnect'  with respective icons Twitter sharing\\.$")
	public void i_should_be_able_to_see_status_is_Disconnect_with_respective_icons_Twitter_sharing() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I clicked on 'Connect' title  below of G\\+ socila sharing when user is logged in with respective  socila sharing sites$")
	public void i_clicked_on_Connect_title_below_of_G_socila_sharing_when_user_is_logged_in_with_respective_socila_sharing_sites() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be able to see,status is 'Disconnect'  with respective icons G\\+ socila sharing\\.$")
	public void i_should_be_able_to_see_status_is_Disconnect_with_respective_icons_G_socila_sharing() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I maked some changes in data\\(optional\\)$")
	public void i_maked_some_changes_in_data_optional() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on 'save' buuton\\.$")
	public void i_click_on_save_buuton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should see 'Successfully Updated your Profile ' message at top of the page\\.$")
	public void i_should_see_Successfully_Updated_your_Profile_message_at_top_of_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I check  Face Book with 'Disconnect' title\\.$")
	public void i_check_Face_Book_with_Disconnect_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on 'back' button in edit profile page\\.$")
	public void i_click_on_back_button_in_edit_profile_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should redirected to the 'my profile' page\\.$")
	public void i_should_redirected_to_the_my_profile_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should see Face Book under 'Social Profiles:'$")
	public void i_should_see_Face_Book_under_Social_Profiles() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I check  Twitter with 'Disconnect' title\\.$")
	public void i_check_Twitter_with_Disconnect_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should see Twitter under 'Social Profiles:'$")
	public void i_should_see_Twitter_under_Social_Profiles() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I check  g\\+ with 'Disconnect' title\\.$")
	public void i_check_g_with_Disconnect_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should see g\\+ under 'Social Profiles:'$")
	public void i_should_see_g_under_Social_Profiles() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on Facebook sharing under 'Social Profiles:' in 'My profile' page\\.$")
	public void i_click_on_Facebook_sharing_under_Social_Profiles_in_My_profile_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should redirected on page facebook login page$")
	public void i_should_redirected_on_page_facebook_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on Twitter sharing under 'Social Profiles:' in 'My profile' page\\.$")
	public void i_click_on_Twitter_sharing_under_Social_Profiles_in_My_profile_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should redirected on page Twitterlogin page$")
	public void i_should_redirected_on_page_Twitterlogin_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on G\\+ socila sharing under 'Social Profiles:' in 'My profile' page\\.$")
	public void i_click_on_G_socila_sharing_under_Social_Profiles_in_My_profile_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should redirected on page G\\+ login page$")
	public void i_should_redirected_on_page_G_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should redirected on page facebook home page$")
	public void i_should_redirected_on_page_facebook_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should redirected on page Twitter home  page$")
	public void i_should_redirected_on_page_Twitter_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should redirected on page G\\+ home page$")
	public void i_should_redirected_on_page_G_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on 'Change password' link under 'edit profile ' page\\.$")
	public void i_click_on_Change_password_link_under_edit_profile_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be redirected to the 'Change password' page under 'My profile' \\.$")
	public void i_should_be_redirected_to_the_Change_password_page_under_My_profile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}
