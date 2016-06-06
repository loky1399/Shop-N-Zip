package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopNow extends BaseClass {
	public static BaseClass bc = BaseClass.getInstance();
	public static WebDriver driver = bc.driver;
	public static WebElement element = null;

	public static WebElement shopNow_Menulink() {
		element = driver.findElement(By.xpath(".//*[@id='navbar']/ul/li[2]/a"));
		return element;
	}

	public static WebElement shopNow_Heading() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[1]/div/div/div/div[1]/h2"));
		return element;
	}

	public static WebElement shopNow_caption() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[1]/div/div/div/div[1]/p"));
		return element;
	}

	public static WebElement tieup3rdParty_logoSection() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[1]/div/div/div/div[2]/div/div/ul"));
		return element;
	}

	public static WebElement tieup3rdParty_logos() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[1]/div/div/div/div[2]/div/div/ul[1]/li"));
		return element;
	}

	public static WebElement tieup3rdParty_1stlogo() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[1]/div/div/div/div[2]/div/div/ul[1]/li[1]"));
		return element;
	}

	public static WebElement tieup3rdParty_2ndlogo() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[1]/div/div/div/div[2]/div/div/ul[1]/li[2]"));
		return element;
	}

	public static WebElement tieup3rdParty_3rdlogo() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[1]/div/div/div/div[2]/div/div/ul[1]/li[3]"));
		return element;
	}

	public static WebElement tieup3rdParty_4thlogo() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[1]/div/div/div/div[2]/div/div/ul[1]/li[4]"));
		return element;
	}

	public static WebElement tieup3rdParty_5thlogos() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[1]/div/div/div/div[2]/div/div/ul[1]/li[5]"));
		return element;
	}

	public static WebElement tieup3rdParty_6thlogos() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[1]/div/div/div/div[2]/div/div/ul[1]/li[6]"));
		return element;
	}

	public static WebElement tieup3rdParty_7thlogos() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[1]/div/div/div/div[2]/div/div/ul[1]/li[7]"));
		return element;
	}

	public static WebElement tieup3rdParty_8thlogos() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[1]/div/div/div/div[2]/div/div/ul[1]/li[8]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection() {
		element = driver.findElement(By
				.xpath(".//*[@class='col-md-8 col-sm-8']"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_1stlink() {
		element = driver.findElement(By
				.xpath(".//*[@class='col-md-8 col-sm-8']/div[1]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_1stlink_image() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[1]/div/div[1]/img"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_1stlink_title() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[1]/div/div[2]/p/a"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_1stlink_publishedDate() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[1]/div/div[2]/ul/li[1]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_1stlink_category() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[1]/div/div[2]/ul/li[3]/a"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_2ndlink() {
		element = driver.findElement(By
				.xpath(".//*[@class='col-md-8 col-sm-8']/div[2]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_2ndlink_image() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[2]/div/div[1]/img"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_2ndlink_title() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/p/a"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_2ndtlink_publishedDate() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/ul/li[1]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_2ndlink_category() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/ul/li[3]/a"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_3rdlink() {
		element = driver.findElement(By
				.xpath(".//*[@class='col-md-8 col-sm-8']/div[3]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_3rdlink_image() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[2]/div/div[1]/img"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_3rdlink_title() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/p/a"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_3rdlink_publishedDate() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/ul/li[1]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_3rdlink_category() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/ul/li[3]/a"));
		return element;
	}
	public static WebElement tieup3rdParty_Vertical_linkSection_4thlink() {
		element = driver.findElement(By
				.xpath(".//*[@class='col-md-8 col-sm-8']/div[4]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_4thlink_image() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[4]/div/div[1]/img"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_4thlink_title() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[4]/div/div[2]/p/a"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_4thlink_publishedDate() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[4]/div/div[2]/ul/li[1]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_4thlink_category() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[4]/div/div[2]/ul/li[3]/a"));
		return element;
	}
	public static WebElement tieup3rdParty_Vertical_linkSection_5thlink() {
		element = driver.findElement(By
				.xpath(".//*[@class='col-md-8 col-sm-8']/div[5]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_5thlink_image() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[5]/div/div[1]/img"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_5thlink_title() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[5]/div/div[2]/p/a"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_5thlink_publishedDate() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[5]/div/div[2]/ul/li[1]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_5thlink_category() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[5]/div/div[2]/ul/li[3]/a"));
		return element;
	}
	public static WebElement tieup3rdParty_Vertical_linkSection_6thlink() {
		element = driver.findElement(By
				.xpath(".//*[@class='col-md-8 col-sm-8']/div[6]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_6thlink_image() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[6]/div/div[1]/img"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_6thlink_title() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[6]/div/div[2]/p/a"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_6thlink_publishedDate() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[6]/div/div[2]/ul/li[1]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_6thlink_category() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[6]/div/div[2]/ul/li[3]/a"));
		return element;
	}
	public static WebElement tieup3rdParty_Vertical_linkSection_7thlink() {
		element = driver.findElement(By
				.xpath(".//*[@class='col-md-8 col-sm-8']/div[7]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_7thlink_image() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[7]/div/div[1]/img"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_7thlink_title() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[7]/div/div[2]/p"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_7thlink_publishedDate() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[7]/div/div[2]/ul/li[1]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_7thlink_category() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[7]/div/div[2]/ul/li[3]/a"));
		return element;
	}
	public static WebElement tieup3rdParty_Vertical_linkSection_8thlink() {
		element = driver.findElement(By
				.xpath(".//*[@class='col-md-8 col-sm-8']/div[8]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_8thlink_image() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[8]/div/div[1]/img"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_8thlink_title() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[8]/div/div[2]/p/a"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_8thlink_publishedDate() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[8]/div/div[2]/ul/li[1]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_8thlink_category() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[8]/div/div[2]/ul/li[3]/a"));
		return element;
	}
	public static WebElement note() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section/div[1]/div/div/div[1]/div[4]/p"));
		return element;
	}
	public static WebElement signUpOption() {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section/div[2]/div/div/div/div[1]/a"));
		return element;
	}

	public static WebElement signInOption() {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section/div[2]/div/div/div/div[1]/p/a"));
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
