
package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	// public static String ChromeDriverPath =
	// "/Users/VI20466289/Downloads/chromedriver_mac64/chromedriver";

	public static String URL = "https://demoqa.com/automation-practice-form";

	public static Actions act;

	public static WebDriver driver;

	@BeforeTest

	public static void Start() {

		WebDriverManager.chromedriver().setup();
		
		// System.setProperty("webdriver.chrome.driver", ChromeDriverPath);

		driver = new ChromeDriver();

		act = new Actions(driver);

		driver.manage().window().maximize();
		
		//it is not use for current version
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get("https://www.google.com");
//		driver.findElement(By.xpath("sdgfjyhgdfj")).sendKeys("jdfghjdgj");

	}

//

//	@AfterTest

//	public static void End() {

// driver.quit();

//	}

}
