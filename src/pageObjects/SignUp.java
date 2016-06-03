package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp extends BaseClass {
	public static BaseClass bc = BaseClass.getInstance();
	public static WebDriver driver = bc.driver;
	public static WebElement element = null;
	{
		 HeaderLinks.signUp_Menulink();
	
	}
	public static WebElement creatNewTFCaccountTitle() {
		element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[1]/h2"));
		return element;

	}	
	public static WebElement creatNewTFCaccount_Description() {
		element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[1]/p[1]"));
		return element;

	}
	public static WebElement allreadyhaveAccount_Description() {
		element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[1]/p[2]"));
		return element;

	}	
	public static WebElement signInButton_for_existAccount() {
		element = driver.findElement(By.xpath("..//*[@id='form']/div[6]/div/div/div/div/div[1]/div/p/a"));
		return element;

	}
	public static WebElement sigUp_with_socialNWtitle() {
		element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/div/div/div/div/h3"));
		return element;
	}
	public static WebElement signUp_with_socialNW_FaceBooklink() {
		element = driver.findElement(By.xpath(".//*[@id='loginpanel_p0']/tbody/tr[1]/td/table/tbody/tr/td[1]/center/div/div/div"));
		return element;
	}
	public static WebElement signUp_with_socialNW_Twitterlink() {
		element = driver.findElement(By.xpath(".//*[@id='loginpanel_p0']/tbody/tr[1]/td/table/tbody/tr/td[2]/center/div/div/div"));
		return element;
	}
	public static WebElement signUp_with_socialNW_googlePluslink() {
		element = driver.findElement(By.xpath(".//*[@id='loginpanel_p0']/tbody/tr[1]/td/table/tbody/tr/td[3]/center/div/div/div"));
		return element;
	}

public static WebElement orCreatNewTFCaccunt_title() {
	element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/h4"));
	return element;
}
public static WebElement NameTextBox() {
	element = driver.findElement(By.xpath(".//*[@id='txtFirstName']"));
	return element;
}
public static WebElement NameTextBoxRequiredSymbol() {
	element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[1]/sup"));
	return element;
}
public static WebElement currentCountryDropDown() {
	element = driver.findElement(By.xpath(".//*[@id='ddlCountry']"));
	return element;
}
public static WebElement currentCountryDropDownRequiredSymbol() {
	element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[2]/sup"));
	return element;
}
public static WebElement emailAddressTextBox() {
	element = driver.findElement(By.xpath(".//*[@id='txtEmail']"));
	return element;
}
public static WebElement emailAddressTextBoxRequiredSymbol() {
	element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[3]/sup"));
	return element;
}
public static WebElement phoneNumberTextBox() {
	element = driver.findElement(By.xpath(".//*[@id='txtPhone']"));
	return element;
}
public static WebElement phoneNumberTextBoxRequiredSymbol() {
	element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[4]/sup"));
	return element;
}
public static WebElement passWordTextBox() {
	element = driver.findElement(By.xpath(".//*[@id='passStrength']"));
	return element;
}
public static WebElement passWordTextBoxRequiredSymbol() {
	element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[5]/sup"));
	return element;
}
public static WebElement reTypePasswordTextBox() {
	element = driver.findElement(By.xpath(".//*[@id='RetypePassword']"));
	return element;
}
public static WebElement reTypePasswordRequiredSymbol() {
	element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[6]/sup"));
	return element;
}
public static WebElement zipcodeTextBox() {
	element = driver.findElement(By.xpath(".//*[@id='TxtZipCode']"));
	return element;
}
public static WebElement addressTextBox() {
	element = driver.findElement(By.xpath(".//*[@id='txtAddress']"));
	return element;
}
public static WebElement cityTextBox() {
	element = driver.findElement(By.xpath(".//*[@id='txtcity']"));
	return element;
}
public static WebElement stateDropDown() {
	element = driver.findElement(By.xpath(".//*[@id='txtState']"));
	return element;
}
public static WebElement registerNowButton() {
	element = driver.findElement(By.xpath(".//*[@id='btnOk']"));
	return element;
}
public static WebElement termsAndConditionLink() {
	element = driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div[2]/div[11]/label/a[1]/text()"));
	return element;
}
public static WebElement privacypolicyLink() {
	element = driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div[2]/div[11]/label/a[2]/text()"));
	return element;
}
public static WebElement tearmNconditionCheckBox() {
	element = driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div[2]/div[11]/label/div"));
	return element;
}
public static WebElement requiredsymbol() {
	element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/span"));
	return element;
}
public static WebElement alertMessageForNameTextfield() {
	element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[1]/div/div[1]"));
	return element;
}
public static WebElement alertMessageForCountryDropDown() {
	element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[2]/div/div[1]"));
	return element;
}
public static WebElement alertMessageForEmailAddresstextField() {
	element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[3]/div/div[1]"));
	return element;
}
public static WebElement alertMessageForPhoneNumbertextField() {
	element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[4]/div/div[1]"));
	return element;
}
public static WebElement alertMessageForPasswordtextField() {
	element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[5]/div/div[1]"));
	return element;
}
public static WebElement alertMessageForReTypePasswordtextField() {
	element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[6]/div/div[1]"));
	return element;
}
public static WebElement alertMessageForZipCodetextBox() {
	element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[9]/div/div/div[1]"));
	return element;
}
public static WebElement errorMessageForInvalidEmail() {
	element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[3]/div/div[1]"));
	return element;
}
public static WebElement errorMessageForInvalidPhoneNumber() {
	element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[4]/div/div[1]"));
	return element;
}
public static WebElement errorMessageForInvalidPassword() {
	element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[5]/div/div[1]"));
	return element;
}
public static WebElement errorMessageForInvalidRetypePassword() {
	element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[6]/div/div[1]"));
	return element;
}
public static WebElement errorMessageForInvalidZipcode() {
	element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/div/div/div/div/div[2]/div[3]/div/div[9]/div/div/div[1]"));
	return element;
}
public static WebElement errorMessageForloginwithSocilaSharing() {
	element = driver.findElement(By.xpath(".//*[@id='lblError']"));
	return element;
}



}
