package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard {
	// public static WebElement element = null;

	public static WebElement activeTab(WebDriver driver) {
		return driver.findElement(By.xpath("//li[@class='col-lg-3 active']/a"));
	}
}
