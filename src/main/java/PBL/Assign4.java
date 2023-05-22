package PBL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign4 {


	public static String URL1 = "https://opencart.com";
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL1);
		String title = driver.getTitle();
		
		Thread.sleep(3000);
		
		//For Navigation OpenCart
		driver.navigate().to(URL1);
		
		//validate
		if(title.equals("Your Store"))
		
			System.out.println("pass");
		else
		{
			System.out.println("fail");
		}
		
		//
		
		driver.navigate().to("https://facebook.com");
		driver.navigate().back();
		String URL2=driver.getCurrentUrl();
		System.out.println(URL2);
		driver.navigate().forward();
		driver.navigate().refresh();
		

	}

}
