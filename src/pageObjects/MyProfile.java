package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyProfile {
	public static WebElement element = null;

	public static WebElement UserName_Menulink(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='navbar']/ul/li[5]/a"));
		return element;
	}
	public static WebElement myProfile_DropDownMenulink(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@class='dropdown-menu']/li[4]/a"));
		return element;
	}

	public static WebElement MyProfileSubMenu(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@class='col-lg-3 active']/a"));
		return element;
	}

	public static WebElement ProfilwHeading(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/div[7]/div/div/div[1]/div[2]/div/div/div/h2"));
		return element;
	}

	public static WebElement NameWithUserName(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@class='profile_main col-sm-3']/h3[1]"));
		return element;
	}

	public static WebElement EmailIdWithUserEmailId(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@class='profile_main col-sm-3']/h3[2]"));
		return element;
	}

	public static WebElement PhoneNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@class='profile_main col-sm-3']/h3[3]"));
		return element;
	}

	public static WebElement CountryOfCurrentResidence(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@class='profile_main col-sm-3']/h3[4]"));
		return element;
	}

	public static WebElement Socialprofileheading(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@class='profile_main col-sm-3']/h3[5]"));
		return element;
	}

	public static WebElement FbIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='fbimg']"));
		return element;
	}

	public static WebElement Twittericon(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='twitter']"));
		return element;
	}

	public static WebElement GmailIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='gplus']"));
		return element;
	}

	public static WebElement EditProfileLinkText(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[text()='Edit Profile']"));
		return element;
	}

	public static WebElement phonNumebrError(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[text() =' Invalid phone number']"));
		return element;
	}


	public static WebElement EditProfileheadingInEditprofilePage(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@class='edit_profile clearfix']/div/p[1]"));
		return element;
	}

	public static WebElement ChangePasswordLinkInEditProfile(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[text()='Change Password']"));
		return element;
	}

	public static WebElement Passwordfield(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@class='password']"));
		return element;
	}

	public static WebElement EditProfileAvailablefields(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@class='col-md-2 col-sm-3']"));
		return element;
	}

	public static WebElement EditProfileFirstNameText(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@class='col-md-2 col-sm-3'])[1]"));
		return element;
	}

	public static WebElement EditProfileLastnameText(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@class='col-md-2 col-sm-3'])[2]"));
		return element;
	}
	public static WebElement EditProfileAddresstext(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@class='col-md-2 col-sm-3'])[3]"));
		return element;
	}

	public static WebElement EditProfilePhoneText(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@class='col-md-2 col-sm-3'])[4]"));
		return element;
	}

	public static WebElement EditProfileCityText(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@class='col-md-2 col-sm-3'])[5]"));
		return element;
	}

	public static WebElement EditProfileStateText(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@class='col-md-2 col-sm-3'])[6]"));
		return element;
	}

	public static WebElement EditprofileZipcodeText(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@class='col-md-2 col-sm-3'])[7]"));
		return element;
	}

	public static WebElement EditprofileCountryText(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@class='col-md-2 col-sm-3'])[8]"));
		return element;
	}

	public static WebElement EditProfileFirstNameTextField(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@class='col-md-10 col-sm-9'])[1]"));
		return element;
	}

	public static WebElement LastnameTextfield(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@class='col-md-10 col-sm-9'])[2]"));
		return element;
	}

	public static WebElement AddressTextField(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@class='col-md-10 col-sm-9'])[3]"));
		return element;
	}

	public static WebElement PhoneNumbertextField(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@class='col-md-10 col-sm-9'])[4]"));
		return element;
	}

	public static WebElement CityTextField(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@class='col-md-10 col-sm-9'])[5]"));
		return element;
	}

	public static WebElement StateDropDown(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@class='col-md-10 col-sm-9'])[6]"));
		return element;
	}

	public static WebElement ZipCodetextField(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@class='col-md-10 col-sm-9'])[7]"));
		return element;
	}
	public static WebElement ZipCodeError(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[text()='Not a valid zip code']"));
		return element;
	}

	public static WebElement CountryDropDown(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@class='col-md-10 col-sm-9'])[8]"));
		return element;
	}

	public static WebElement EditprofilePageBacklink(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@class='black-txt']"));
		return element;
	}

	public static WebElement MannageSocialProfileHeading(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@class='manage_social col-sm-5 col-xs-12']/h2"));
		return element;
	}

	public static WebElement EditProfile_FaceBookIcon(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@class='manage_social col-sm-5 col-xs-12']/div/div/ul/li/div/div/img)[1]"));
		return element;
	}

	public static WebElement EditProfile_gamailIcon(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@class='manage_social col-sm-5 col-xs-12']/div/div/ul/li/div/div/img)[3]"));
		return element;
	}

	public static WebElement EditProfileTwittericon(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@class='manage_social col-sm-5 col-xs-12']/div/div/ul/li/div/div/img)[5]"));
		return element;
	}

	public static WebElement DisconnectedOptionWithFB(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@class='gig-edit-connections-information-details'])[1]"));
		return element;
	}

	public static WebElement DisconnectedOptionWithGmail(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@class='gig-edit-connections-information-details'])[2]"));
		return element;
	}
	public static WebElement DisconnectedOptionWithTwitter(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@class='gig-edit-connections-information-details'])[3]"));
		return element;
	}
	public static WebElement EditprofilepageSaveButton(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@class='btn btn-default col-xs-12']"));
		return element;
	}
	public static WebElement ConnectOptionwWithfacebook(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@class='gig-edit-connections-social-provider']/a)[1]"));
		return element;
	}
	public static WebElement ConnectOptionWithgooglePlush(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@class='gig-edit-connections-social-provider']/a)[2]"));
		return element;
	}
	public static WebElement ConnectOptionWithTwitter(WebDriver driver) {
		element = driver.findElement(By.xpath(".(.//*[@class='gig-edit-connections-social-provider']/a)[3]"));
		return element;
	}
	public static WebElement CloseWindowOption(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='btnClose']"));
		return element;
	}
	
	
	public static WebElement FaceBoookuserName(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@class='inputtext _55r1 inputtext inputtext'])[1]"));
		return element;
	}
	public static WebElement FacebookPasswordField(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@class='inputtext _55r1 inputtext inputtext'])[2]"));
		return element;
	}
	public static WebElement FacebookLoginButton(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@class='uiButton uiButtonConfirm uiButtonLarge']"));
		return element;
	}
	public static WebElement GmailUserName(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='Email']"));
		return element;
	}
	public static WebElement gmailNexButton(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='next']"));
		return element;
	}
	
	public static WebElement gmailPassword(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='Passwd']"));
		return element;
	}

	public static WebElement gmailSignIn(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='signIn']"));
		return element;
	}
	public static WebElement TwitterUserName(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='username_or_email']"));
		return element;
	}
	
	public static WebElement TwitterPassword(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='password']"));
		return element;
	}
	public static WebElement TwitterAllow(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='allow']"));
		return element;
	}
	public static WebElement ConfirmationMessageForSaved(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[text()='Successfully Updated your Profile']"));
		return element;
	}
	
	}
	

	



