package Section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPrinting {

		public static void main(String[] args) throws Throwable {
			System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Kandagatla Naresh\\eclipse-workspace\\Automation\\src");
			WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			
			WebElement ele=driver.findElement(By.xpath("//button[text()='✕']"));
			ele.click();
			
	        driver.findElement(By.name("q")).sendKeys("iphone");
	        Thread.sleep(3000);
	       List<WebElement>  ele1= driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']/li"));
	       
	       for( WebElement i:ele1)
	       {
	    	   String data=i.getText();
	    	   if(data.contains("11 pro"))
	    	   {
	    		  i.click();
	    	   }
	    	 //System.out.println(data);
	       }

	}

}
