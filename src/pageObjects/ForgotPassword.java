package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword extends BaseClass {
	public static BaseClass bc = BaseClass.getInstance();
	public static WebDriver driver = bc.driver;
	public static WebElement element = null;
	
	public static WebElement forgotPasswordSection() {
		element = driver.findElement(By.xpath(".//*[@class='forgot-pwd-main']"));
		return element;
	}
	public static WebElement forgotPasswordHeading() {
		element = driver.findElement(By.xpath(".//*[@class='forgot-pwd-main']/div[1]"));
		return element;
	}
	public static WebElement forgotPasswordDescription() {
		element = driver.findElement(By.xpath(".//*[@id='p_lt_WebPartZone5_ZonePlaceHolder_pageplaceholder_p_lt_WebPartZone1_ZoneForgotPassword_ShopNZipForgotPassword_pnlPasswdRetrieval']/div[1]/div/div/div/div/div/p"));
		return element;
	}
	public static WebElement forgotPasswordEmailAddressTextBox() {
		element = driver.findElement(By.xpath(".//*[@class='forgot-pwd-main']/div/div[1]"));
		return element;
	}
	public static WebElement forgotPassResetPasswordButton() {
		element = driver.findElement(By.xpath(".//*[@class='forgot-pwd-main']/div/div[2]"));
		return element;
	}
	


}
