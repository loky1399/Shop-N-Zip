package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import stepDefinitions.Hooks;

public class HeaderLinks {
	
	public static WebDriver driver=Hooks.driver;
	public static WebElement element = null;

	public static WebElement howItWorks_Menulink() {
		element = driver.findElement(By.xpath(".//*[@id='navbar']/ul/li[1]/a"));
		return element;

	}

	public static WebElement shopNow_Menulink() {
		element = driver.findElement(By.xpath(".//*[@id='navbar']/ul/li[2]/a"));
		return element;
	}

	public static WebElement AboutUs_Menulink() {
		element = driver.findElement(By.xpath(".//*[@id='navbar']/ul/li[3]/a"));
		return element;
	}

	public static WebElement FAQ_Menulink() {
		element = driver.findElement(By.xpath(".//*[@id='navbar']/ul/li[4]/a"));
		return element;
	}

	public static WebElement SignIn_Menulink() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='p_lt_WebPartZone3_ZoneNavBar_lbSignIn_btnElem_hyperLink']"));
		return element;
	}

	public static WebElement signUp_Menulink() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='p_lt_WebPartZone3_ZoneNavBar_lbSignUp_btnElem_hyperLink']"));
		return element;

	}

	public static WebElement faceBook_Menulink() {
		element = driver.findElement(By
				.xpath(".//*[@id='navbar']/ul/li[7]/ul/li[1]/a/img"));
		return element;

	}

	public static WebElement twitter_Menulink() {
		element = driver.findElement(By
				.xpath(".//*[@id='navbar']/ul/li[7]/ul/li[2]/a/img"));
		return element;

	}

	public static WebElement countryDropDown_Menulink() {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/div[5]/div[2]/nav/div/div[3]/div/a"));
		return element;

	}

	public static WebElement shopNzipLogo() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='p_lt_WebPartZone2_ZoneToggleButton&Logo_eiInnerLogo_ucEditableImage_imgImage']"));
		return element;

	}

	public static WebElement userNameDropdown() {
		element = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
		return element;

	}

	public static WebElement userNameDropdown_MyItems() {
		element = driver.findElement(By.xpath("//a[text()='My Items']"));
		return element;

	}

	public static WebElement userNameDropdown_MyAccount() {
		element = driver.findElement(By.xpath("//a[text()='My Account']"));
		return element;

	}

	public static WebElement userNameDropdown_TrackMyPackage() {
		element = driver.findElement(By
				.xpath("//a[text()='Track My Packages']"));
		return element;

	}

	public static WebElement userNameDropdown_MyProfile() {
		element = driver.findElement(By.xpath("//a[text()='My Profile']"));
		return element;

	}

	public static WebElement userNameDropdown_Logout() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='p_lt_WebPartZone3_ZoneNavBar_sobLogout_btnSignOut']"));
		return element;

	}

}