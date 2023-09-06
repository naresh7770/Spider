package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Keyboardkeys {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Kandagatla Naresh\\eclipse-workspace\\Automation\\src");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/selenium/newtours/register.php");
		//driver.findElement(By.name("firstName")).sendKeys("naresh",Keys.TAB,"kandagatla",Keys.TAB,"9440340577",Keys.TAB,"@gmail.com",Keys.TAB,"Add",Keys.TAB,"city",Keys.TAB,"State",Keys.TAB,"688",Keys.TAB,Keys.TAB,"hjasd",Keys.TAB,"asd",Keys.TAB,"asd",Keys.TAB);
     WebElement ele=  driver.findElement(By.name("country"));
     ele.click();
     Select s=new Select(ele);
    // s.selectByVisibleText("AMERICAN SAMOA");
     s.selectByValue("ANTARCTICA");
    ele.sendKeys(Keys.ESCAPE);
     
	}

}
