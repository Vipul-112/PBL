package PBL;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingDataFromPropertiesFlie {
	public static String URL = "https://demo.opencart.com";
	public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);
		Thread.sleep(3000);

		// Click on My Account
		driver.findElement(By.xpath("//span[text()='My Account']")).click();

		// Click on Register
		driver.findElement(By.linkText("Login")).click();

		Thread.sleep(3000);

		String EmailFromPropFile = GetDataFromPropFile("Email");
		String PasswordFromPropFile = GetDataFromPropFile("Pass");

		driver.findElement(By.id("input-email")).sendKeys(EmailFromPropFile);
		driver.findElement(By.id("input-password")).sendKeys(PasswordFromPropFile);

		driver.quit();

	}

	public static String GetDataFromPropFile(String string) throws IOException {
		// Get Location Of File

		String LocationOfFile = "/Users/VI20466289/eclipse-workspace/Guru999/Propeties";

		// Make file Componemt
		File filecomp = new File(LocationOfFile);

		//
		FileInputStream fss = new FileInputStream(filecomp);

		Properties prop = new Properties();
		prop.load(fss);

		String value = prop.getProperty(string);
		return value;

	}

}
