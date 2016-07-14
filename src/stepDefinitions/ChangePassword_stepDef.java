package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utils.Constant;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChangePassword_stepDef {
	public static WebDriver driver;

	public ChangePassword_stepDef() {
		driver = Hooks.driver;
	}

	@When("^I click on 'my profile' under my user name drop down in header$")
	public void i_click_on_my_profile_under_my_user_name_drop_down_in_header()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try{
			pageObjects.MyProfile.UserName_Menulink(driver).click();
		pageObjects.MyProfile.myProfile_DropDownMenulink(driver).click();
	String pagetitle=driver.getTitle();
	Assert.assertEquals(pagetitle, "Shop n Zip - My Profile");
	
		}catch(Exception e)
		{
			System.out.println(e);
			Assert.fail("I am not in my profile page");
		}
	}

	@When("^I click on Edit profile link$")
	public void i_click_on_Edit_profile_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try{
			Assert.assertTrue(pageObjects.MyProfile.EditProfileLinkText(driver).isDisplayed());
			pageObjects.MyProfile.EditProfileLinkText(driver).click();
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Edit profile link is not displaying in my profile page");
		}
	}

	@When("^click on change password link$")
	public void click_on_change_password_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try{
			Assert.assertTrue(pageObjects.MyProfile.ChangePasswordLinkInEditProfile(driver).isDisplayed());
			pageObjects.MyProfile.ChangePasswordLinkInEditProfile(driver).click();
		}catch(Exception e){
			Assert.fail("Cahnge password link is not displaying in edit profile page");
		}
	}

	@Then("^I should see 'change password' section$")
	public void i_should_see_change_password_section() throws Throwable {
		try{
			Assert.assertTrue(pageObjects.ChangePassword.ChangePasswordSection(driver).isDisplayed());
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Change password section is not displaying in change password page");
		}
		
	}

	@Then("^I should see 'Change Password' as title$")
	public void i_should_see_Change_Password_as_title() throws Throwable {
		try{
			String actual=pageObjects.ChangePassword.CahngePasswordHeading(driver).getText();
			Assert.assertEquals(actual,"Change Password");
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("'Change Password' as title is not displaying");
		}
	}

	@Then("^I should be able to see these fields in page\\.$")
	public void i_should_be_able_to_see_these_fields_in_page()
			throws Throwable {
		try{
			Assert.assertTrue(pageObjects.ChangePassword.CurrentPasswordTextBox(driver).isDisplayed()&& pageObjects.ChangePassword.EnterANewPasswordtextBox(driver).isDisplayed()&& pageObjects.ChangePassword.RetypePasswordtextfield(driver).isDisplayed()&& pageObjects.ChangePassword.ChangePaaswordSubmiteButton(driver).isDisplayed() && pageObjects.ChangePassword.ChangePassWordBackButton(driver).isDisplayed());
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Fields are not displaying");
		}
		
	}

	

	@When("^I entered my current password in current password filed\\.$")
	public void i_entered_my_current_password_in_current_password_filed()
			throws Throwable {
		try{
			pageObjects.ChangePassword.CurrentPasswordTextBox(driver).sendKeys(Constant.CurrentPassword);
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("current password is not entering");
		}
	}

	@When("^I entered a valid format password in new password filed\\.$")
	public void i_entered_a_valid_format_password_in_new_password_filed()
			throws Throwable {
	try{
		pageObjects.ChangePassword.EnterANewPasswordtextBox(driver).sendKeys(Constant.NewPassword);
	}catch(Exception e){
		System.out.println(e);
		Assert.fail("new password is not enrering in change password page");
	}
		
	}

	@When("^I entered same text in 're-type new password' field\\.$")
	public void i_entered_same_text_in_re_type_new_password_field()
			throws Throwable {
		try{
			pageObjects.ChangePassword.RetypePasswordtextfield(driver).sendKeys(Constant.ChangePasswordInvalid1);
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Inavaild data is not entered in change password:retype");
		}
	}

	



	@When("^I entered incorrect current password$")
	public void i_entered_incorrect_current_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try{
			Assert.assertTrue(pageObjects.ChangePassword.CurrentPasswordTextBox(driver).isDisplayed());
			pageObjects.ChangePassword.CurrentPasswordTextBox(driver).sendKeys(Constant.ChangePasswordInvalid12);
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("current password field is not displaying for entering data");
		}
	}

	@When("^given valid new password$")
	public void given_valid_new_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	try{
		Assert.assertTrue(pageObjects.ChangePassword.EnterANewPasswordtextBox(driver).isDisplayed());
		pageObjects.ChangePassword.EnterANewPasswordtextBox(driver).sendKeys(Constant.NewPassword);
	}catch(Exception e){
		System.out.println(2);
		Assert.fail("new password field is not displaying");
	}
	}

	@When("^entered password same as new password in re-type password field$")
	public void entered_password_same_as_new_password_in_re_type_password_field()
			throws Throwable {
	try{
		Assert.assertTrue(pageObjects.ChangePassword.RetypePasswordtextfield(driver).isDisplayed());
		pageObjects.ChangePassword.RetypePasswordtextfield(driver).sendKeys(Constant.NewPassword);
	}catch(Exception e){
		System.out.println(e);
		Assert.fail("Retype password field is not displaying");
	}
	}


	@When("^I entered current password$")
	public void i_entered_current_password() throws Throwable {
			try{
			Assert.assertTrue(pageObjects.ChangePassword.CurrentPasswordTextBox(driver).isDisplayed());
			pageObjects.ChangePassword.CurrentPasswordTextBox(driver).sendKeys(Constant.CurrentPassword);
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("current password field is not displaying for entering  valid data");
		}
	}
	

	

	
	@When("^I entered same in 're-type new password' field\\.$")
	public void i_entered_same_in_re_type_new_password_field() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try{
			Assert.assertTrue(pageObjects.ChangePassword.RetypePasswordtextfield(driver).isDisplayed());
			pageObjects.ChangePassword.RetypePasswordtextfield(driver).sendKeys(Constant.NewPassword);
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Retype password field is not displaying");
		}
		}

	

	@When("^I clicked on submit button without filling current password field\\.$")
	public void i_clicked_on_submit_button_without_filling_current_password_field()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	

	@When("^I entered 'Current password'$")
	public void i_entered_Current_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}



	@When("^I clicked on 'Submit button' without filling 'Re-type new password' text box\\.$")
	public void i_clicked_on_Submit_button_without_filling_Re_type_new_password_text_box()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}


	@When("^I enter 'Current password'$")
	public void i_enter_Current_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I enter 'new password'$")
	public void i_enter_new_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I filled 'Re-type new password filled' with different data\\(which is not 'new password' data\\) in text box\\.$")
	public void i_filled_Re_type_new_password_filled_with_different_data_which_is_not_new_password_data_in_text_box()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I clicked on 'Submit button' \\.$")
	public void i_clicked_on_Submit_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	

	@Then("^I should not be allowed to set new password\\.$")
	public void i_should_not_be_allowed_to_set_new_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I click on 'Back' option$")
	public void i_click_on_Back_option() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be redirected on 'My profile ' page\\.$")
	public void i_should_be_redirected_on_My_profile_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
	@When("^I click on 'submit' button$")
	public void i_click_on_submit_button() throws Throwable {
	  try{
		  Assert.assertTrue(pageObjects.ChangePassword.ChangePaaswordSubmiteButton(driver).isDisplayed());
		  pageObjects.ChangePassword.ChangePaaswordSubmiteButton(driver).click();
	  }catch(Exception e){
		  System.out.println(2);
		  Assert.fail("Submot button is not clicking");
	  }
	}

	@Then("^I should see 'This field is required' error text for available all fields\\.$")
	public void i_should_see_This_field_is_required_error_text_for_available_all_fields() throws Throwable {
	try{
		Assert.assertTrue(pageObjects.ChangePassword.ThisFieldIsRewuiredError(driver).isDisplayed());
	}catch(Exception e){
		System.out.println(e);
		Assert.fail("Error message is not displaying ");
	}
	  
	}
	@When("^I clicked on 'Submit' button in change password form\\.$")
	public void i_clicked_on_Submit_button_in_change_password_form() throws Throwable {
		try{
			  Assert.assertTrue(pageObjects.ChangePassword.ChangePaaswordSubmiteButton(driver).isDisplayed());
			  pageObjects.ChangePassword.ChangePaaswordSubmiteButton(driver).click();
		  }catch(Exception e){
			  System.out.println(2);
			  Assert.fail("Submot button is not clicking");
		  }
		}
		
	
	@Then("^I should be able to change my password with confirmation message'The changes were saved\\.' on my screen\\.$")
	public void i_should_be_able_to_change_my_password_with_confirmation_message_The_changes_were_saved_on_my_screen() throws Throwable {
	  try{
		  String actual=pageObjects.ChangePassword.ConfirmationMessageForChangePassword(driver).getText();
		 Assert.assertEquals(actual, "The changes were saved.");
		  
	  }catch(Exception e){
		  System.out.println(e);
		  Assert.fail("");
	  }
	}

	@Then("^I should see error message 'Your current password is incorrect\\. '$")
	public void i_should_see_error_message_Your_current_password_is_incorrect() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should see error message 'This field is required' for 'password' text field\\.$")
	public void i_should_see_error_message_This_field_is_required_for_password_text_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should see error message 'This field is required' for 'retype password' text field\\.$")
	public void i_should_see_error_message_This_field_is_required_for_retype_password_text_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should see  message 'This field is required' with current password field\\.$")
	public void i_should_see_message_This_field_is_required_with_current_password_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}



	@Then("^I shouldsee message, 'This field is required' for 'retype password' field\\.$")
	public void i_shouldsee_message_This_field_is_required_for_retype_password_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should message, ' Fields do not match ' for 'Re-type password' field\\.$")
	public void i_should_message_Fields_do_not_match_for_Re_type_password_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on 'Back' options$")
	public void i_click_on_Back_options() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	@When("^I enter data alfanumeric (\\d+)jsd under 'Enter new password' text field$")
	public void i_enter_data_alfanumeric_jsd_under_Enter_new_password_text_field(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should see validation message Please enter a password that is at least six characters long and contains at least one special characters for the 'Enter new password' text field\\.$")
	public void i_should_see_validation_message_Please_enter_a_password_that_is_at_least_six_characters_long_and_contains_at_least_one_special_characters_for_the_Enter_new_password_text_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter data numeri (\\d+)@ under 'Enter new password' text field$")
	public void i_enter_data_numeri_under_Enter_new_password_text_field(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter data letterSpecial shfk@ under 'Enter new password' text field$")
	public void i_enter_data_letterSpecial_shfk_under_Enter_new_password_text_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter data numberSpecial (\\d+)@ under 'Enter new password' text field$")
	public void i_enter_data_numberSpecial_under_Enter_new_password_text_field(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter data less letterSpacial kjj@ under 'Enter new password' text field$")
	public void i_enter_data_less_letterSpacial_kjj_under_Enter_new_password_text_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter data lessAlfanumericSpeciala@b(\\d+) under 'Enter new password' text field$")
	public void i_enter_data_lessAlfanumericSpeciala_b_under_Enter_new_password_text_field(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I entered 'new password'$")
	public void i_entered_new_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}




}
