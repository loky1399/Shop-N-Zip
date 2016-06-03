package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Footer extends BaseClass {
	public static BaseClass bc = BaseClass.getInstance();
	public static WebDriver driver = bc.driver;
	public static WebElement element = null;
	
	public static WebElement footerSection() {
		element = driver.findElement(By.xpath(".//*[@id='form']/footer"));
		return element;

}
	public static WebElement footerSectiontShopnZipText() {
		element = driver.findElement(By.xpath(".//*[@id='p_lt_WebPartZone6_ZoneFooterLogoandStaticPages_eiFooterLogo_ucEditableImage_imgImage']"));
		return element;

}
	public static WebElement footerSectionText() {
		element = driver.findElement(By.xpath(".//*[@id='form']/footer/div/div/p[2]"));
		return element;

}
	public static WebElement footerSectionPoweredbyABS_CBNInternationalLink() {
		element = driver.findElement(By.xpath(".//*[@id='form']/footer/div/div/p[2]/a"));
		return element;

}
	public static WebElement footerTermsAndConditionlink() {
		element = driver.findElement(By.xpath(".//*[@id='form']/footer/div/div/ul/li[1]/a"));
		return element;

}
	public static WebElement footerContactUslink() {
		element = driver.findElement(By.xpath(".//*[@id='form']/footer/div/div/ul/li[2]/a"));
		return element;

}

}
