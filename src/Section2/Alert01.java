package Section2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert01 {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Kandagatla Naresh\\eclipse-workspace\\Automation\\src");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.TAB,Keys.ENTER);
	driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
	driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
	driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
	driver.findElement(By.id("name")).sendKeys("abc");
	driver.findElement(By.cssSelector("input[type='button']")).click();
	Alert alt=driver.switchTo().alert();
	//alt.dismiss();
  //  alt.accept();
	String data=alt.getText();
	System.out.println(data);
	

}
}
