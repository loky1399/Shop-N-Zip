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
		element = driver.findElement(By.xpath("(.//*[@class='form-group']/div)[1]"));
		return element;
	}

	public static WebElement EnterANewPasswordtextBox(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@class='form-group']/div)[2]"));
		return element;
	}public static WebElement RetypePasswordtextfield(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@class='form-group']/div)[4]"));
		return element;
	}
	public static WebElement ThisFieldIsRewuiredError(WebDriver driver) {
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
		element = driver.findElement(By.xpath(".//*[@class='form-group']"));
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
		element = driver.findElement(By.xpath(".//*[@class='col-md-3 col-sm-5 tab_form']"));
		return element;
	}
	
	


}
