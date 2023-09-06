package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actilogin {

	@FindBy (id = "username")
	private WebElement un;
	
	@FindBy (name = "pwd")
	private WebElement pw;
	
	@FindBy (id = "keepLoggedInCheckBoxContainer")
	private WebElement checkbox;
	
	@FindBy (xpath = "//div[text()='Login ']")
	private WebElement login;
	
	@FindBy (id = "toPasswordRecoveryPageLink")
	private WebElement forgetpw;
	
	public Actilogin(WebDriver driver)
	{
	   PageFactory.initElements(driver,this);
	}

	public WebElement getUn() {
		return un;
	}

	public WebElement getPw() {
		return pw;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getForgetpw() {
		return forgetpw;
	}
	
	}
