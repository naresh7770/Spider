package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkartaddress {

	
	@FindBy (xpath = "//div[text()='Electronics']")
    private	WebElement electronics;
	
	@FindBy (xpath = "//a[text()='Gaming']")
	private WebElement gaming;
	
	@FindBy (xpath = "//a[text()='Games']")
	private WebElement games;
	
	@FindBy (xpath = "//button[text()='✕']")
	private WebElement cross;

	public WebElement getCross() {
		return cross;
	}

	public Flipkartaddress(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getElectronics() {
		return electronics;
	}

	public WebElement getGaming() {
		return gaming;
	}

	public WebElement getGames() {
		return games;
	}
	
	 
}
