package Section3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Validate {

	@Test
	public void m1() throws Throwable
	{
		
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Kandagatla Naresh\\eclipse-workspace\\Automation\\src");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.TAB,Keys.ENTER);
		Thread.sleep(7000);  
		String s=driver.getTitle();
	

	    Reporter.log("start",true);
		String actdata=s;
		String expdata="actiTIME -  Enter Time-Track";
		Assert.assertEquals(actdata,expdata);
		Reporter.log("main ends",true);
	}
}
