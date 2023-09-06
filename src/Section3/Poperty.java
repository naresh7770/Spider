package Section3;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Poperty {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\Kandagatla Naresh\\Desktop\\Automation\\01.PROPERTIES");
		Properties pobj=new Properties();
		pobj.load(fis);  
	String url=	pobj.getProperty("url");
	String un=pobj.getProperty("un");
	String pw=pobj.getProperty("pw");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys(un,Keys.TAB,pw,Keys.ENTER);
	
		

	}

}
