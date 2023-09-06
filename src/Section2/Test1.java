package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Kandagatla Naresh\\eclipse-workspace\\Automation\\src");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.id("APjFqb")).sendKeys("automation",Keys.ENTER);
		driver.findElement(By.id("APjFqb")).sendKeys("automation",Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
		
	}

}
