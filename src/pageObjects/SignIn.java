package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn extends BaseClass {
	public static BaseClass bc = BaseClass.getInstance();
	public static WebDriver driver = bc.driver;
	public static WebElement element = null;
	{
		 HeaderLinks.SignIn_Menulink();
	
	}
	public static WebElement signIn_with_socialNWtitle() {
		element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/div/div/div/div/h3"));
		return element;
	}
	public static WebElement signIn_with_socialNW_FaceBooklink() {
		element = driver.findElement(By.xpath(".//*[@id='loginpanel_p0']/tbody/tr[1]/td/table/tbody/tr/td[1]/center/div/div/div"));
		return element;
	}
	public static WebElement signIn_with_socialNW_Twitterlink() {
		element = driver.findElement(By.xpath(".//*[@id='loginpanel_p0']/tbody/tr[1]/td/table/tbody/tr/td[2]/center/div/div/div"));
		return element;
	}
	public static WebElement signIn_with_socialNW_googlePluslink() {
		element = driver.findElement(By.xpath(".//*[@id='loginpanel_p0']/tbody/tr[1]/td/table/tbody/tr/td[3]/center/div/div/div"));
		return element;
	}

public static WebElement signIn_with_TFC_credentials_title() {
	element = driver.findElement(By.xpath(".//*[@id='pnlBody']/h3"));
	return element;
}
	public static WebElement signIn_with_TFC_credentials_EmailIdTextbox() {
		element = driver.findElement(By.xpath(".//*[@id='UserName']"));
		return element;
	
	}
	public static WebElement signIn_with_TFC_credentials_PassWordTextbox() {
		element = driver.findElement(By.xpath(".//*[@id='Password']"));
		return element;
	
	}
	public static WebElement signIn_with_TFC_credentials_SignInButton() {
		element = driver.findElement(By.xpath(".//*[@id='LoginButton']"));
		return element;
	
	}
	public static WebElement signIn_with_TFC_credentials_ForgotpasswordLink() {
		element = driver.findElement(By.xpath(".//*[@id='pnlBody']/a"));
		return element;
	
	}
	public static WebElement signIn_with_TFC_credentials_RemembermeCheckBox() {
		element = driver.findElement(By.xpath(".//*[@id='pnlBody']/div[1]/label/div"));
		return element;
	
	}
}

