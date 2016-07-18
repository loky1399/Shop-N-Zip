package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {

	public static WebElement element = null;

	public static WebElement forgotPasswordSection(WebDriver driver) {
		element = driver
				.findElement(By.xpath(".//*[@class='forgot-pwd-main']"));
		return element;
	}

	public static WebElement forgotPasswordHeading(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@class='forgot-pwd-main']/div[1]"));
		return element;
	}

	public static WebElement forgotPasswordDescription(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@class='forgot-pwd-main']/p"));
		return element;
	}

	public static WebElement forgotPasswordEmailAddressTextBox(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@class='forgot-pwd-main']/div/div[1]/input"));
		return element;
	}
	public static WebElement forgotPasswod_EnterARegisteredEmaildErrorMessage(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[text()='Please enter a registered e-mail address']"));
		return element;
	}
	public static WebElement forgotPasswod_EnterAValidEmailIdEroorMessage(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[text()=' Invalid email address']"));
		return element;
	}

	public static WebElement forgotPasswod_ConfirmationMessage(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[text()='We have sent a link to reset your password to your registered e-mail address.']"));
		return element;
	}


	public static WebElement forgotPassResetPasswordButton(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@class='field']/input"));
		return element;
	}
	public static WebElement forgotPassword_enteryournewpasswordheading(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@class='pull-left']"));
		return element;
	}
	public static WebElement forgotPassd_resetPasswordfield(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='txtPassword']"));
		return element;
	}
	public static WebElement forgotPasswordReset_RetypePassword(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='txtRetypePassword']"));
		return element;
	}
	public static WebElement forgotPassword_savenewpassord(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@class='btn btn-default col-xs-12 btn-primary']"));
		return element;
	}
	public static WebElement forgotPasswordYourpasswordhasbeenresetHeading(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@class='thank_sec col-md-5 col-sm-6 col-xs-11']/h3"));
		return element;
	}
	public static WebElement forgotPasswordTosigninclickhere(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@class='thank_sec col-md-5 col-sm-6 col-xs-11']/p"));
		return element;
	}
	public static WebElement forgotPasswordTosigninclickhereLink(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@class='thank_sec col-md-5 col-sm-6 col-xs-11']/p/a"));
		return element;
	}
	public static WebElement forgotPasswordErrormessage_ThisFiledIsrequired(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[text()=' This field is required']"));
		return element;
	}
	
	public static WebElement saveNewPasswordbutton(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@class='btn btn-default col-xs-12 btn-primary']"));
		return element;
	}
	public static WebElement saveNewPasswordHeading(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@class='pull-left']"));
		return element;
	}
	public static WebElement gmailusername(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='Email']"));
		return element;
	}
	public static WebElement gmailNextButton(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='next']"));
		return element;
	}
	public static WebElement gmailPassword(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='Passwd']"));
		return element;
	}
	public static WebElement gmailsignin(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='signIn']"));
		return element;
	}
	public static WebElement gmailInbox(WebDriver driver) {
		element = driver.findElement(By
				.xpath("(.//*[@class='aio UKr6le'])[1]"));
		return element;
	}
	public static WebElement AdminMail(WebDriver driver) {
		element = driver.findElement(By
				.xpath("(.//*[@class='yP'])[1]"));
		return element;
	}
	public static WebElement ThisLinkOption(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id=':lw']/div[2]/p[1]/a"));
		return element;
	}
	
	

}
