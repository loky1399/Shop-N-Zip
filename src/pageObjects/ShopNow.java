package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopNow {

	public static WebElement element = null;

	public static WebElement shopNow_Menulink(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='navbar']/ul/li[2]"));
		return element;
	}

	public static WebElement shopNow_Heading(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[1]/div/div/div/div[1]/h2"));
		return element;
	}

	public static WebElement shopNow_caption(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[1]/div/div/div/div[1]/p"));
		return element;
	}

	public static WebElement tieup3rdParty_logoSection(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[1]/div/div/div/div[2]/div/div/ul"));
		return element;
	}

	public static List<WebElement> tieup3rdParty_logos(WebDriver driver) {
		
		List<WebElement> logos= driver
		.findElements(By
				.xpath(".//*[@class='list_unstyle']/li/img"));
return logos;
	}

	public static WebElement tieup3rdParty_1stlogo(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[1]/div/div/div/div[2]/div/div/ul[1]/li[1]"));
		return element;
	}

	public static WebElement tieup3rdParty_2ndlogo(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[1]/div/div/div/div[2]/div/div/ul[1]/li[2]"));
		return element;
	}

	public static WebElement tieup3rdParty_3rdlogo(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[1]/div/div/div/div[2]/div/div/ul[1]/li[3]"));
		return element;
	}

	public static WebElement tieup3rdParty_4thlogo(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[1]/div/div/div/div[2]/div/div/ul[1]/li[4]"));
		return element;
	}

	public static WebElement tieup3rdParty_5thlogos(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[1]/div/div/div/div[2]/div/div/ul[1]/li[5]"));
		return element;
	}

	public static WebElement tieup3rdParty_6thlogos(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[1]/div/div/div/div[2]/div/div/ul[1]/li[6]"));
		return element;
	}

	public static WebElement tieup3rdParty_7thlogos(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[1]/div/div/div/div[2]/div/div/ul[1]/li[7]"));
		return element;
	}

	public static WebElement tieup3rdParty_8thlogos(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[1]/div/div/div/div[2]/div/div/ul[1]/li[8]"));
		return element;
	}

	public static  List<WebElement> tieup3rdParty_Vertical_linkSectionlogos(WebDriver driver) {
		 List<WebElement> verticle3rdpartylinks = driver.findElements(By
				.xpath(".//*[@class='col-sm-3 col-md-2']"));
		return verticle3rdpartylinks;
	}
	public static  List<WebElement> tieup3rdpartylinks(WebDriver driver) {
		 List<WebElement> tieuplinks = driver.findElements(By
				.xpath(".//*[@class='spnow_list_txt']/a"));
		return tieuplinks ;
	}
	public static WebElement tieup3rdParty_Vertical_linkSection_1stlink(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@class='col-md-8 col-sm-8']/div[1]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_1stlink_image(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[1]/div/div[1]/img"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_1stlink_title(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[1]/div/div[2]/p/a"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_1stlink_publishedDate(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[1]/div/div[2]/ul/li[1]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_1stlink_category(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[1]/div/div[2]/ul/li[3]/a"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_2ndlink(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@class='col-md-8 col-sm-8']/div[2]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_2ndlink_image(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[2]/div/div[1]/img"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_2ndlink_title(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/p/a"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_2ndtlink_publishedDate(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/ul/li[1]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_2ndlink_category(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/ul/li[3]/a"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_3rdlink(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@class='col-md-8 col-sm-8']/div[3]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_3rdlink_image(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[2]/div/div[1]/img"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_3rdlink_title(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/p/a"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_3rdlink_publishedDate(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/ul/li[1]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_3rdlink_category(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/ul/li[3]/a"));
		return element;
	}
	public static WebElement tieup3rdParty_Vertical_linkSection_4thlink(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@class='col-md-8 col-sm-8']/div[4]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_4thlink_image(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[4]/div/div[1]/img"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_4thlink_title(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[4]/div/div[2]/p/a"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_4thlink_publishedDate(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[4]/div/div[2]/ul/li[1]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_4thlink_category(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[4]/div/div[2]/ul/li[3]/a"));
		return element;
	}
	public static WebElement tieup3rdParty_Vertical_linkSection_5thlink(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@class='col-md-8 col-sm-8']/div[5]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_5thlink_image(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[5]/div/div[1]/img"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_5thlink_title(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[5]/div/div[2]/p/a"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_5thlink_publishedDate(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[5]/div/div[2]/ul/li[1]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_5thlink_category(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[5]/div/div[2]/ul/li[3]/a"));
		return element;
	}
	public static WebElement tieup3rdParty_Vertical_linkSection_6thlink(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@class='col-md-8 col-sm-8']/div[6]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_6thlink_image(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[6]/div/div[1]/img"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_6thlink_title(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[6]/div/div[2]/p/a"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_6thlink_publishedDate(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[6]/div/div[2]/ul/li[1]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_6thlink_category(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[6]/div/div[2]/ul/li[3]/a"));
		return element;
	}
	public static WebElement tieup3rdParty_Vertical_linkSection_7thlink(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@class='col-md-8 col-sm-8']/div[7]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_7thlink_image(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[7]/div/div[1]/img"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_7thlink_title(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[7]/div/div[2]/p"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_7thlink_publishedDate(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[7]/div/div[2]/ul/li[1]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_7thlink_category(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[7]/div/div[2]/ul/li[3]/a"));
		return element;
	}
	public static WebElement tieup3rdParty_Vertical_linkSection_8thlink(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@class='col-md-8 col-sm-8']/div[8]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_8thlink_image(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[8]/div/div[1]/img"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_8thlink_title(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[8]/div/div[2]/p/a"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_8thlink_publishedDate(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[8]/div/div[2]/ul/li[1]"));
		return element;
	}

	public static WebElement tieup3rdParty_Vertical_linkSection_8thlink_category(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section[2]/div[1]/div/div/div[1]/div[8]/div/div[2]/ul/li[3]/a"));
		return element;
	}
	public static WebElement note(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section/div[1]/div/div/div[1]/div[4]/p"));
		return element;
	}
	public static WebElement signUpOption(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section/div[2]/div/div/div/div[1]/a"));
		return element;
	}

	public static WebElement signInOption(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section/div[2]/div/div/div/div[1]/p/a"));
		return element;
	}
	public static WebElement adslot_squire(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@class='targetstyle img-responsive']"));
		return element;
	}

	public static WebElement adslot_rectangular(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@class='col-sm-12 text-center advertise_block']"));
		return element;
	}

}
