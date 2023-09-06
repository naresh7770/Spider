package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame01 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Kandagatla Naresh\\eclipse-workspace\\Automation\\src");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
		driver.findElement(By.xpath("//a[text()='Frames']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
        String ele =driver.findElement(By.xpath("//h2[text()='Interface WebDriver']")).getText();
        System.out.println(ele);
       
	
		
		
		
	}
}
