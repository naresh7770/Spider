package Section2;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment21 {
public static void main(String[] args) throws Throwable {
	
	    Random r= new Random();
	    int i=r.nextInt();
	    String data="ABC"+i;
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Kandagatla Naresh\\eclipse-workspace\\Automation\\src");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.TAB,Keys.ENTER);
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		driver.findElement(By.cssSelector("input[class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys(data,Keys.TAB,"Description");
		driver.findElement(By.xpath("(//div[text()='- Select Customer -'])[1]")).click();
		 WebElement ele=driver.findElement(By.xpath("//div[text()='Big Bang Company']"));
		 Actions act=new Actions(driver);
		 act.moveToElement(ele).perform();
		 act.doubleClick(ele).perform();
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		driver.findElement(By.id("logoutLink")).click();
}		
}
