package Tests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.BaseClass;

public class NewWindowTest extends BaseClass {
	@Test
	public static void Tc1()
	{
		driver.get("");
		WebElement NewTab = driver.findElement(By.xpath("//button[@id='tabButton']"));
		NewTab.click();
		
		Set<String>NameOfAllWindow = driver.getWindowHandles();
		
		for(String currentWin:NameOfAllWindow)
		{
			driver.switchTo().window(currentWin);
			
		}
	}

	
}
