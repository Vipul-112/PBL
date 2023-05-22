package PBL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ques2 {

	public static String URL = "https://demo.guru99.com/selenium/newtours/";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);

		// Enter Username
		String XPathForUsername = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input";
		driver.findElement(By.xpath(XPathForUsername)).sendKeys("tutorial");

		// Enter Password
		String XPathForPasswordname = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input";
		driver.findElement(By.xpath(XPathForPasswordname)).sendKeys("tutorial");

		// Clock on Sign in button
		String XPathForsignin = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input";
		driver.findElement(By.xpath(XPathForsignin)).click();

		// Click on Flight Icon
		String XPathForFlightIcon = "//a[@href='reservation.php']";
		driver.findElement(By.xpath(XPathForFlightIcon)).click();

		// Enter Click Sign-off
		String xpathSignOff = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]";
		driver.findElement(By.xpath(xpathSignOff)).click();

		driver.close();
	}

}

