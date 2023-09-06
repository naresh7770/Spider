package Testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ReusableMethods.demoframework;

public class Tc3 extends demoframework{

	@Test(priority = 2)
	public void m3()
	{
		int i=r.nextInt();
		String data="KGF"+i;
    driver.findElement(By.id("container_tasks")).click();	
	driver.findElement(By.xpath("//div[text()='Add New']")).click();
	driver.findElement(By.xpath("//div[@class='item createNewProject']")).click();
	driver.findElement(By.xpath("//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")).sendKeys(data);
	driver.findElement(By.xpath("//div[@class='customerSelectorPlaceholder selectorWithPlaceholderContainer notSelected']")).click();
	
	driver.findElement(By.xpath("(//div[text()='Big Bang Company'])[6]")).click();
	driver.findElement(By.xpath("//div[text()='Create Project']")).click();
	
	}
}
