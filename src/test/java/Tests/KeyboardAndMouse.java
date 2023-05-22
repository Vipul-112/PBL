package Tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import Base.BaseClass;

public class KeyboardAndMouse extends BaseClass{
	@Ignore
	public void DragAndDrop() {
		driver.get("https://demoqa.com/droppable");
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));

		act.dragAndDrop(src, dest).build().perform();
		WebElement DropMssgeElement = driver.findElement(By.xpath("//div[@id='droppable']]/p[1]"));
		String ActualText = DropMssgeElement.getText();
		System.out.println(ActualText);

		//
		String ExpectedText = "Dropped";
		assertEquals(ActualText, ExpectedText);

	}

	@Ignore
	public void ReadToolTip() {
		driver.get("https://demoqa.com/tool-tips");
		WebElement ButtonHoverOnMe = driver.findElement(By.id("toolTipButton"));
		act.moveToElement(ButtonHoverOnMe);
		act.pause(Duration.ofMillis(3000));
		act.build().perform();

		String ExpTextOfToolTip = "hovered over the button";
		String ActualText = driver.findElement(By.className("tooltip-inner")).getText();
		assertEquals(ExpTextOfToolTip, ActualText);
	}

	@Ignore
	public void ScrollingPage() {

	}

	@Test
	public void RightClick() {

		driver.get("https://demoqa.com/tool-tips");
		WebElement contraryLink = driver.findElement(By.linkText("Contrary"));

		// Right Click
		act.contextClick(contraryLink);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER);
		act.build();
		act.perform();

	}

	@Ignore
	public void DoubleClick() {

	}

	@Ignore
	public void SendingDataInCapsOn() {

	}

	@Ignore
	public void HoldAndRElease() {
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		act.clickAndHold(src).release(dest).build().perform();
		WebElement DropMssgeElement = driver.findElement(By.xpath("//div[@id='droppable']"));

	}

}
