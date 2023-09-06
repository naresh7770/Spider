package Section2;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class naukri {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
		driver.get("https://www.naukri.com/");
		
	//	WebElement ele2	=driver.findElement(By.className("nI-gNb-menuItems__anchorDropdown"));
		WebElement ele2	=driver.findElement(By.xpath("//div[text()='Jobs']"));
		
		
		Actions act=new Actions(driver);
		act.moveToElement(ele2).perform();
		
		Thread.sleep(2000);
		
        act.moveByOffset(-130, 100).click().perform();
	}}