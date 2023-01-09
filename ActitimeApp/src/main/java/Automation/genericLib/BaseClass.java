package Automation.genericLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import ElementRepository.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public DataUtility du=new DataUtility();
	public CommonUtility cu=new CommonUtility();
	public static WebDriver ListenerDriver;
	
	@BeforeClass(alwaysRun=true)
	public void LaunchBrowser() { 
	driver=new EdgeDriver();
	ListenerDriver=driver;
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod(alwaysRun=true)
	public void login() throws IOException
	{
		driver.get(du.getDataFRomProperties("url"));
		LoginPage lp=new LoginPage(driver);
		lp.loginApp(du.getDataFRomProperties("Username"),du.getDataFRomProperties("Password"));
		//driver.findElement(By.id("username")).sendKeys(du.getDataFRomProperties("Username"));
		//driver.findElement(By.name("pwd")).sendKeys(du.getDataFRomProperties("Password"));
		//driver.findElement(By.id("loginButton")).click();
	}
	@AfterMethod(alwaysRun=true)
	public void logout()
	{
		LoginPage lp=new LoginPage(driver);
		lp.logoutApp();
	}
	@AfterClass(alwaysRun=true)
	public void closeBrowser()
	{
		driver.close();
	}
	

}
