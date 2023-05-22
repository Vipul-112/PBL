package PBL;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingDataFromExcelFile {
	public static String URL = "https://demo.opencart.com";
	public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get(URL);
//		Thread.sleep(3000);
//
//		// Click on My Account
//		driver.findElement(By.xpath("//span[text()='My Account']")).click();
//
//		// Click on Login
//		driver.findElement(By.linkText("Login")).click();
//
//		Thread.sleep(3000);
		
		

		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.println(GetDataFromExcelFile(i,j)+" ");
			}
			System.out.print(" ");
		}

//		driver.findElement(By.id("input-email")).sendKeys(GetDataFromExcelFile(1, 0));
//		driver.findElement(By.id("input-password")).sendKeys(GetDataFromExcelFile(1, 1));

		// driver.quit();

	}

	public static String GetDataFromExcelFile(int row, int coll) throws IOException {

		// Get Location Of File

		String LocationOfFile = "/Users/VI20466289/eclipse-workspace/Guru999/Utilities/Untitled spreadsheet copy.xlsx";
		// Make file Componemt
		File filecomp = new File(LocationOfFile);

		//
		FileInputStream fss = new FileInputStream(filecomp);

		// Reading Data from Excel File
		XSSFWorkbook wb = new XSSFWorkbook(fss);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSF
		String amt = sheet.getRow(row).getCell(coll).getStringCellValue();
		
		

		return amt;

	}
}
