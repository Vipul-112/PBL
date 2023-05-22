package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.BaseClass;

public class FrameTesting extends BaseClass{
	@Test
	public static void TC1()
	{
		driver.get("https://letcode.in/frame");
		
		driver.switchTo().frame(0);
		WebElement FirstName = driver.findElement(By.name("fname"));
		FirstName.sendKeys("Vipul");
		
		
		//
		WebElement LastName = driver.findElement(By.name("lname"));
		LastName.sendKeys("Jawale");
		
		//
		WebElement EmailField = driver.findElement(By.name("email"));
		driver.switchTo().frame(EmailField);
		EmailField.sendKeys("abc@gmail.com");
		
		driver.switchTo().parentFrame();
		FirstName.clear();
		FirstName.sendKeys("It is new DAta");
		
		driver.switchTo().defaultContent();
		

		
	}
	

}
