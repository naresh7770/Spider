package Section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDynamicdropdown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Kandagatla Naresh\\eclipse-workspace\\Automation\\src");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		Thread.sleep(3000);
        List<WebElement> ele=driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
        
       for(WebElement i:ele)
       {
    	   String data=i.getText();
   	   if(data.contains("max"))
	    	   {
	    		  i.click();
	    	   }
    	  // System.out.println(data);
       }

}
}
