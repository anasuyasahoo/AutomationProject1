package Automation.testScript;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Automation.genericLib.BaseClass;
import Automation.genericLib.CommonUtility;
import Automation.genericLib.DataUtility;

public class AlertActiGenricTest extends BaseClass {
	@Test
	public void handleAlert() throws EncryptedDocumentException, IOException
	{
		driver.findElement(By.className("popup_menu_button_settings")).click();
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		driver.findElement(By.cssSelector("[id='name']")).sendKeys(du.getDataFromExcelsheet("sheet1", 0, 0));
		driver.findElement(By.xpath("//input[@onclick='handleCancel();']")).click();
		
		String msg=cu.getAlertMsg(driver);
		System.out.println(msg);
		cu.getAlertOk(driver);
		//Reporter.log("Alert popup handeled", true);
		

	}

}
