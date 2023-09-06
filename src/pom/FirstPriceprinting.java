package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstPriceprinting{
	public WebDriver driver;
	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Actions act=new Actions(driver);
		Flipkartaddress fa=new Flipkartaddress(driver);
		
		fa.getCross().click();
		
		act.moveToElement(fa.getElectronics()).perform();
		act.moveToElement(fa.getGaming()).perform();
	   Actions e= act.moveToElement(fa.getGames());
	   e.click();
	   e.perform();
	   Thread.sleep(3000);
	   
	  WebElement price= driver.findElement(By.xpath("(//a[text()='98000 Game IN 1 Video Game Pad Built In TV LED Game Dir...']/following-sibling::div[3]/following-sibling::a//div//div)[1]"));
	 String data =price.getText();
	 System.out.println(data);
	 System.out.println("pass");
	}

}
