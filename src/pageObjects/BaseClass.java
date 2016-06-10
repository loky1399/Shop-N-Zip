package pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class BaseClass {

	public static BaseClass instance = null;
	public static WebDriver driver;
	public WebDriver Mozilla = null;
	public WebDriver Chrome = null;

	public WebDriver openFirefoxBrowser() {
		if (Mozilla == null) {
			driver = new FirefoxDriver();
			Mozilla = driver;
		} else if (Mozilla != null) {
			driver = Mozilla;
		}
		driver.manage().window().maximize();
		return driver;
	}

	public WebDriver openChromeBrowser() {
		if (Chrome == null) {
			driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver",
					"D:\\lib\\chromedriver.exe");
			Chrome = driver;
		} else if (Chrome != null) {
			driver = Chrome;
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static BaseClass getInstance() {
		if (instance == null) {
			instance = new BaseClass();
		}
		return instance;
	}
}
