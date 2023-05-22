package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.BaseClass;

public class VerificationControlMethod extends BaseClass {
	
    @Test
	public void TC1() {

		// IsDisplayed
		// IsEnabled
		// IsSelected
		WebElement PageTitle = driver.findElement(By.id("//h5"));
		System.out.println("Page TItle is : " + PageTitle.isDisplayed());
		System.out.println();

		WebElement SportCheckBox = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
		System.out.println("BeforeChecking" + SportCheckBox.isSelected());

		// SportCheckBox.click();
		// System.out.println("AfterClicking : " +SportCheckBox.click());

	}

}
