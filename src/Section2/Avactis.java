package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Avactis {
public static void main(String[] args) throws Throwable {
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Kandagatla Naresh\\eclipse-workspace\\Automation\\src");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
	driver.get("http://localhost/avactis.4.6.Next/avactis-system/admin/index.php");
	driver.findElement(By.name("AdminEmail")).sendKeys("nareshkandagatla777@gmail.com",Keys.TAB,"ADMIN@123");
	driver.findElement(By.id("SignInButton1")).click();
	driver.findElement(By.xpath("//span[text()='Catalog']")).click();
	driver.findElement(By.xpath("//span[text()='Manage Products']")).click();
	driver.findElement(By.xpath("//div[text()='Add Product']")).click();
	driver.switchTo().frame(0);
	// WebElement ele= driver.findElement(By.xpath("//td[text()='Key Product Details']/../../../../..//following-sibling::tr/td[3]/select"));
	WebElement ele= driver.findElement(By.id("ProductTypeSelect"));
	Actions act=new Actions(driver);
    act.moveToElement(ele).click().perform();
    Thread.sleep(3000);
    ele.sendKeys("abc",Keys.TAB,"123",Keys.TAB);
//	Select a=new Select(ele);
//	a.selectByVisibleText("DVD");
//	driver.findElement(By.id("Name")).sendKeys("ABCD",Keys.TAB,"1200");
//Thread.sleep(3000);
//	driver.findElement(By.id("SaveButton2")).click();
}
}
