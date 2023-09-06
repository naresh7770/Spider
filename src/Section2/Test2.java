package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Kandagatla Naresh\\eclipse-workspace\\Automation\\src");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String ele=driver.findElement(By.xpath("//span[text()='Apple iPhone 12 (128GB) - Purple']")).getText();
	    String ele1=driver.findElement(By.xpath("//span[text()='Apple iPhone 12 (128GB) - Purple']/../../..//following-sibling::div[2]//div//div//div//div//a//span//span//span[2]")).getText();
	    
	    System.out.println(ele);
	    System.out.println(ele1);
	}

}
