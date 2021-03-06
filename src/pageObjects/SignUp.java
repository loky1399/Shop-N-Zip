package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignUp {

	public static WebElement element = null;

	public static WebElement creatNewTFCaccountTitle(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[1]/h2"));
		return element;

	}

	public static WebElement creatNewTFCaccount_Description(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[1]/p[1]"));
		return element;

	}

	public static WebElement allreadyhaveAccount_Description(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[1]/p[2]"));
		return element;

	}

	public static WebElement signInButton_for_existAccount(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("..//*[@id='form']/div[6]/div/div/div/div/div[1]/div/p/a"));
		return element;

	}

	public static WebElement signupForm(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]"));
		return element;
	}

	public static WebElement sigUp_with_socialNWtitle(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/div[6]/div/div/div/div/h3"));
		return element;
	}

	public static WebElement signUp_with_socialNW_FaceBooklink(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='loginpanel_p0']/tbody/tr[1]/td/table/tbody/tr/td[1]/center/div/div/div"));
		return element;
	}

	public static WebElement signUp_with_socialNW_Twitterlink(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='loginpanel_p0']/tbody/tr[1]/td/table/tbody/tr/td[2]/center/div/div/div"));
		return element;
	}

	public static WebElement signUp_with_socialNW_googlePluslink(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='loginpanel_p0']/tbody/tr[1]/td/table/tbody/tr/td[3]/center/div/div/div"));
		return element;
	}

	public static WebElement orCreatNewTFCaccunt_title(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/h4"));
		return element;
	}

	public static WebElement FirstNameTextBox(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='txtFirstName']"));
		return element;
	}

	public static WebElement LastNameTextBox(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@class='form-group'][2]/input"));
		return element;
	}

	public static WebElement LastNameTextBoxmandatory(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[2]/sup"));
		return element;
	}

	public static WebElement FirstNameTextBoxRequiredSymbol(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[1]/sup"));
		return element;
	}

	public static void currentCountryDropDown(WebDriver driver,int index) {
		List<WebElement>element = driver.findElements(By.xpath(".//*[@id='ddlCountry']"));
	Select sele=new Select(driver.findElement(By.xpath(".//*[@id='ddlCountry']")));
	sele.selectByIndex(index);
	}

	public static WebElement currentCountryDropDownRequiredSymbol(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[2]/sup"));
		return element;
	}

	public static WebElement emailAddressTextBox(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='txtEmail']"));
		return element;
	}

	public static WebElement emailAddressTextBoxRequiredSymbol(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[3]/sup"));
		return element;
	}

	public static WebElement phoneNumberTextBox(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='txtPhone']"));
		return element;
	}

	public static WebElement phoneNumberTextBoxRequiredSymbol(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[4]/sup"));
		return element;
	}

	public static WebElement passWordTextBox(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='passStrength']"));
		return element;
	}

	public static WebElement passWordTextBoxRequiredSymbol(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[5]/sup"));
		return element;
	}

	public static WebElement reTypePasswordTextBox(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='RetypePassword']"));
		return element;
	}

	public static WebElement reTypePasswordRequiredSymbol(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[6]/sup"));
		return element;
	}

	public static WebElement zipcodeTextBox(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='TxtZipCode']"));
		return element;
	}
	
	public static WebElement signUpSuccessMsg(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='verify_block col-sm-4']"));
		return element;
	}

	public static WebElement addressTextBox(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='txtAddress']"));
		return element;
	}

	public static WebElement cityTextBox(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='txtcity']"));
		return element;
	}

	public static void stateDropDown(WebDriver driver,int index) {
		element = driver.findElement(By.xpath(".//*[@id='ddlStates']"));
		new Select(element).selectByIndex(index);
	}

	public static WebElement registerNowButton(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='btnOk']"));
		return element;
	}

	public static WebElement termsAndConditionLink(WebDriver driver) {
		element = driver.findElement(By
				.xpath("//a[text()='Terms and Conditions']"));
		return element;
	}

	public static WebElement privacypolicyLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
		return element;
	}

	public static WebElement CheckBox(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//div[@class='control__indicator']"));
		return element;
	}

	public static WebElement requiredsymbol(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/span"));
		return element;
	}

	public static WebElement alertMessageForNameTextfield(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[1]/div/div[1]"));
		return element;
	}

	public static WebElement alertMessageForLastNameTextField(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[2]/div/div[1]"));
		return element;
	}
	
	public static WebElement alertMessageForCountryDropDown(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[3]/div/div[1]"));
		return element;
	}

	public static WebElement alertMessageForEmailAddresstextField(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[4]/div/div[1]"));
		return element;
	}

	public static WebElement alertMessageForPhoneNumbertextField(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[5]/div/div[1]"));
		return element;
	}

	public static WebElement alertMessageForPasswordtextField(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[6]/div/div[1]"));
		return element;
	}

	public static WebElement alertMessageForReTypePasswordtextField(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[7]/div/div[1]"));
		return element;
	}
	
	public static WebElement alertMessageForAddressTextField(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[8]/div/div[1]"));
		return element;
	}

	public static WebElement alertMessageForCityTextField(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[9]/div/div[1]"));
		return element;
	}
	
	public static WebElement alertMessageForSelectStateDropField(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[10]/div/div[1]"));
		return element;
	}
	public static WebElement alertMessageForZipCodetextBox(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[11]/div/div/div[1]"));
		return element;
	}
	
	public static WebElement alertMessageForCheckBox(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[13]/label/div[1]/div[1]"));
		return element;
	}

	public static WebElement errorMessageForInvalidEmail(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[4]/div/div[1]"));
		return element;
	}

	public static WebElement errorMessageForInvalidPhoneNumber(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[5]/div/div[1]"));
		return element;
	}

	public static WebElement errorMessageForInvalidPassword(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[6]/div/div[1]"));
		return element;
	}

	public static WebElement errorMessageForInvalidRetypePassword(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[7]/div/div[1]"));
		return element;
	}

	public static WebElement errorMessageForInvalidZipcode(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[9]/div/div/div[1]"));
		return element;
	}

	public static WebElement errorMessageForloginwithSocilaSharing(
			WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='lblError']"));
		return element;
	}

	public static WebElement faceBookEmailId(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='email']"));
		return element;
	}

	public static WebElement faceBookPassword(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='pass']"));
		return element;
	}

	public static WebElement faceBookLoginButton(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='u_0_2']"));
		return element;
	}

	public static WebElement faceBookGigiyamessage(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='dvMain']/center/table/tbody/tr/td/b[2]"));
		return element;
	}

	public static WebElement faceBookCloseWindowOption(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='btnClose']"));
		return element;
	}

	public static WebElement twitterUserNameTextBox(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@class='text']"));
		return element;
	}

	public static WebElement twitterPassWordTextField(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@class='password text']"));
		return element;
	}

	public static WebElement googleUserNameTextBox(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='Email']"));
		return element;
	}

	public static WebElement googleNextButton(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='next']"));
		return element;
	}

	public static WebElement googlePassWordTextField(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='Passwd']"));
		return element;
	}

	public static WebElement googleSignInButton(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='signIn']"));
		return element;
	}

	public static WebElement googleAllowAccessButton(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='submit_approve_access']"));
		return element;
	}
	public static WebElement twitterLoginButton(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='allow']"));
		return element;
	}

	public static WebElement twitterGigiaMessage(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='dvMain']/center/table/tbody/tr/td/b[2]"));
		return element;
	}

	public static WebElement twitterGigiyaCloseWindoOption(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='btnClose']"));
		return element;
	}
}
