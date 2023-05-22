package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.BaseClass;

public class OperationCommands extends BaseClass {
	@Test
	public void TC1() {
		// Sendkeys
		WebElement nameField = driver.findElement(By.xpath("//input[@id='firstName']"));
		nameField.sendKeys("Vipul");
		// clear
		nameField.clear();

		nameField.sendKeys("Ravi");

		// click
		WebElement RadioButton = driver.findElement(By.id("gender-radio-1"));
		RadioButton.click();

		// Submit
		WebElement SubmitButton = driver.findElement(By.id("submit"));
		SubmitButton.submit();

	}

}
