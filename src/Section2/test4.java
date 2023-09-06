package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Kandagatla Naresh\\eclipse-workspace\\Automation\\src");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	    WebElement ele= driver.findElement(By.name("username"));
	    ele.click();
	    ele.sendKeys("Admin",Keys.TAB,"admin123");
	    driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	    driver.findElement(By.xpath("//span[text()='PIM']")).click();
        WebElement ele1=  driver.findElement(By.cssSelector("[placeholder='Type for hints...']"));
        ele1.click();
      ele1.sendKeys("Naresh",Keys.TAB,"1234",Keys.TAB,Keys.DOWN,Keys.DOWN,Keys.TAB,Keys.DOWN,Keys.DOWN,Keys.TAB,"KL",Keys.TAB,Keys.DOWN,Keys.DOWN,Keys.TAB,Keys.DOWN,Keys.DOWN,Keys.ENTER);
	    
	    
		
		
		
	}
	
}
