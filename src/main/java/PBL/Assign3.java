package PBL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign3 {

	public static String URL = "https://demoqa.com/buttons";
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);
		
		//Click on double Click Button
		WebElement DoubleClickMe=driver.findElement(By.className("btn btn-primary"));
		
		//Click on Right Click Button
		WebElement RightClickMe=driver.findElement(By.className("btn btn-primary"));
		
		//Click on ClickMe Button
		WebElement ClickMe=driver.findElement(By.className("btn btn-primary"));

	}
	

}
