package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChangePassword {
	public static WebElement element = null;

	public static WebElement EditProfile_ChangePasswordLink(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[text()='Change Password']"));
		return element;
	}
	public static WebElement CahngePasswordHeading(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[text()='Change Password']"));
		return element;
	}
	public static WebElement CurrentPasswordTextBox(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[contains(@id,'txtExistingPassword')]"));
		//element = driver.findElement(By.xpath(".//*[@class='PasswordPanel']"));
		return element;
	}

	public static WebElement EnterANewPasswordtextBox(WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='txtPassword']"));
		//element = driver.findElement(By.xpath("(.//*[@class='form-group']/div)[2]"));
		return element;
	}public static WebElement RetypePasswordtextfield(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[contains(@name,'txtPassword2')]"));
		return element;
	}
	public static WebElement ThisFieldIsRewuiredError(WebDriver driver) {
		//element = driver.findElement(By.xpath("//div[@class='formErrorContent firepath-matching-node']"));
		element = driver.findElement(By.xpath(".//*[text()=' This field is required']"));
		return element;
	}
	public static WebElement WrongPassWordError(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[text()='Password must be 6 chars with atleast 1 special char']"));
		return element;
	}
	public static WebElement FieldDoNotMatchError(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@class='formErrorContent']"));
		return element;
	}
	public static WebElement ChangePaaswordSubmiteButton(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='btnOk']"));
		return element;
	}
	public static WebElement ChangePassWordBackButton(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='Back123']"));
		return element;
	}
	public static WebElement ConfirmationMessageForChangePassword(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[text()='The changes were saved.']"));
		return element;
	}
	public static WebElement ChangePasswordSection(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='p_lt_WebPartZone6_ZonePlaceHolder_pageplaceholder_p_lt_ctl00_SnzMyProfile_pnlChangepwd']/div"));
		return element;
	}
	public static WebElement currentPasswordRong(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[text()='Your current password is incorrect.']"));
		return element;
	}
	public static WebElement popupClosebutton(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@class='close close-sign']"));
		return element;
	}
	
	public static WebElement popupMyItemsLink(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@class='modal-footer']/input"));
		return element;
	}
	
	


}
