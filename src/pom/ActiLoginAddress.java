package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiLoginAddress {
	 
	@FindBy(id="username")
    private	WebElement un;
	public ActiLoginAddress(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getUn() {
		return un;
	}
}
