package Automation.genericLib;

import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonUtility {
	public int getRandom(int value)
	{
		Random r=new Random();
		int num=r.nextInt(value);
		return num;
	}
	public String getAlertMsg(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		String text=alt.getText();
		return text;
		
	}
	public void getAlertOk(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
	} 
	public void getSelectvisibletext(WebElement dropdown,String visibleText )
	{
		Select s=new Select(dropdown);
		s.selectByVisibleText(visibleText);
	}

}
