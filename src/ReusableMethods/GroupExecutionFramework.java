package ReusableMethods;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class GroupExecutionFramework {

	public WebDriver driver;
	public Methods m1;
	public Random r=new Random();
	
	@BeforeSuite(alwaysRun = true)
	public void jdbcconnet()
	{
		Reporter.log("database connected",true);
	}
	@BeforeTest(alwaysRun = true)
	public void Efeatures()
	{
		Reporter.log("extra features connected",true);
	}
	@Parameters(value="browser")
	@BeforeClass(alwaysRun = true)
	public String openApp(String s) throws Throwable
	{
		if(s.equals("chrome"))
		{
	    driver=new ChromeDriver();
		}
		if(s.equals("edge"))
		{
			driver=new EdgeDriver();
		}
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		m1=new Methods();
		String data=m1.property("url");
		driver.get(data);
		return s;
	}
	@BeforeMethod(alwaysRun = true)
	public void login()
	{
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.TAB,Keys.ENTER);
	}
	@AfterMethod(alwaysRun = true)
	public void logout()
	{
		driver.findElement(By.id("logoutLink")).click();
	}
	@AfterClass(alwaysRun = true)
	public void closeApp()
	{
		driver.close();
	}
	@AfterTest (alwaysRun = true)
	public void DisEfeatures()
	{
		Reporter.log("extra features disconnected",true);
	}
	@AfterSuite(alwaysRun = true)
	public void jdbcdisconnect()
	{
		Reporter.log("database disconnected",true);
	}
}
