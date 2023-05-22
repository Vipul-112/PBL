package PBL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign2 {

	public static String URL = "https://demo.opencart.com";
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);

		// Click on My Account
		driver.findElement(By.xpath("//span[text()='My Account']")).click();

		// Click on Register
		driver.findElement(By.linkText("Register")).click();

		// Click on Email
		driver.findElement(By.id("input-email")).sendKeys("qwe");

		// Click on Password
		driver.findElement(By.id("input-password")).sendKeys("qqq");

		// Click on First Name
		driver.findElement(By.id("input-firstname")).sendKeys("vip");

		// Click on Last Name
		driver.findElement(By.id("input-lastname")).sendKeys("jar");

		String IdOfEmail = driver.findElement(By.id("input-email")).getAttribute("id");
		String IdOfPassword = driver.findElement(By.id("input-password")).getAttribute("id");
		String IdOfFirstname = driver.findElement(By.id("input-firstname")).getAttribute("id");
		String IdOfLastname = driver.findElement(By.id("input-lastname")).getAttribute("id");

		System.out.println("IdOfEmail" + IdOfFirstname);
		System.out.println("IdOfPassword" + IdOfLastname);
		System.out.println("IdOfEmail" + IdOfEmail);
		System.out.println("IdOfPassword" + IdOfPassword);
		
		

	}

}
