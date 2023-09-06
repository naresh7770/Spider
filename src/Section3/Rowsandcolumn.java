package Section3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rowsandcolumn {

	public static void main(String[] args) throws Throwable {
		DataFormatter df=new DataFormatter();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Iphones",Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> ele=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	    List<WebElement> ele1=driver.findElements(By.cssSelector("div[class='_30jeq3 _1_WHN1']"));
//	    System.out.println(ele.size());
//	    System.out.println(ele1.size());
//	    for(WebElement i: ele)
//	    {
//	    	String phone=i.getText();
//	    	System.out.println(phone);
//	    }
//	    for(WebElement i: ele1)
//	    {
//	    	String price=i.getText();
//	    	System.out.println(price);
//	    }
	    FileInputStream fis=new FileInputStream("C:\\Users\\Kandagatla Naresh\\Desktop\\Automation\\Book.xlsx");
	    Workbook book=WorkbookFactory.create(fis);
	    Sheet sh=book.createSheet("Final12");
//	    String data=ele.get(0).getText();
//	    sh.createRow(0).getCell(0).setCellValue(data);
	    for(int i=0;i<ele.size();i++)
	    {
	    	String data=ele.get(i).getText();
	    	String data1=ele1.get(i).getText();
	    	//sh.createRow(i).createCell(0).setCellValue(data);
	    	sh.createRow(i).createCell(1).setCellValue(data1);
	    	sh.getRow(i).createCell(0).setCellValue(data);
	    }
	  
	    FileOutputStream fos=new FileOutputStream("C:\\Users\\Kandagatla Naresh\\Desktop\\Automation\\Book.xlsx");
		book.write(fos);
		System.out.println("pass");
		
		
	}
	   
}
