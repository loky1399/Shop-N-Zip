package modules;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StoreRanker {
	WebDriver driver;
	public int x = 0;

	@BeforeTest
	public void bt() {
		driver = new FirefoxDriver();
		driver.get("http://storeranker.raybiztech.net");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	void te() throws InterruptedException {
		driver.findElement(By.xpath("//a[@href='./dashboard']")).click();
		driver.findElement(By.xpath("//input[@name='user_username']"))
				.sendKeys("georgeadmin");
		driver.findElement(By.xpath("//input[@name='user_password']"))
				.sendKeys("1234");
		driver.findElement(By.xpath("//input[@id='login_submit']")).click();

		// Thread.sleep(10000);
		// driver.navigate().to("http://storeranker.raybiztech.net/dashboard/team/details/Y2xpag==/YWxs/YWxs/0/till_date/normal/ck/0/");
		driver.findElement(
				By.xpath("//a[@href='/dashboard/admin/account_edit/235/']"))
				.click();

		driver.findElement(By.xpath("//input[@value='Users']")).click();

		driver.findElement(
				By.xpath("//a[contains(@href,'/dashboard/admin/proxy_login/3044/')]"))
				.click();

		driver.findElement(By.xpath("//th[contains(.,' State 11 ')]")).click();

		driver.findElement(By.xpath("//th[contains(.,' Andhra Pradeshh ')]"))
				.click();

		driver.findElement(By.xpath("//b[contains(.,'Hyderabadd')]")).click();

		driver.findElement(By.xpath("//a[contains(.,'KFCC')]")).click();

		// org.openqa.selenium.support.ui.Select sel = new
		// org.openqa.selenium.support.ui.Select(driver.findElement(By.xpath("//select[@id='date_range']"));

		new Select(driver.findElement(By.xpath("//select[@id='date_range']")))
				.selectByValue("till_date");
		new Select(driver.findElement(By
				.xpath("//select[@id='ddl_departments']")))
				.selectByValue("all");
		Thread.sleep(1000);
		try {
			WebElement loadMore=driver.findElement(By.xpath(".//*[@id='note_container']/a"));
			while (loadMore.isDisplayed()) {
				loadMore.click();
				Thread.sleep(3000);
				WebElement loadMore1=driver.findElement(By.xpath(".//*[@id='note_container']/a"));
				loadMore=loadMore1;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		List<WebElement> Oissues = driver.findElements(By
				.xpath("//span[@class='open_issues']"));
//		List<String> count = new ArrayList<String>();

		for (WebElement oi : Oissues) {
			String[] temp = oi.getText().substring(8).split("/");
			x = Integer.parseInt(temp[0]) + x;

		}
		System.out.println(x);
	}
}
