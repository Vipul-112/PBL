package Tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SiteAutomate  {
	public static String URL = "https://demoqa.com/automation-practice-form";
	public static WebDriver driver;
		
		public static String GetDataFromPrFile(String string) throws IOException
		{
			
		//driver.get("https://demoqa.com/automation-practice-form");
		File fl = new File("/Users/VI20466289/eclipse-workspace/Guru999/Propeties");
		FileInputStream fss=new FileInputStream(fl);
		
		
		 // Reading the data from prop file
		Properties Pr =new Properties();
		Pr.load(fss);
		
		String value =Pr.getProperty(string);
		return value;
		
		}
		
		
        @Test
		public void ST1() throws IOException, InterruptedException
		{
        	WebDriverManager.chromedriver().setup();
    		driver = new ChromeDriver();
    		driver.get(URL);
    		Thread.sleep(3000);
        	
        	
			String NameFromPrFile = GetDataFromPrFile("Name");
			String LastNmFrompFile = GetDataFromPrFile("LastName");
			
			driver.findElement(By.id("firstName")).sendKeys(NameFromPrFile);	
			driver.findElement(By.id("lastName")).sendKeys(LastNmFrompFile);
			
			//driver.findElement(By.xpath("//input[@class='mr-sm-2 form-control']")).sendKeys(GetDataFromPropFile("Email"));
			
			

		
		
		
	}
	

}
