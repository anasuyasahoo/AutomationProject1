package Automation.testScript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Automation.genericLib.BaseClass;
import Automation.genericLib.CommonUtility;
import Automation.genericLib.DataUtility;
@Listeners(Automation.genericLib.ListenerImplementation.class)
public class CreateCustTest extends BaseClass {
	@Test
	public void customercreation() throws EncryptedDocumentException, IOException, InterruptedException
	{
		int num=cu.getRandom(10000);
		String actualcustomer=du.getDataFromExcelsheet("sheet1", 0, 0);
		actualcustomer=actualcustomer+num;
		 //click on task
		driver.findElement(By.id("container_tasks")).click();
		//click on add new
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		//Thread.sleep(2000);
		//click on new customer
		driver.findElement(By.className("createNewCustomer")).click();
		//customer name
		driver.findElement(By.className("newNameField")).sendKeys(actualcustomer);
		//click on create customer
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		System.out.println("customer created successfully");
		//Reporter.log("customer creation done");
		

	}

}
