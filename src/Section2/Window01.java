package Section2;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window01 {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Kandagatla Naresh\\eclipse-workspace\\Automation\\src");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.swiggy.com/");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("http://www.recharge.com/");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://demo.actitime.com/login.do");
    Set<String> allID = driver.getWindowHandles();
    for(String i: allID)
    {
    String title=driver.switchTo().window(i).getTitle();
    if(title.equals("Order food online from India's best food delivery service. Order from restaurants near you"))
    {
    	driver.close();
    	break;
    }
    	
    }
	
}
}
