package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws Throwable {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Kandagatla Naresh\\eclipse-workspace\\Automation\\src");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement ele=driver.findElement(By.xpath("//button[text()='✕']"));
		ele.click();
		
        driver.findElement(By.name("q")).sendKeys("iphone");
        driver.findElement(By.className("L0Z3Pu")).click();
	
	 
	     
//	    WebElement ele2	=driver.findElement(By.className("_3FdLqY")); 
//		Actions act=new Actions(driver);
//		act.dragAndDropBy(ele2, 50, 0).perform();
//		
//		Thread.sleep(3000);
//		    
//		WebElement ele3=driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[2]"));
//		Actions act1=new Actions(driver);
//		act1.dragAndDropBy(ele3, -50, 0).perform();

	}
	}