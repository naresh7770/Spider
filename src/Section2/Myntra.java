package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Kandagatla Naresh\\eclipse-workspace\\Automation\\src");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.className("desktop-searchBar")).sendKeys("iphone");
		driver.findElement(By.className("desktop-submit")).click();

	}

}
