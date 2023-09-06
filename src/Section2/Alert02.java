package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert02 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Kandagatla Naresh\\eclipse-workspace\\Automation\\src");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.TAB,Keys.ENTER);
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.className("img")).click();
		driver.findElement(By.xpath("//div[text()='Delete']")).click();
		Thread.sleep(3000);
	   String s= driver.findElement(By.xpath("//div[@id='taskListBlock']/following-sibling::div/div/div/div/div[2]")).getText();
	  System.out.println(s);
	
}
}
