package com.cg.amazon;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	private WebDriver driver;

	@Before()
		public void SetupStepEnv() {
			System.out.println("Env1");
			System.setProperty("webdriver.chrome.driver", "D:\\agile\\NewChromeDriver\\chromedriver.exe");
			driver= new ChromeDriver();
		}
	
	@Given("^I am on the amazon page$")
	public void i_am_on_the_amazon_page() throws Throwable {
	
		
	driver.get("https://www.amazon.in/");
	}

	@When("^I entered valid details$")
	public void i_entered_valid_details() throws Throwable {

	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("tv");
	
	
	driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
	
	driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div[2]/div/div[2]/div[1]/div[1]/a/h2")).click();
	
	String w=driver.getWindowHandle();
	for(String w1: driver.getWindowHandles())
	{
		driver.switchTo().window(w1);
		
	}
	driver.close();
	driver.switchTo().window(w);
	driver.get("https://www.amazon.in/Sanyo-inches-XT-32S7000H-Ready-Black/dp/B01ICVLKFC/ref=sr_1_1?s=electronics&ie=UTF8&qid=1533559019&sr=1-1&keywords=tv");
	driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("sony power bank");
	driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
	driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div[3]/div[1]/a/h2")).click();

	String w2=driver.getWindowHandle();
	for(String w1: driver.getWindowHandles())
	{
		driver.switchTo().window(w1);
		
	}
	driver.close();
	driver.switchTo().window(w2);
	driver.get("https://www.amazon.in/Sony-CP-V10A-10000-Power-Black/dp/B00NBIRJI4/ref=sr_1_1?s=electronics&ie=UTF8&qid=1533560689&sr=1-1&keywords=sony+power+bank");

	driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("jio fi");
	driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
	driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div[3]/div[1]/a/h2")).click();

	String w3=driver.getWindowHandle();
	for(String w1: driver.getWindowHandles())
	{
		driver.switchTo().window(w1);
		
	}
	driver.close();
	driver.switchTo().window(w3);
	driver.get("https://www.amazon.in/JioFi-Hotspot-M2S-Portable-Device/dp/B075P7BLV5/ref=sr_1_1?s=computers&ie=UTF8&qid=1533560889&sr=1-1&keywords=jio+fi");
	
	driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
//	assertEquals(driver.findElement(By.className("a-size-medium")).getText(), "Added to Cart");
	
	}

	@Then("^I will successfully purchased stuffs$")
	public void i_will_successfully_purchased_stuffs() throws Throwable {
		//driver.findElement(By.xpath("//*[@id=\"hlb-ptc-btn-native\"]")).click();
		//assertEquals(driver.findElement(By.tagName("h1")).getText(), "Login");
	}
}
