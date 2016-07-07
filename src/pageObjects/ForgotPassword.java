package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword extends BaseClass {

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
						.xpath(".//*[@id='p_lt_WebPartZone5_ZonePlaceHolder_pageplaceholder_p_lt_WebPartZone1_ZoneForgotPassword_ShopNZipForgotPassword_pnlPasswdRetrieval']/div[1]/div/div/div/div/div/p"));
		return element;
	}

	public static WebElement forgotPasswordEmailAddressTextBox(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@class='forgot-pwd-main']/div/div[1]"));
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
				.xpath(".//*[@class='forgot-pwd-main']/div/div[2]"));
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
	

}
