package PBL;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign6 {

	public static String URL = "https://Ebay.com";
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);
		
		
		//Search For SearchBox
		WebElement SearchBox = driver.findElement(By.id("gh-ac"));
		SearchBox.sendKeys("Apple");
		
		//Click on Dropdown
		WebElement Dropdown = driver.findElement(By.id("gh-act"));
		Select var = new Select(Dropdown);
		var.selectByVisibleText("Music");
		
		//Click On Search
		WebElement Search = driver.findElement(By.id("gh-btn"));
		Search.click();
		
		//Collection
		String ProductNameXpath = "//span[@role='heading']";
		
		List<WebElement> AllProduct = driver.findElements(By.xpath(ProductNameXpath));

		for (WebElement web : AllProduct) {

			System.out.println(web.getText());

			System.out.print(" ");

		}

		System.out.println("10th Place : " + AllProduct.get(10).getText());

		driver.quit();

		
	}

}
