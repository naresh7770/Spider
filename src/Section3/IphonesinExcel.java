package Section3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphonesinExcel {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		WebElement ele=driver.findElement(By.xpath("//button[text()='✕']"));
		ele.click();
		driver.findElement(By.className("_3704LK")).sendKeys("iphone",Keys.ENTER);
		Thread.sleep(3000);
	    List<WebElement> a=driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone')]"));
		FileInputStream fis=new FileInputStream("C:\\Users\\Kandagatla Naresh\\Desktop\\Automation\\Books123.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.createSheet("Iphones12");
		for(int i=0;i<a.size();i++)
		{
	     String data=a.get(i).getText();
	     sh.createRow(i).createCell(0).setCellValue(data);
		

		FileOutputStream fos=new FileOutputStream("C:\\Users\\Kandagatla Naresh\\Desktop\\Automation\\Books123.xlsx");
		book.write(fos);
	    System.out.println("pass");
	}
	}
}