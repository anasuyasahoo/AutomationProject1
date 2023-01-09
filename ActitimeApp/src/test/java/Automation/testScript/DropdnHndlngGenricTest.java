package Automation.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Automation.genericLib.BaseClass;

public class DropdnHndlngGenricTest extends BaseClass {
	@Test(groups= {"system","smoke"})
	public void handlngDropdn()
	{
		driver.findElement(By.className("popup_menu_button_settings")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Manage system settings')]/..")).click();
		WebElement dropdown=driver.findElement(By.id("firstHierarchyLevelCodeSelect"));
		cu.getSelectvisibletext(dropdown, "Product");
		driver.findElement(By.xpath("//option[text()='Product']")).click();
		WebElement msg=driver.findElement(By.id("FormModifiedTextCell"));
		System.out.println(msg.getText());

	}

}
//OUTPUT
//MODIFICATIONS NOT SAVED
