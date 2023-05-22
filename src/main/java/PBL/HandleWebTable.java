package PBL;

import java.io.IOException;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWebTable {

	public static String URL = "https://letcode.in/table";

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(URL);

		WebElement Table = driver.findElement(By.id("simpletable"));

		// number of header

		int TotalHeader = Table.findElements(By.tagName("th")).size();

		System.out.println("Header count : " + TotalHeader);

		// number of rows

		int Totalrows = Table.findElements(By.tagName("tr")).size();

		System.out.println("Rows Count : " + Totalrows);

		System.out.println(" ");

		// Header Name

		List<WebElement> RowsCollection = Table.findElements(By.tagName("tr"));

		for (WebElement CurrHeader : RowsCollection) {

			List<WebElement> Conthead = CurrHeader.findElements(By.tagName("td"));

			for (WebElement contData : Conthead) {

				String CellD = contData.getText();

				System.out.println(CellD);

			}

		}

		driver.quit();

	}

}
