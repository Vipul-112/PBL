package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.BaseClass;

public class Alerts extends BaseClass{
	public static void Tc1() throws InterruptedException
	{
		driver.get("");
		
		//All 4 Alert buttons
		WebElement NormalAlert = driver.findElement(By.id("alertButton"));
				WebElement TimerAlert = driver.findElement(By.id("timerAlertButton"));
				WebElement ConfirmAlert = driver.findElement(By.id("confirmButton"));
				WebElement PrompAlert = driver.findElement(By.id("promtButton"));
				
				//Notmal
				NormalAlert.click();
				driver.switchTo().alert().accept();
				Thread.sleep(3000);
				
				//
				TimerAlert.click();
				driver.switchTo().alert().dismiss();
				Thread.sleep(3000);
				
				//
				ConfirmAlert.click();
				driver.switchTo().alert().accept();
				Thread.sleep(3000);
				
				//
				PrompAlert.click();
				driver.switchTo().alert().accept();


				
	}


}
