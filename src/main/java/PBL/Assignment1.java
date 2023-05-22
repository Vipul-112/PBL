package PBL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {
	public static String URL = "https://demo.opencart.com";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);
		
		//Get Title and Url
		String Title = driver.getTitle();
		System.out.println(Title);
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		//

	}

}
