package com.cg.redbus;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	private WebDriver driver;
	BusPage page=null;
	
	@Before()
	public void SetupStepEnv() {
		System.out.println("Env1");
		System.setProperty("webdriver.chrome.driver", "D:\\agile\\NewChromeDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
	}
	@Given("^I have entered all details$")
	public void i_have_entered_all_details() throws Throwable {
		
	//	WebDriverWait wait=new WebDriverWait(driver, 100);
	//	List<WebElement> element=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"src\"]")));
		 page = PageFactory.initElements(driver,BusPage.class);
		page.src.sendKeys("Pune");
	    page.dest.sendKeys("Nagpur");
	   page.date.click();
	   page.onboardingdate.click(); 
	  // page.date1.click();
	  // page.droppingdate.click();
	   Thread.sleep(500);
	   page.src1.click();
	   Thread.sleep(500);
	    page.dest1.click();
	    Thread.sleep(500);
	 
	    
	    page.searchbutton.click();
	    
	  
	}

	@When("^I pressed on search button and view seats$")
	public void i_pressed_on_search_button_and_view_seats() throws Throwable {
	//	WebDriverWait wait=new WebDriverWait(driver, 100);
			//List<WebElement> element=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\\\"8203530\\\"]/div/div[2]/div[1]")));
      
	    Thread.sleep(5000);
		page.viewbuses.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	page.boardingadd.click();
	page.droppingadd.click();
	page.proceed.click();
		
	}

	@Then("^I have entered personnal details and click on proceed$")
	public void i_have_entered_personnal_details_and_click_on_proceed() throws Throwable {
	   page.name.sendKeys("vaishnavi");
	   page.age.sendKeys("20");
	   page.gender.click();
	   page.email.sendKeys("vaishnavi@gmail.com");
	   page.phone.sendKeys("9922493800");
	   page.terms.click();
	   page.proceedtopay.click();
	}


}
