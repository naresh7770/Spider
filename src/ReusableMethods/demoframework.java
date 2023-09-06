package ReusableMethods;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class demoframework {
	public  static WebDriver driver;
	public Methods m1;
	public Random r=new Random();
	@BeforeSuite
	public void jdbcconnet()
	{
		Reporter.log("database connected",true);
	}
	@BeforeTest
	public void Efeatures()
	{
		Reporter.log("extra features connected",true);
	}
	@BeforeClass
	public void openApp() throws Throwable
	{
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		m1=new Methods();
		String data=m1.property("url");
		driver.get(data);
	}
	@BeforeMethod
	public void login()
	{
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.TAB,Keys.ENTER);
	}
//	@Test(priority = 0)
//	public void tc1() throws Throwable
//	{
//		String s=m1.property("un");
//		driver.findElement(By.id("taskSearchControl_field")).sendKeys(s);
//	}
//	@Test(priority = 1)
//	public void tc2() throws Throwable
//	{
//		String s=m1.property("pw");
//		driver.findElement(By.id("taskSearchControl_field")).sendKeys(s);
//	}
//	@Test(priority = 2)
//	public void tc3()
//	{
//		driver.findElement(By.id("taskSearchControl_field")).sendKeys("hello");
//	}
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.id("logoutLink")).click();
	}
	@AfterClass
	public void closeApp()
	{
		driver.close();
	}
	@AfterTest 
	public void DisEfeatures()
	{
		Reporter.log("extra features disconnected",true);
	}
	@AfterSuite
	public void jdbcdisconnect()
	{
		Reporter.log("database disconnected",true);
	}
}
