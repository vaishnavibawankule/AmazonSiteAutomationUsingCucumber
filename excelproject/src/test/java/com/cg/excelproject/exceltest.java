package com.cg.excelproject;

import java.io.FileInputStream;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;


public class exceltest {

	WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "D:\\agile\\NewChromeDriver\\chromedriver.exe");

	}

	@Test
	public void DataRead() throws IOException, JXLException, Throwable {

		String FilePath = "D:\\agile\\excelfile1.xls";
		FileInputStream fi = new FileInputStream(FilePath);
		Workbook W = Workbook.getWorkbook(fi);
		driver = new ChromeDriver();
		driver.get("D:\\agile\\excelproject\\src\\main\\webapp\\form.html");
		Sheet s = W.getSheet("Sheet1");
		int row = s.getRows();
		//int col = s.getColumns();

		for (int row1 = 0; row1 < row; row1++) {
			String Username = s.getCell(0, row1).getContents();

			driver.findElement(By.id("name")).sendKeys(Username);

			String address = s.getCell(1, row1).getContents();

			driver.findElement(By.id("address")).sendKeys(address);
			Thread.sleep(1000);
			driver.findElement(By.id("submit")).click();

		}
		driver.close();
	}
}
