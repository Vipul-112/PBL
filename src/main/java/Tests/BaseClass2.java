package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.BaseClass;

public class BaseClass2 extends BaseClass{
	@Test
	public static void TC1()
	{
		//
		//Get css value
		WebElement Page = driver.findElement(By.xpath("//h5"));
		String actualcolour = Page.getCssValue("colour");
		System.out.println("Expected : #212529" + "Actual : " +actualcolour);
		
		//GEt Size
		System.out.println(Page.getSize());
		
	}
	
	

}
