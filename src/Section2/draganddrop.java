package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Kandagatla Naresh\\eclipse-workspace\\Automation\\src");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider");
		driver.switchTo().frame(0);
		WebElement ele=driver.findElement(By.cssSelector("span[class='ui-slider-handle ui-corner-all ui-state-default']"));
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDropBy(ele, 100, 0).perform();
	}
	
}
