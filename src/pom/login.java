package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
public static void main(String[] args) {
	

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/login.do");
	//driver.navigate().to("https://demo.actitime.com/login.do");
	
	ActiLoginAddress al=new ActiLoginAddress(driver);
	al.getUn().sendKeys("mama");
	driver.navigate().refresh();
	al.getUn().sendKeys("Hello");
}
}