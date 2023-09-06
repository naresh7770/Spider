package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {
	public static void main(String[] args) throws Throwable {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Kandagatla Naresh\\eclipse-workspace\\Automation\\src");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement ele=driver.findElement(By.xpath("//button[text()='✕']"));
		ele.click();
	WebElement ele1=driver.findElement(By.xpath("//div[text()='Mobiles']/../../following-sibling::div[2]/a/div[2]/div/div"));
	Actions act=new Actions(driver);
	act.moveToElement(ele1).perform();
	//Thread.sleep(3000);
	WebElement ele2=driver.findElement(By.xpath("//a[text()='Gaming']"));
	act.moveToElement(ele2).perform();
	//Thread.sleep(3000);
	WebElement ele3=driver.findElement(By.xpath("//a[text()='Games']"));
	act.moveToElement(ele3).click().perform();

}
}
