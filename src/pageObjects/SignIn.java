package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {

	public static WebElement element = null;

	public static WebElement with_socialNWtitle(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/div[6]/div/div/div/div/h3"));
		return element;
	}

	public static WebElement with_socialNW_FaceBook(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='loginpanel_p0']/tbody/tr[1]/td/table/tbody/tr/td[1]/center/div/div/div"));
		return element;
	}

	public static WebElement with_socialNW_Twitter(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='loginpanel_p0']/tbody/tr[1]/td/table/tbody/tr/td[2]/center/div/div/div"));
		return element;
	}

	public static WebElement with_socialNW_googlePlus(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='loginpanel_p0']/tbody/tr[1]/td/table/tbody/tr/td[3]/center/div/div/div"));
		return element;
	}

	public static WebElement with_TFC_credentials_title(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='pnlBody']/h3"));
		return element;
	}

	public static WebElement with_TFC_credentials_EmailIdTextbox(
			WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='UserName']"));
		return element;

	}

	public static WebElement with_TFC_credentials_PassWordTextbox(
			WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='Password']"));
		return element;

	}

	public static WebElement with_TFC_credentials_SignInButton(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='LoginButton']"));
		return element;

	}

	public static WebElement with_TFC_credentials_ForgotpasswordLink(
			WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='pnlBody']/a"));
		return element;

	}

	public static WebElement checkBox_RememberMe(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='pnlBody']/div[1]/label/div"));
		return element;

	}

	public static WebElement welcomePopup_welcomeBackLableTitle(WebDriver driver) {
		element = driver.findElement(By
				.xpath("//h4[@class='modal-title text-center']"));
		return element;

	}

	public static WebElement welcomePopup_UserName(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='p_lt_WebPartZone5_ZonePlaceHolder_pageplaceholder_p_lt_WebPartZone11_ZoneRealSignUp_ShopNZipLoginPopUp_lblmodalfirstname']"));
		return element;

	}

	public static WebElement welcomePopup_yourShopNZipIDlableTitle(
			WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='myModal5']/div/div/div[2]/h5[1]"));
		return element;

	}

	public static WebElement welcomePopup_yourShopNZipID(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='myModal5']/div/div/div[2]/h5[1]/span"));
		return element;

	}

	public static WebElement welcomePopup_yourShopNZipAddressLableTitle(
			WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='myModal5']/div/div/div[2]/h5[2]"));
		return element;

	}

	public static WebElement welcomePopup_yourShopNZipAddress(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='p_lt_WebPartZone5_ZonePlaceHolder_pageplaceholder_p_lt_WebPartZone11_ZoneRealSignUp_ShopNZipLoginPopUp_lblmodaladdress']"));
		return element;

	}

	public static WebElement welcomePopup(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='modal-dialog']"));
		return element;

	}
	
	public static WebElement welcomePopup_closeButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@class='close close-sign']"));
		return element;

	}

	public static WebElement welcomePopup_MyItemsButton(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='p_lt_WebPartZone5_ZonePlaceHolder_pageplaceholder_p_lt_WebPartZone11_ZoneRealSignUp_ShopNZipLoginPopUp_btnMyItems']"));
		return element;
	}

	public static WebElement emailId_validation(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//div[@class='UserNameformError parentFormform formError']/div[1]"));
		return element;
	}

	public static WebElement password_validation(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//div[@class='PasswordformError parentFormform formError']/div[1]"));
		return element;
	}
}
