package Testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ReusableMethods.demoframework;

public class Tc1 extends demoframework {
	
    @Test(priority = 0)
    public void m1() throws Throwable
    {
    	String data=m1.property("un");
    	driver.findElement(By.id("taskSearchControl_field")).sendKeys(data);
    	
    }
	
	
	
	
}
