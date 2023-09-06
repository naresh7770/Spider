package Testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ReusableMethods.demoframework;

public class Tc2 extends demoframework {

	@Test(priority = 1)
	public void m2()
	{
		int i=r.nextInt();
		String data="ABC"+i;
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.cssSelector("div[class='item createNewCustomer']")).click();
		driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys(data);
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		
	}
}
