package PBL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign7 {

	public static String URL = "https://jpetstore.aspectran.com";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);
		
		Thread.sleep(3000);
		
		//Click on fish
		WebElement Click = driver.findElement(By.linkText("Fish"));
		Click.click();
		
		//Click on FW
		driver.findElement(By.linkText("FI-FW-02")).click();
		
		//Click on EST-21
		WebElement est = driver.findElement(By.linkText("EST-21"));	
		est.click();
		
		//Click on Add to cart
		WebElement Add = driver.findElement(By.linkText("Add to Cart"));	
		Add.click();
		
		//Display Amount
		String amount = driver.findElement(By.xpath("(//strong)[2]")).getText();
		float rupees = Float.parseFloat(amount.substring(1, amount.length()))*81.82f;
		System.out.println("Total in rupees : "+rupees);
		
		//close
		driver.close();
		
	}

}
