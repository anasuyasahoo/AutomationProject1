package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement usernameTB;
	
	@FindBy(name="pwd")
	private WebElement passwordTB;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(id="logoutLink")
	private WebElement logoutButton;
	
	
	public WebElement getusernameTB()
	{
		return usernameTB;
	}
	public WebElement getpasswordTB()
	{
		return passwordTB;
	}
	public WebElement getloginButton()
	{
		return loginButton;
	}
	public WebElement getlogoutButton()
	{
		return logoutButton;
	}
	public void loginApp(String username,String password)
	{
		getusernameTB().sendKeys(username);
		getpasswordTB().sendKeys(password);
		getloginButton().click();
	}
	public void logoutApp()
	{
		getlogoutButton().click();
	}

}
