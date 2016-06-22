package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utils.Constant;
import utils.Utils;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registration_StepDefinition {
	public static WebDriver driver;
public Registration_StepDefinition (){
	driver = Hooks.driver;
}

@Given("^I am in home page of shopNzip$")
public void i_am_in_home_page_of_shopNzip() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    try{
    	driver.get("http://demo24kentico8.raybiztech.com/");
    	String Title=driver.getTitle();
    	Assert.assertEquals(Title, "Shop n Zip - Home");
    }catch(Exception e){
    	Assert.fail("I am not in home page");
    }
}

@Then("^I should see 'Sign Up' button in header$")
public void i_should_see_Sign_Up_button_in_header1() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   try{
	   Assert.assertTrue(pageObjects.HeaderLinks.signUp_Menulink(driver).isDisplayed());
   }catch(Exception e){
	   Assert.fail("sign up option is not displaying in home page");
   }
}

@Given("^I am in About us page$")
public void i_am_in_About_us_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   try{
	   driver.navigate().to(Constant.AboutUs_URL);
	   String Title=driver.getTitle();
	   Assert.assertEquals(Title, "");
   }catch(Exception e){
	   Assert.fail("I am not in about us page");
   }
}

@Then("^I should see 'Sign Up' button$")
public void i_should_see_Sign_Up_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    try{
    	Assert.assertTrue(pageObjects.AboutUs.signUpOption(driver).isDisplayed());
    }
   catch(Exception e){
	   Assert.fail("Sign Up option  is not displaying in about us page");
   }
}

@Then("^I should not see the sign up button in the current page$")
public void i_should_not_see_the_sign_up_button_in_the_current_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   try{
	   Assert.assertTrue(!pageObjects.AboutUs.signUpOption(driver).isDisplayed());
   }catch(Exception e){
	   Assert.fail("After loggin to the site sign up button is displaying in the about us page");
   }
}

@Given("^I am in FAQ page$")
public void i_am_in_FAQ_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    try{
    	driver.navigate().to(Constant.FAQ_URL);
    	String Title=driver.getTitle();
    	Assert.assertEquals(Title, "");
    }catch(Exception e){
    	Assert.fail("not able to navigating to the FAQS page");
    }
}

@Given("^I am in How It Works page$")
public void i_am_in_How_It_Works_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	try{
    	driver.navigate().to(Constant.HowItWorks_URL);
    	String Title=driver.getTitle();
    	Assert.assertEquals(Title, "");
    }catch(Exception e){
    	Assert.fail("not able to navigating to the How it works page");
    }
}


@Given("^I am in Shop Now page$")
public void i_am_in_Shop_Now_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	try{
    	driver.navigate().to(Constant.ShopNow_URL);
    	String Title=driver.getTitle();
    	Assert.assertEquals(Title, "");
    }catch(Exception e){
    	Assert.fail("not able to navigating to the Shop Now page");
    }
}


@Given("^I should see 'Sign Up' button in header$")
public void i_should_see_Sign_Up_button_in_header() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    try{
    Assert.assertTrue(pageObjects.HeaderLinks.signUp_Menulink(driver).isDisplayed());
    }catch(Exception e){
    	Assert.fail("Sigun up button is not displaying in menu link");
    }
}

@When("^I click on 'Sign Up' button$")
public void i_click_on_Sign_Up_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    try{
    	 Assert.assertTrue(pageObjects.HeaderLinks.signUp_Menulink(driver).isDisplayed());
    	 pageObjects.HeaderLinks.signUp_Menulink(driver).click();
    }catch(Exception e){
    	Assert.fail("Sigun up button in menu link is not clickable");
    }
}
@Then("^I should see 'Or Creat a new TFC account!' heading at Sign Up form$")
public void i_should_see_Or_Creat_a_new_TFC_account_heading_at_Sign_Up_form() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
 try{
	 Assert.assertTrue(pageObjects.SignUp.creatNewTFCaccountTitle(driver).isDisplayed());
 }catch(Exception e){
	 Assert.fail("Or Creat a new TFC account! heading is not displaying");
 }
}

@Given("^I am in Sign Up page$")
public void i_am_in_Sign_Up_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   try{
	   driver.navigate().to(Constant.SignUp_URL);
	   String Title=driver.getTitle();
	   Assert.assertEquals(Title, "");
   }catch(Exception e){
	   Assert.fail("Not navigating to the sign Up page");
   }
}

@Then("^I should see Name field$")
public void i_should_see_Name_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    try{
    	Assert.assertTrue(pageObjects.SignUp.NameTextBox(driver).isDisplayed());
    }catch(Exception e){
    	Assert.fail("Name text field is not displaying in signup page");
    }
}

@Then("^I should see Country of current residence drop down$")
public void i_should_see_Country_of_current_residence_drop_down() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	  try{
	    	Assert.assertTrue(pageObjects.SignUp.currentCountryDropDown(driver).isDisplayed());
	    }catch(Exception e){
	    	Assert.fail("Country of current residence drop down field is not displaying in signup page");
	    }
	}


@Then("^I should see Email address field$")
public void i_should_see_Email_address_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	try{
    	Assert.assertTrue(pageObjects.SignUp.emailAddressTextBox(driver).isDisplayed());
    }catch(Exception e){
    	Assert.fail("Email address text field is not displaying in signup page");
    }
}


@Then("^I should see Phone number field$")
public void i_should_see_Phone_number_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	try{
    	Assert.assertTrue(pageObjects.SignUp.phoneNumberTextBox(driver).isDisplayed());
    }catch(Exception e){
    	Assert.fail("Phone number  text field is not displaying in signup page");
    }
}
@Then("^I should see Password field$")
public void i_should_see_Password_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	try{
    	Assert.assertTrue(pageObjects.SignUp.passWordTextBoxRequiredSymbol(driver).isDisplayed());
    }catch(Exception e){
    	Assert.fail(" Password text field is not displaying in signup page");
    }
}

@Then("^I should see Re-type password field$")
public void i_should_see_Re_type_password_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	try{
    	Assert.assertTrue(pageObjects.SignUp.reTypePasswordTextBox(driver).isDisplayed());
    }catch(Exception e){
    	Assert.fail(" Re-type password text field is not displaying in signup page");
    }
}


@Then("^I should see Address text field$")
public void i_should_see_Address_text_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	try{
    	Assert.assertTrue(pageObjects.SignUp.addressTextBox(driver).isDisplayed());
    }catch(Exception e){
    	Assert.fail("Address  text field is not displaying in signup page");
    }
}


@Then("^I should see City text field$")
public void i_should_see_City_text_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	try{
    	Assert.assertTrue(pageObjects.SignUp.cityTextBox(driver).isDisplayed());
    }catch(Exception e){
    	Assert.fail("City text field is not displaying in signup page");
    }
}

@Then("^I should see State selection drop down$")
public void i_should_see_State_selection_drop_down() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	try{
    	Assert.assertTrue(pageObjects.SignUp.stateDropDown(driver).isDisplayed());
    }catch(Exception e){
    	Assert.fail("State selection drop down field is not displaying in signup page");
    }
}

@Then("^I should see Register Now button$")
public void i_should_see_Register_Now_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	try{
    	Assert.assertTrue(pageObjects.SignUp.registerNowButton(driver).isDisplayed());
    }catch(Exception e){
    	Assert.fail("Register Now button is not displaying in signup page");
    }
}


@Then("^I should see Agree check box$")
public void i_should_see_Agree_check_box() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	try{
    	Assert.assertTrue(pageObjects.SignUp.tearmNconditionCheckBox(driver).isDisplayed());
    }catch(Exception e){
    	Assert.fail("Agree check box is not displaying in signup page");
    }
}
@Then("^I should see Terms and condition link$")
public void i_should_see_Terms_and_condition_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	try{
    	Assert.assertTrue(pageObjects.SignUp.termsAndConditionLink(driver).isDisplayed());
    }catch(Exception e){
    	Assert.fail("Terms and condition link is not displaying in signup page");
    }
}

@Then("^I should see Privacy Policy link$")
public void i_should_see_Privacy_Policy_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	try{
    	Assert.assertTrue(pageObjects.SignUp.privacypolicyLink(driver).isDisplayed());
    }catch(Exception e){
    	Assert.fail("Privacy Policy link is not displaying in signup page");
    }
}

@Then("^I should see Name field as mendatory$")
public void i_should_see_Name_field_as_mendatory() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	try{
    	Assert.assertTrue(pageObjects.SignUp.NameTextBoxRequiredSymbol(driver).isDisplayed());
    }catch(Exception e){
    	Assert.fail("Name field as mendatory is not displaying in signup page");
    }
}


@Then("^I should see Country of current residence drop down as mendatory$")
public void i_should_see_Country_of_current_residence_drop_down_as_mendatory() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	try{
    	Assert.assertTrue(pageObjects.SignUp.currentCountryDropDownRequiredSymbol(driver).isDisplayed());
    }catch(Exception e){
    	Assert.fail("Country of current residence drop down as mendatory is not displaying in signup page");
    }
}


@Then("^I should see Email address field as mendatory$")
public void i_should_see_Email_address_field_as_mendatory() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	try{
    	Assert.assertTrue(pageObjects.SignUp.emailAddressTextBoxRequiredSymbol(driver).isDisplayed());
    }catch(Exception e){
    	Assert.fail("Email address field as mendatory is not displaying in signup page");
    }
}


@Then("^I should see Phone number field as mendatory$")
public void i_should_see_Phone_number_field_as_mendatory() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	try{
    	Assert.assertTrue(pageObjects.SignUp.phoneNumberTextBoxRequiredSymbol(driver).isDisplayed());
    }catch(Exception e){
    	Assert.fail("Phone number field as mendatory is not displaying in signup page");
    }
}

@Then("^I should see Password field as mendatory$")
public void i_should_see_Password_field_as_mendatory() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	try{
    	Assert.assertTrue(pageObjects.SignUp.passWordTextBoxRequiredSymbol(driver).isDisplayed());
    }catch(Exception e){
    	Assert.fail("Password field as mendatory is not displaying in signup page");
    }
}


@Then("^I should see Re-type password field as mendatory$")
public void i_should_see_Re_type_password_field_as_mendatory() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	try{
    	Assert.assertTrue(pageObjects.SignUp.reTypePasswordRequiredSymbol(driver).isDisplayed());
    }catch(Exception e){
    	Assert.fail("Re-type password field as mendatory is not displaying in signup page");
    }
}

@Given("^I am in Sign Up page$")
public void i_am_in_Sign_Up_page1() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    try{
    	driver.navigate().to(Constant.SignUp_URL);
    }
    catch(Exception e){
    	Assert.fail("Signup page is not available");
    }
}

@When("^I clicked on Facebook icon in signup page\\.$")
public void i_clicked_on_Facebook_icon_in_signup_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    try{
    	Assert.assertTrue(pageObjects.SignUp.signUp_with_socialNW_FaceBooklink(driver).isDisplayed());
    	pageObjects.SignUp.signUp_with_socialNW_FaceBooklink(driver).click();
    }
    catch(Exception e){
    	Assert.fail("Facebook icon is not available in signup page");
    }
}

@Then("^I should see a pop for Facebook pop up login is appeared$")
public void i_should_see_a_pop_for_Facebook_pop_up_login_is_appeared() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   try	{
	   Utils.switchToNewWindow(driver);
			String title = driver.getTitle();
			Assert.assertEquals(title, "Facebook");
		} catch (Exception e) {
			Utils.takeScreenshot("Login_with_Facebook");
			Assert.fail("failed to log in with facebook credentials");
		}

	
}

@When("^I loged in with my Signin with facebook credintials$")
public void i_loged_in_with_my_Signin_with_facebook_credintials() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    try{
    	pageObjects.SignUp.faceBookEmailId(driver).sendKeys("mytest1460@gmail.com");
    	pageObjects.SignUp.faceBookPassword(driver).sendKeys("mytest1@3");
    	pageObjects.SignUp.faceBookLoginButton(driver).click();
    	Assert.assertTrue(pageObjects.SignUp.faceBookGigiyamessage(driver).isDisplayed()&& pageObjects.SignUp.faceBookCloseWindowOption(driver).isDisplayed());
    	pageObjects.SignUp.faceBookCloseWindowOption(driver).click();
    }catch(Exception e){
    	Assert.fail("process failed to loggin with facebook");
    }
}

@Then("^I should see Name field in the sign up from is auto filled$")
public void i_should_see_Name_field_in_the_sign_up_from_is_auto_filled() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    try{
    	String actual=pageObjects.SignUp.NameTextBox(driver).getText();
    	Assert.assertEquals(actual, "");
    }catch(Exception e){
    	Assert.fail("name is not fetching from FB account");
    }
}

@Then("^I should see Country of current resident field in the sign up from is auto filled$")
public void i_should_see_Country_of_current_resident_field_in_the_sign_up_from_is_auto_filled() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    try{
    	String actual=pageObjects.SignUp.currentCountryDropDown(driver).getText();
    	Assert.assertEquals(actual, "");
    }catch(Exception e){
    	Assert.fail("Country name  is not fetching from FB account");
    }
}


@Then("^I should see Email Address field in the sign up from is auto filled$")
public void i_should_see_Email_Address_field_in_the_sign_up_from_is_auto_filled() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 try{
	    	String actual=pageObjects.SignUp.currentCountryDropDown(driver).getText();
	    	Assert.assertEquals(actual, "");
	    }catch(Exception e){
	    	Assert.fail("Country name  is not fetching from FB account");
	    }
	}


@Then("^I should see Phone Number field in the sign up from is auto filled$")
public void i_should_see_Phone_Number_field_in_the_sign_up_from_is_auto_filled() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 try{
	    	String actual=pageObjects.SignUp.phoneNumberTextBox(driver).getText();
	    	Assert.assertEquals(actual, "");
	    }catch(Exception e){
	    	Assert.fail("Phone number is not fetching from FB account");
	    }
	}


@When("^I clicked on Twitter icon in signup page\\.$")
public void i_clicked_on_Twitter_icon_in_signup_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
 try{
	 Assert.assertTrue(pageObjects.SignUp.signUp_with_socialNW_Twitterlink(driver).isDisplayed());
	 pageObjects.SignUp.signUp_with_socialNW_Twitterlink(driver).click();
 }catch(Exception e){
	 Assert.fail("Twitter icon is not displaying in signup page");
 }
}

@Then("^I should see a pop for Twitter poup login is appeared$")
public void i_should_see_a_pop_for_Twitter_poup_login_is_appeared() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 try	{
		   Utils.switchToNewWindow(driver);
				String title = driver.getTitle();
				Assert.assertEquals(title, "Twitter / Authorize an application");
			} catch (Exception e) {
				Utils.takeScreenshot("Login_with_twitter");
				Assert.fail("failed to log in with twitter credentials");
			}

		
	}

@When("^I loged in with my Signin with twitter credintials$")
public void i_loged_in_with_my_Signin_with_twitter_credintials() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    try{
    	pageObjects.SignUp.twitterUserNameTextBox(driver).sendKeys("potturu.santoshi@gmail.com");
    	pageObjects.SignUp.twitterPassWordTextField(driver).sendKeys("welcome@123");
    	pageObjects.SignUp.twitterLoginButton(driver).click();
    	Assert.assertTrue(pageObjects.SignUp.twitterGigiaMessage(driver).isDisplayed() && pageObjects.SignUp.twitterGigiyaCloseWindoOption(driver).isDisplayed());
    	pageObjects.SignUp.twitterGigiyaCloseWindoOption(driver).click();
    }catch(Exception e){
    	Assert.fail("login with twitter action is failed");
    }
}

@When("^I clicked on Google\\+ icon in signup page\\.$")
public void i_clicked_on_Google_icon_in_signup_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  try{
	Assert.assertTrue(pageObjects.SignUp.signUp_with_socialNW_googlePluslink(driver).isDisplayed());
	pageObjects.SignUp.signUp_with_socialNW_googlePluslink(driver).click();
  }catch(Exception e){
	  Assert.fail("g+ icon is not displaying");
  }
}

@Then("^I should see a pop for Google\\+ login is appeared$")
public void i_should_see_a_pop_for_Google_login_is_appeared() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	try	{
		   Utils.switchToNewWindow(driver);
				String title = driver.getTitle();
				Assert.assertEquals(title, "");
			} catch (Exception e) {
				Utils.takeScreenshot("Login_with_g+");
				Assert.fail("failed to log in with google+ credentials");
			}

		
	}

@When("^I loged in with my Signin with google\\+ credintials$")
public void i_loged_in_with_my_Signin_with_google_credintials() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}



@Given("^Registered with valid details$")
public void registered_with_valid_details() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   try{
	   pageObjects.SignUp.NameTextBox(driver).sendKeys("baby");
	   pageObjects.SignUp.LastNameTextBox(driver).sendKeys("kumari");
	  
	   Select a = new Select( pageObjects.SignUp.creatNewTFCaccount_Description(driver));
		a.selectByValue("US");
		pageObjects.SignUp.emailAddressTextBox(driver).sendKeys("mytest1460@gmailcom");
		pageObjects.SignUp.phoneNumberTextBox(driver).sendKeys(Constant.phoneNumber);
		pageObjects.SignUp.passWordTextBox(driver).sendKeys(Constant.password);
		pageObjects.SignUp.reTypePasswordTextBox(driver).sendKeys(Constant.password);
		pageObjects.SignUp.addressTextBox(driver).sendKeys(Constant.address);
		pageObjects.SignUp.stateDropDown(driver).sendKeys(Constant.state);
		pageObjects.SignUp.cityTextBox(driver).sendKeys(Constant.city);
		pageObjects.SignUp.zipcodeTextBox(driver).sendKeys(Constant.zipCode);
		pageObjects.SignUp.tearmNconditionCheckBox(driver).click();
		Assert.assertTrue(pageObjects.SignUp.registerNowButton(driver).isDisplayed());
		pageObjects.SignUp.registerNowButton(driver).click();
   }catch(Exception e){
	   Assert.fail("check entered data again , not able to signup");
   }
}
@Then("^I should see Last name field$")
public void i_should_see_Last_name_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   try{
	   Assert.assertTrue(pageObjects.SignUp.LastNameTextBox(driver).isDisplayed());
   }catch(Exception e){
	   Assert.fail("Last name text field is not displaying");
   }
}
@Then("^I should see Last name field as mendatory$")
public void i_should_see_Last_name_field_as_mendatory() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   try{
	   Assert.assertTrue(pageObjects.SignUp.LastNameTextBoxmandatory(driver).isDisplayed());
   }catch(Exception e){
	   Assert.fail("Required symbol with last name is not displaying");
   }
}
@Then("^I should see Registration is successful$")
public void i_should_see_Registration_is_successful() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^I completed sign up$")
public void i_completed_sign_up() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should see a welcome pop up$")
public void i_should_see_a_welcome_pop_up() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should see 'Thank you for registering with us' text along with User name$")
public void i_should_see_Thank_you_for_registering_with_us_text_along_with_User_name() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should see 'Start shopping' button$")
public void i_should_see_Start_shopping_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^I am in sign up page$")
public void i_am_in_sign_up_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should get verification link to the specified email address$")
public void i_should_get_verification_link_to_the_specified_email_address() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^It should be valid upto one year$")
public void it_should_be_valid_upto_one_year() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I click on the verifiction link$")
public void i_click_on_the_verifiction_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should be navigated to shop N zip application$")
public void i_should_be_navigated_to_shop_N_zip_application() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should see verification is successful$")
public void i_should_see_verification_is_successful() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I logged out$")
public void i_logged_out() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^click on same verficatoin link again in email$")
public void click_on_same_verficatoin_link_again_in_email() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should be redirected to shop n zip application$")
public void i_should_be_redirected_to_shop_n_zip_application() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should see a message saying 'Your email is already been verified'$")
public void i_should_see_a_message_saying_Your_email_is_already_been_verified() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I click on verficatoin link in email after one year$")
public void i_click_on_verficatoin_link_in_email_after_one_year() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should see a message saying 'Your link is either incorrect or expired'$")
public void i_should_see_a_message_saying_Your_link_is_either_incorrect_or_expired() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^I clicked on 'Register now' button$")
public void i_clicked_on_Register_now_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    try{
    	Assert.assertTrue(pageObjects.SignUp.registerNowButton(driver).isDisplayed());
    	pageObjects.SignUp.registerNowButton(driver).click();
    }catch(Exception e){
    	Assert.fail("Register now button is not displaying");
    }
}

@Then("^it should see registration is unsuccessful$")
public void it_should_see_registration_is_unsuccessful() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^I tried to Registered without giving details to Name field$")
public void i_tried_to_Registered_without_giving_details_to_Name_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	  try{
	    	Assert.assertTrue(pageObjects.SignUp.registerNowButton(driver).isDisplayed());
	    	pageObjects.SignUp.registerNowButton(driver).click();
	    }catch(Exception e){
	    	Assert.fail("Register now button is not displaying");
	    }
	}

@Then("^I should see registration is unsuccessful$")
public void i_should_see_registration_is_unsuccessful() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^I tried to Registered without selecting anything in Country of current residence field$")
public void i_tried_to_Registered_without_selecting_anything_in_Country_of_current_residence_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	try{
		   pageObjects.SignUp.NameTextBox(driver).sendKeys("baby");
		   pageObjects.SignUp.LastNameTextBox(driver).sendKeys("kumari");
		  
		  // Select a = new Select( pageObjects.SignUp.creatNewTFCaccount_Description(driver));
			//a.selectByValue("US");
			pageObjects.SignUp.emailAddressTextBox(driver).sendKeys("mytest1460@gmailcom");
			pageObjects.SignUp.phoneNumberTextBox(driver).sendKeys(Constant.phoneNumber);
			pageObjects.SignUp.passWordTextBox(driver).sendKeys(Constant.password);
			pageObjects.SignUp.reTypePasswordTextBox(driver).sendKeys(Constant.password);
			pageObjects.SignUp.addressTextBox(driver).sendKeys(Constant.address);
			pageObjects.SignUp.stateDropDown(driver).sendKeys(Constant.state);
			pageObjects.SignUp.cityTextBox(driver).sendKeys(Constant.city);
			pageObjects.SignUp.zipcodeTextBox(driver).sendKeys(Constant.zipCode);
			pageObjects.SignUp.tearmNconditionCheckBox(driver).click();
			Assert.assertTrue(pageObjects.SignUp.registerNowButton(driver).isDisplayed());
			pageObjects.SignUp.registerNowButton(driver).click();
	   }catch(Exception e){
		   Assert.fail("check entered data again , not able to signup without country name");
	   }
	}


@Then("^I should see registration is unsuccessful$")
public void i_should_see_registration_is_unsuccessful(DataTable arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
    throw new PendingException();
}

@Given("^I tried to Registered without giving details to Email Address field$")
public void i_tried_to_Registered_without_giving_details_to_Email_Address_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	try{
		   pageObjects.SignUp.NameTextBox(driver).sendKeys("baby");
		   pageObjects.SignUp.LastNameTextBox(driver).sendKeys("kumari");
		  
		   Select a = new Select( pageObjects.SignUp.creatNewTFCaccount_Description(driver));
			a.selectByValue("US");
			//pageObjects.SignUp.emailAddressTextBox(driver).sendKeys("mytest1460@gmailcom");
			pageObjects.SignUp.phoneNumberTextBox(driver).sendKeys(Constant.phoneNumber);
			pageObjects.SignUp.passWordTextBox(driver).sendKeys(Constant.password);
			pageObjects.SignUp.reTypePasswordTextBox(driver).sendKeys(Constant.password);
			pageObjects.SignUp.addressTextBox(driver).sendKeys(Constant.address);
			pageObjects.SignUp.stateDropDown(driver).sendKeys(Constant.state);
			pageObjects.SignUp.cityTextBox(driver).sendKeys(Constant.city);
			pageObjects.SignUp.zipcodeTextBox(driver).sendKeys(Constant.zipCode);
			pageObjects.SignUp.tearmNconditionCheckBox(driver).click();
			Assert.assertTrue(pageObjects.SignUp.registerNowButton(driver).isDisplayed());
			pageObjects.SignUp.registerNowButton(driver).click();
	   }catch(Exception e){
		   Assert.fail("check entered data again , not able to signup without country name");
	   }
	}

@Given("^I tried to Registered without giving details to Phone Number field$")
public void i_tried_to_Registered_without_giving_details_to_Phone_Number_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	try{
		   pageObjects.SignUp.NameTextBox(driver).sendKeys("baby");
		   pageObjects.SignUp.LastNameTextBox(driver).sendKeys("kumari");
		  
		   Select a = new Select( pageObjects.SignUp.creatNewTFCaccount_Description(driver));
			a.selectByValue("US");
			pageObjects.SignUp.emailAddressTextBox(driver).sendKeys("mytest1460@gmailcom");
			//pageObjects.SignUp.phoneNumberTextBox(driver).sendKeys(Constant.phoneNumber);
			pageObjects.SignUp.passWordTextBox(driver).sendKeys(Constant.password);
			pageObjects.SignUp.reTypePasswordTextBox(driver).sendKeys(Constant.password);
			pageObjects.SignUp.addressTextBox(driver).sendKeys(Constant.address);
			pageObjects.SignUp.stateDropDown(driver).sendKeys(Constant.state);
			pageObjects.SignUp.cityTextBox(driver).sendKeys(Constant.city);
			pageObjects.SignUp.zipcodeTextBox(driver).sendKeys(Constant.zipCode);
			pageObjects.SignUp.tearmNconditionCheckBox(driver).click();
			Assert.assertTrue(pageObjects.SignUp.registerNowButton(driver).isDisplayed());
			pageObjects.SignUp.registerNowButton(driver).click();
	   }catch(Exception e){
		   Assert.fail("check entered data again , not able to signup without country name");
	   }
	}

@Given("^I tried to Registered without giving details to Password field$")
public void i_tried_to_Registered_without_giving_details_to_Password_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	try{
		   pageObjects.SignUp.NameTextBox(driver).sendKeys("baby");
		   pageObjects.SignUp.LastNameTextBox(driver).sendKeys("kumari");
		  
		   Select a = new Select( pageObjects.SignUp.creatNewTFCaccount_Description(driver));
			a.selectByValue("US");
			pageObjects.SignUp.emailAddressTextBox(driver).sendKeys("mytest1460@gmailcom");
			pageObjects.SignUp.phoneNumberTextBox(driver).sendKeys(Constant.phoneNumber);
			pageObjects.SignUp.passWordTextBox(driver).sendKeys(Constant.password);
			//pageObjects.SignUp.reTypePasswordTextBox(driver).sendKeys(Constant.password);
			pageObjects.SignUp.addressTextBox(driver).sendKeys(Constant.address);
			pageObjects.SignUp.stateDropDown(driver).sendKeys(Constant.state);
			pageObjects.SignUp.cityTextBox(driver).sendKeys(Constant.city);
			pageObjects.SignUp.zipcodeTextBox(driver).sendKeys(Constant.zipCode);
			pageObjects.SignUp.tearmNconditionCheckBox(driver).click();
			Assert.assertTrue(pageObjects.SignUp.registerNowButton(driver).isDisplayed());
			pageObjects.SignUp.registerNowButton(driver).click();
	   }catch(Exception e){
		   Assert.fail("check entered data again , not able to signup without country name");
	   }
	}
@Given("^I tried to Registered without giving details to re-type Password field$")
public void i_tried_to_Registered_without_giving_details_to_re_type_Password_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	try{
		   pageObjects.SignUp.NameTextBox(driver).sendKeys("baby");
		   pageObjects.SignUp.LastNameTextBox(driver).sendKeys("kumari");
		  
		   Select a = new Select( pageObjects.SignUp.creatNewTFCaccount_Description(driver));
			a.selectByValue("US");
			pageObjects.SignUp.emailAddressTextBox(driver).sendKeys("mytest1460@gmailcom");
			pageObjects.SignUp.phoneNumberTextBox(driver).sendKeys(Constant.phoneNumber);
			pageObjects.SignUp.passWordTextBox(driver).sendKeys(Constant.password);
			//pageObjects.SignUp.reTypePasswordTextBox(driver).sendKeys(Constant.password);
			pageObjects.SignUp.addressTextBox(driver).sendKeys(Constant.address);
			pageObjects.SignUp.stateDropDown(driver).sendKeys(Constant.state);
			pageObjects.SignUp.cityTextBox(driver).sendKeys(Constant.city);
			pageObjects.SignUp.zipcodeTextBox(driver).sendKeys(Constant.zipCode);
			pageObjects.SignUp.tearmNconditionCheckBox(driver).click();
			Assert.assertTrue(pageObjects.SignUp.registerNowButton(driver).isDisplayed());
			pageObjects.SignUp.registerNowButton(driver).click();
	   }catch(Exception e){
		   Assert.fail("check entered data again , not able to signup without country name");
	   }
	}
@Given("^I Click on sign up button$")
public void i_Click_on_sign_up_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 try{
	    	Assert.assertTrue(pageObjects.SignUp.registerNowButton(driver).isDisplayed());
	    	pageObjects.SignUp.registerNowButton(driver).click();
	    }catch(Exception e){
	    	Assert.fail("Register now button is not displaying");
	    }
	}


@Then("^I should see the validation messages are displayed$")
public void i_should_see_the_validation_messages_are_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  try{
	  Assert.assertTrue(pageObjects.SignUp.alertMessageForCountryDropDown(driver).isDisplayed()&& pageObjects.SignUp.alertMessageForEmailAddresstextField(driver).isDisplayed()&&pageObjects.SignUp.alertMessageForNameTextfield(driver).isDisplayed()&& pageObjects.SignUp.alertMessageForPhoneNumbertextField(driver).isDisplayed()&&pageObjects.SignUp.alertMessageForReTypePasswordtextField(driver).isDisplayed()&&pageObjects.SignUp.alertMessageForZipCodetextBox(driver).isDisplayed());
	  
  }catch(Exception e){
	  Assert.fail("Validation message are not displaying after clicking on register now button without any detailas");
  }
}}

