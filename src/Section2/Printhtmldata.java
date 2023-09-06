package Section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printhtmldata {

	public static void main(String[] args) throws Throwable {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Kandagatla Naresh\\eclipse-workspace\\Automation\\src");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement ele=driver.findElement(By.xpath("//button[text()='✕']"));
		ele.click();
		
		driver.findElement(By.className("_3704LK")).sendKeys("iphone",Keys.ENTER);
		Thread.sleep(3000);
	    List<WebElement> a=driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone')]"));
	   int count=0;
	   for(WebElement b:a)
	   {
		   String c=b.getText();
		   System.out.println(c);
		   count++;
	   }	   
        System.out.println(count);
	}

}
