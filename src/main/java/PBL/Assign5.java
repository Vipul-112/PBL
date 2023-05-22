package PBL;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign5 {

	public static String URL = "https://flipkart.com";

	public static WebDriver driver;

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/mk/Downloads/chromedriver_mac_arm64/chromedriver");

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get(URL);

		List<WebElement> li = driver.findElements(By.tagName("a"));

		System.out.println(li.size());

		for (WebElement we : li)

			System.out.println(we.getAttribute("href"));

		driver.quit();

	}

}
