package PBL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Que3 {

	public static String URL = "https://opensource-demo.orangehrmlive.com/";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);

		// Enter username
		String XPathForUsername = "//input[@name=\"username\"]";
		driver.findElement(By.xpath(XPathForUsername)).sendKeys("Admin");

		// Enter Password
		String XPathForPassword = "//input[@class='oxd-input oxd-input--active' or @type='password']";
		driver.findElement(By.xpath(XPathForPassword)).sendKeys("admin123");

		// Click on login
		String XPathForLogin = "//button[@type='submit']";
		driver.findElement(By.xpath(XPathForLogin)).click();

		// Click for Dropdown
		String XPathForDrop = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']";
		driver.findElement(By.xpath(XPathForDrop)).click();

		// Click on logout
		String XPathForLogout = "//a[@href='/web/index.php/auth/logout']";
		driver.findElement(By.xpath(XPathForLogout)).click();

		driver.quit();

	}

}
