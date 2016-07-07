package stepDefinitions;

import org.junit.Assert;
import org.openqa.jetty.http.SSORealm;
import org.openqa.selenium.WebDriver;

import pageObjects.HeaderLinks;
import utils.Constant;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ForgotPassword_stepDef {
	public static WebDriver driver;

	public ForgotPassword_stepDef() {
		driver = Hooks.driver;
	}

	@Given("^I am in Sign in page$")
	public void i_am_in_Sign_in_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	try{
		driver.get(Constant.SignIn_URL);
		String actual= driver.getTitle();
		Assert.assertEquals("Shop n Zip - Sign In", actual);
	}catch(Exception e){
		System.out.println(e);
		Assert.fail("I am not in sign in page");
	}
	}

	@When("^I clicked on 'Forgot Password'$")
	public void i_clicked_on_Forgot_Password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try{
			pageObjects.SignIn.with_TFC_credentials_ForgotpasswordLink(driver).click();
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Forgot password link is not clickable");
		}
	}

	@Then("^I should see forgot password title as 'Forgot Password'$")
	public void i_should_see_forgot_password_title_as_Forgot_Password()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	try{
		String actual =driver.getTitle();
		Assert.assertTrue(actual.equalsIgnoreCase("Shop n Zip - Forgot Password")&& pageObjects.ForgotPassword.forgotPasswordHeading(driver).isDisplayed());
	}catch(Exception e){
		System.out.println(e);
		Assert.fail("Forgot password heading is not matching");
	}
	}

	@Then("^I should see Email address field with water mark text as 'Email Address'$")
	public void i_should_see_Email_address_field_with_water_mark_text_as_Email_Address()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	try{
	 String text=pageObjects.ForgotPassword.forgotPasswordEmailAddressTextBox(driver).getAttribute("placeholder");
	 Assert.assertEquals(text, "Email Address");
	}catch(Exception e){
		System.out.println(e);
		Assert.fail("Email id text box is not displaying.");
	}
	}

	@Then("^I should see Reset Password button$")
	public void i_should_see_Reset_Password_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	try{
		Assert.assertTrue(pageObjects.ForgotPassword.forgotPassResetPasswordButton(driver).isDisplayed());
	}catch(Exception e){
		System.out.println(e);
		Assert.fail(" Reset password button is not displaying");
	}
	}

	@Then("^I should see Reset password description under the title as 'Recover your password by entering the email address associated with your account\\. Check your email for the instructions on how to reset your password'$")
	public void i_should_see_Reset_password_description_under_the_title_as_Recover_your_password_by_entering_the_email_address_associated_with_your_account_Check_your_email_for_the_instructions_on_how_to_reset_your_password()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try{
			String actual=pageObjects.ForgotPassword.forgotPasswordDescription(driver).getText();
			String expected ="Recover your password by entering the email address associated with your account. Check your email for the instructions on how to reset your password";
			Assert.assertEquals( expected, actual,"Description is not matching");
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("In forgot password page not getting desctiption of it");
		}
	}


@When("^I entered not registered  email id$")
public void i_entered_not_registered_email_id() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  try{
	 pageObjects.ForgotPassword.forgotPasswordEmailAddressTextBox(driver).sendKeys(Constant.notRegisteredEmailId);
  }catch(Exception e){
	  System.out.println(e);
	  Assert.fail("email is is not entering in fields.");
  }
}

@Then("^I should see 'Please enter a registered e-mail address' alert message on my screen\\.$")
public void i_should_see_Please_enter_a_registered_e_mail_address_alert_message_on_my_screen() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
 try{
	 
	Assert.assertTrue(pageObjects.ForgotPassword.forgotPasswod_EnterARegisteredEmaildErrorMessage(driver).isDisplayed());
	
 }catch(Exception e){
	 System.out.println(e);
	 Assert.fail("Error message for register email address is not displaying");
 }
}

@When("^I entered invalid email id$")
public void i_entered_invalid_email_id() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    try{
    	pageObjects.ForgotPassword.forgotPasswordEmailAddressTextBox(driver).sendKeys(Constant.InvalidEmailId);
    	
    }catch(Exception e){
    	System.out.println(e);
    	Assert.fail("not able to enter invalid eail id ");
    }
}

@Then("^I should see 'Invalid email address' error message on my screen\\.$")
public void i_should_see_Invalid_email_address_error_message_on_my_screen() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
try{
	Assert.assertTrue(pageObjects.ForgotPassword.forgotPasswod_EnterAValidEmailIdEroorMessage(driver).isDisplayed());
}catch(Exception e){
	System.out.println(e);
	Assert.fail("Error message for invalid email id is not displaying");
}
}

@Then("^I should see confirmation message 'We have sent a link to reset your password to your registered e-mail address\\.' on my screen\\.$")
public void i_should_see_confirmation_message_We_have_sent_a_link_to_reset_your_password_to_your_registered_e_mail_address_on_my_screen() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   try{
	  String actual=pageObjects.ForgotPassword.forgotPasswod_ConfirmationMessage(driver).getText();
	  Assert.assertEquals(actual, "We have sent a link to reset your password to your registered e-mail address","confirmation message is not displaying");
   }catch(Exception e){
	   System.out.println(e);
	   Assert.fail("Forgot password confirmation message is not displaying");
   }
}

@Then("^I should see 'Reset password' button is as not enabled\\.$")
public void i_should_see_Reset_password_button_is_as_not_enabled() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
try{
	Assert.assertTrue(!pageObjects.ForgotPassword.forgotPassResetPasswordButton(driver).isEnabled());
}catch(Exception e){
	System.out.println(e);
	Assert.fail("Reset password is enable");
}
}

@Then("^I should see 'Enter Your New Password' heading$")
public void i_should_see_Enter_Your_New_Password_heading() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  try{
	  String actual =pageObjects.ForgotPassword.forgotPassword_enteryournewpasswordheading(driver).getText();
	  Assert.assertEquals("Enter Your New Password", actual,"Heading is not matching for Enter Your New Password");
  }catch(Exception e){
	  System.out.println(e);
	  Assert.fail("Enter Your New Password heading is not displaying");
  }
}

@Then("^I should see 'Password' text field in reset paswword page\\.$")
public void i_should_see_Password_text_field_in_reset_paswword_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   try{
	  
	   Assert.assertTrue(pageObjects.ForgotPassword.forgotPassd_resetPasswordfield(driver).isDisplayed());
	   
			 String text=pageObjects.ForgotPassword.forgotPassd_resetPasswordfield(driver).getAttribute("placeholder");
			 Assert.assertEquals(text, "Password");
			}catch(Exception e){
				System.out.println(e);
				Assert.fail("password text box is not displaying.");
			}
			}
 

@Then("^I should see 'Retypepassword' text fields$")
public void i_should_see_Retypepassword_text_fields() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   try{
	   Assert.assertTrue(pageObjects.ForgotPassword.forgotPasswordReset_RetypePassword(driver).isDisplayed());
	   
	   String text=pageObjects.ForgotPassword.forgotPasswordReset_RetypePassword(driver).getAttribute("placeholder");
		 Assert.assertEquals(text, "RetypePassword");
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("RetypePassword text box is not displaying.");
		}
		}

@When("^I enter same text in 'Retypepassword' text field\\.$")
public void i_enter_same_text_in_Retypepassword_text_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   try{
	   pageObjects.ForgotPassword.forgotPasswordReset_RetypePassword(driver).sendKeys(Constant.ResetPassword);
   }catch(Exception e){
	   System.out.println(e);
   }
}

@Then("^I should see success message of reset password 'Your password has been reset\\.'$")
public void i_should_see_success_message_of_reset_password_Your_password_has_been_reset() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  try{
	  String actual =pageObjects.ForgotPassword.forgotPasswordYourpasswordhasbeenresetHeading(driver).getText();
	  Assert.assertEquals("Your password has been reset", actual);
  }catch(Exception e){
	  System.out.println(e);
	  Assert.fail("Your password has been reset hading is not displaying");
  }
}

@Then("^I should see 'To sign in with your new password, click here\\.' for sigin with shop n zip site\\.$")
public void i_should_see_To_sign_in_with_your_new_password_click_here_for_sigin_with_shop_n_zip_site() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   try{
	   String actual =pageObjects.ForgotPassword.forgotPasswordTosigninclickhere(driver).getText();
	   Assert.assertEquals("To sign in with your new password, click here", actual);
   }catch(Exception e){
	   System.out.println(e);
	   Assert.fail("To sign in with your new password, click here text is not displaying");
   }
}

@When("^I click on 'To sign in with your new password, click here\\.' link \\.$")
public void i_click_on_To_sign_in_with_your_new_password_click_here_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions

try{
	Assert.assertTrue(pageObjects.ForgotPassword.forgotPasswordTosigninclickhereLink(driver).isDisplayed());
	String textlink=pageObjects.ForgotPassword.forgotPasswordTosigninclickhereLink(driver).getAttribute("href");
	if (textlink == null) {
		Assert.fail("To sign in with your new password, click here is not clickable");
	}
	pageObjects.ForgotPassword.forgotPasswordTosigninclickhereLink(driver).click();
}catch(Exception e){
	System.out.println(e);
	Assert.fail("To sign in with your new password, click here is not clickable");
}
}

@Then("^I should be redirected to the sigin page of shop n zip site\\.$")
public void i_should_be_redirected_to_the_sigin_page_of_shop_n_zip_site() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   try{
	   String actual=driver.getTitle();
	   Assert.assertEquals("Shop n Zip - Sign In", actual);
   }catch(Exception e){
	   System.out.println(e);
	   Assert.fail("Shop n Zip - Sign In title is not displaying ");
   }
}

@Then("^I should be redirected to shop n zip application$")
public void i_should_be_redirected_to_shop_n_zip_application() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}


	@When("^I entered valid email id$")
	public void i_entered_valid_email_id() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try{
			Assert.assertTrue(pageObjects.ForgotPassword.forgotPasswordEmailAddressTextBox(driver).isDisplayed());
			pageObjects.ForgotPassword.forgotPasswordEmailAddressTextBox(driver).sendKeys(Constant.RegistredEmailId);
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("registered email id is not entered");
		}
	}

	@When("^I click on 'Reset Password' button$")
	public void i_click_on_Reset_Password_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	try{
		pageObjects.ForgotPassword.forgotPassResetPasswordButton(driver).click();
	}catch(Exception e){
		System.out.println(e);
		Assert.fail("Reset password button is not clicking");
	}
	}

	@Then("^I should be redirected to Reset Password page$")
	public void i_should_be_redirected_to_Reset_Password_page()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try{
			String actual= driver.getTitle();
			Assert.assertEquals(actual,"Shop n Zip - Reset Password","this is not reset password page");
		}catch(Exception e)
		{
			System.out.println(e);
			Assert.fail("Not getting the reset password page");
		}
	}

	@Then("^I should see 'Save New Password' button$")
	public void i_should_see_Save_New_Password_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Then("^I should see Reset password title as 'Enter your new Password'$")
	public void i_should_see_Reset_password_title_as_Enter_your_new_Password()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see password field with water mark text as 'Password'$")
	public void i_should_see_password_field_with_water_mark_text_as_Password()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^I am in sign in page$")
	public void i_am_in_sign_in_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try{
			driver.get(Constant.SignIn_URL);
			String actual= driver.getTitle();
			Assert.assertEquals("Shop n Zip - Sign In", actual);
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("I am not in sign in page");
		}
		}
	@Given("^I am a registered user$")
	public void i_am_a_registered_user() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^I clicked on 'Forgot Password' link in 'Sign In' page$")
	public void i_clicked_on_Forgot_Password_link_in_Sign_In_page()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try{
			pageObjects.SignIn.with_TFC_credentials_ForgotpasswordLink(driver).click();
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Forgot password link is not clickable");
		}
	}

	@Given("^'Sign In' is highlighted in menu grids$")
	public void sign_In_is_highlighted_in_menu_grids() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			String menuSelectionLine = HeaderLinks.SignIn_Menulink(driver)
					.getAttribute("class").toString();
			Assert.assertTrue(menuSelectionLine.equalsIgnoreCase("active"));

		} catch (Exception e) {
			Assert.fail("Menu selection line is not displaying");
		}
	}

	@When("^I entered registered email address in 'Forgot password page'$")
	public void i_entered_registered_email_address_in_Forgot_password_page()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try{
			Assert.assertTrue(pageObjects.ForgotPassword.forgotPasswordEmailAddressTextBox(driver).isDisplayed());
			pageObjects.ForgotPassword.forgotPasswordEmailAddressTextBox(driver).sendKeys(Constant.RegistredEmailId);
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("registered email id is not entered");
		}
	}

	@When("^I clicked on 'Reset password'$")
	public void i_clicked_on_Reset_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try{
			Assert.assertTrue(pageObjects.ForgotPassword.forgotPasswordEmailAddressTextBox(driver).isDisplayed());
			pageObjects.ForgotPassword.forgotPasswordEmailAddressTextBox(driver).sendKeys(Constant.RegistredEmailId);
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("registered email id is not entered");
		}
	}

	@Then("^I should get a link to reset the password to my email$")
	public void i_should_get_a_link_to_reset_the_password_to_my_email()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I confirm my email$")
	public void i_confirm_my_email() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be navigated to Reset password page$")
	public void i_should_be_navigated_to_Reset_password_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try{
			String actual= driver.getTitle();
			Assert.assertEquals(actual,"Shop n Zip - Reset Password","this is not reset password page");
		}catch(Exception e)
		{
			System.out.println(e);
			Assert.fail("Not getting the reset password page");
		}
	}
	@Then("^I should be able to see 'Save New Password' button$")
	public void i_should_be_able_to_see_Save_New_Password_button()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try{
			Assert.assertTrue(pageObjects.ForgotPassword.forgotPassword_savenewpassord(driver).isDisplayed());
			pageObjects.ForgotPassword.forgotPassword_savenewpassord(driver).click();
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Save new password button is not displaying");
		}
	}

	@When("^I entered registered email address$")
	public void i_entered_registered_email_address() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try{
			Assert.assertTrue(pageObjects.ForgotPassword.forgotPasswordEmailAddressTextBox(driver).isDisplayed());
			pageObjects.ForgotPassword.forgotPasswordEmailAddressTextBox(driver).sendKeys(Constant.RegistredEmailId);
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("registered email id is not entered");
		}
	}


	@When("^click on Reset Password button$")
	public void click_on_Reset_Password_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try{
			Assert.assertTrue(pageObjects.ForgotPassword.forgotPasswordEmailAddressTextBox(driver).isDisplayed());
			pageObjects.ForgotPassword.forgotPasswordEmailAddressTextBox(driver).sendKeys(Constant.RegistredEmailId);
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("registered email id is not entered");
		}
	}

	@Then("^I should get reset password link to the specified email address$")
	public void i_should_get_reset_password_link_to_the_specified_email_address()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I clicked on the link$")
	public void i_clicked_on_the_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I enter new password$")
	public void i_enter_new_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	try{
		pageObjects.ForgotPassword.forgotPassd_resetPasswordfield(driver).sendKeys(Constant.ResetPassword);
	}catch(Exception e){
		System.out.println(e);
		Assert.fail("Reset password page: password text field is not displaying");
	}
	}

	@When("^Click on save New Password button$")
	public void click_on_save_New_Password_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try{
			Assert.assertTrue(pageObjects.ForgotPassword.forgotPassword_savenewpassord(driver).isDisplayed());
			pageObjects.ForgotPassword.forgotPassword_savenewpassord(driver).click();
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Save new password button is not displaying");
		}
	}


	@Then("^I should see success message of reset password$")
	public void i_should_see_success_message_of_reset_password()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I click on the link after (\\d+) hours$")
	public void i_click_on_the_link_after_hours(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see the message saying link is expired$")
	public void i_should_see_the_message_saying_link_is_expired()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I clicked on 'Save New Password' button$")
	public void i_clicked_on_Save_New_Password_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try{
			Assert.assertTrue(pageObjects.ForgotPassword.forgotPassword_savenewpassord(driver).isDisplayed());
			pageObjects.ForgotPassword.forgotPassword_savenewpassord(driver).click();
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Save new password button is not displaying");
		}
	}

	@Then("^I should be able to see one alert message 'Enter your password'$")
	public void i_should_be_able_to_see_one_alert_message_Enter_your_password()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		  try{
			  String actual =pageObjects.ForgotPassword.forgotPassword_enteryournewpasswordheading(driver).getText();
			  Assert.assertEquals("Enter Your New Password", actual,"Heading is not matching for Enter Your New Password");
		  }catch(Exception e){
			  System.out.println(e);
			  Assert.fail("Enter Your New Password heading is not displaying");
		  }
		}

	@When("^I  enters  more than specified character length data$")
	public void i_enters_more_than_specified_character_length_data()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should not be able to enter more than specified character length data in 'Password' text field$")
	public void i_should_not_be_able_to_enter_more_than_specified_character_length_data_in_Password_text_field()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I Clicked on Reset Password button$")
	public void i_Clicked_on_Reset_Password_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try{
			String textlink=pageObjects.ForgotPassword.forgotPassResetPasswordButton(driver).getAttribute("type");
			if (textlink == null) {
				Assert.fail("To sign in with your new password, click here is not clickable");
			}
			pageObjects.ForgotPassword.forgotPassResetPasswordButton(driver).click();
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Reset password button is not clickable");
		}
	}

	@Then("^I should see a validation message saying email address field is required$")
	public void i_should_see_a_validation_message_saying_email_address_field_is_required()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try{
			String actual=pageObjects.ForgotPassword.forgotPasswordErrormessage_ThisFiledIsrequired(driver).getText();
			Assert.assertEquals(" This field is required", actual);
		}catch(Exception e){
			System.out.println(e);
			Assert.fail(" This field is required error message is not displaying");
		}
	}

	@When("^I entered invalid email address$")
	public void i_entered_invalid_email_address() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try{
			pageObjects.ForgotPassword.forgotPasswordEmailAddressTextBox(driver).sendKeys(Constant.InvalidEmailId);
			String relatederror=pageObjects.ForgotPassword.forgotPasswod_EnterAValidEmailIdEroorMessage(driver).getText();
			Assert.assertEquals(" Invalid email address", relatederror);
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("error message for invalid email id is not displaying");
		}
	}

	@Then("^I should see the error message$")
	public void i_should_see_the_error_message() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	try{
		String relatederror=pageObjects.ForgotPassword.forgotPasswod_EnterAValidEmailIdEroorMessage(driver).getText();
		Assert.assertEquals(" Invalid email address", relatederror);
	}catch(Exception e){
		System.out.println(e);
		Assert.fail("error message for invalid email id is not displaying");
	}
}
		
	}
	


