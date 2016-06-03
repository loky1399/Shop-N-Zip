package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutUs extends BaseClass {
	public static BaseClass bc = BaseClass.getInstance();
	public static WebDriver driver = bc.driver;
	public static WebElement element = null;

	public static WebElement aboutus_Menulink() {
		element = driver.findElement(By.xpath(".//*[@id='navbar']/ul/li[3]/a"));
		return element;
	}

	public static WebElement carousel_bannerimage() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='p_lt_WebPartZone5_ZonePlaceHolder_pageplaceholder_p_lt_WebPartZone1_ZoneBannerImage_eiSnZAboutUsHeaderImage_ucEditableImage_imgImage']"));
		return element;
	}

	public static WebElement aboutUs_Title() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section/div/div/div[1]/div/h2"));
		return element;
	}

	public static WebElement signUpOption() {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section/div/div/div/div/div[1]/a"));
		return element;
	}

	public static WebElement signInOption() {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section/div/div/div/div/div[1]/p/a"));
		return element;
	}

	public static WebElement aboutUs_description() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section/div/div/div[1]/div/p[2]"));
		return element;
	}

	public static WebElement adslot_squire() {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/div[6]/section/div/div/div[2]"));
		return element;
	}

	public static WebElement adslot_rectangular() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section/div/div/div/div/div[2]/a/img"));
		return element;
	}

}
