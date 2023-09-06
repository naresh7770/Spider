package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse1 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Kandagatla Naresh\\eclipse-workspace\\Automation\\src");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement ele=driver.findElement(By.id("gb_q"));
		Actions act=new Actions(driver);
		
		
	}

}
