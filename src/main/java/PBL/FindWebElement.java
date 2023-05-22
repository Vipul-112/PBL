package PBL;

import java.util.List;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindWebElement {
	
		public static String URL = "https://letcode.in/table";
		public static WebDriver driver;

		public static void main(String[] args)  {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(URL);

			
			WebElement Table = driver.findElement(By.id("simpletable"));
			//Read the no of headers
			int TotalHeaders = Table.findElements(By.tagName("th")).size();			
			//int TotalHeaders = Table.findElement(By.tagName("th")).size();
			System.out.println("Header Count : "+TotalHeaders);
			
			
			//Header Names
			List<WebElement> HeaderCollection =  Table.findElement(By.tagName("th"));
			
			for(WebElement currentHeader: HeaderCollection)
			{
				System.out.println(currentHeader.getText());
			
//			}
//			int Totalrows = Table.findElements(By.tagName("tr")).size();
//
//			System.out.println("Rows Count : " + Totalrows);
//
//			System.out.println(" ");
			//All Row Collection
			WebElement RowsCollection =  Table.findElement(By.tagName("tr"));
			
			//All CellData Printing One by One
			for(WebElement CurrentRow : RowsCollection)
			{
				WebElement ColCollection =  CurrentRow.findElement(By.tagName("td"));
				for(WebElement CurrCal : ColCollection)
				{
					String cellData = CurrCal.getText();
					System.out.println(cellData);
				}

			}
			
			
			
}
		}}
	
