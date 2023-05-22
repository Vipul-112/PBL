package PBL;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sc {
	public static String URL = "https://www.flipkart.com";
	public static WebDriver driver;

	public static  void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		
		//Type Casting
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		
		//Calling method to take screenshot
		File src = scrShot.getScreenshotAs(OutputType.FILE);
		
		//Store in folder
		String address = "/Users/VI20466289/eclipse-workspace/Guru999/ScareenShots/one.png";
		
		File dest = new File(address);
		FileUtils.copyFile(src, dest);
		
}
}
