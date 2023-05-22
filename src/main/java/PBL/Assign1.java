package PBL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1 {
	public static String URL = "https://demo.opencart.com";
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);
		
		//Click on My Account
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		
		//Click on Login
		driver.findElement(By.linkText("Login")).click();
		
		//Click on Email
		driver.findElement(By.id("input-email")).sendKeys("qwe");
		
		//Click on Password
		driver.findElement(By.id("input-password")).sendKeys("qqq");
		
		//Share Id Of Email And Password
		String IdOfEmail =driver.findElement(By.id("input-email")).getAttribute("id");
		String IdOfPassword = driver.findElement(By.id("input-password")).getAttribute("id");
		
		

				
		
		

	}

}
