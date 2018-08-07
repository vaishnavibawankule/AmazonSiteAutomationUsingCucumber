package com.cg.redbus;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusPage {
	@FindBy(how=How.XPATH,using="//*[@id=\"src\"]")
	WebElement src;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"search\"]/div/div[1]/div/ul/li[1]")
	WebElement src1;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"dest\"]")
	WebElement dest;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"search\"]/div/div[2]/div/ul/li")
	WebElement dest1;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"search\"]/div/div[3]/span")
	WebElement date;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[4]/td[5]")
	WebElement onboardingdate;
	

	/*@FindBy(how=How.XPATH,using="//*[@id=\"search\"]/div/div[4]/span")
	WebElement date1;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[5]/td[4]")
	WebElement droppingdate;*/
	
	@FindBy(how=How.XPATH,using="//*[@id=\"search_btn\"]")
	WebElement searchbutton;
	

	@FindBy(how=How.XPATH,using="//*[@id=\"8436880\"]/div/div[2]/div[1]")
	WebElement viewbuses;
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"8436880\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[1]/ul/li[1]")
	WebElement boardingadd;


	@FindBy(how=How.XPATH,using="//*[@id=\"8436880\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[2]/ul/li[2]")
	WebElement droppingadd;
	

	@FindBy(how=How.XPATH,using="//*[@id=\"8436880\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[6]/button")
	WebElement proceed;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"seatno-04\"]")
	WebElement name;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"23_0\"]")
	WebElement gender;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"seatno-01\"]")
	WebElement age;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"seatno-05\"]")
	WebElement email;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"seatno-06\"]")
	WebElement phone;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[4]/div/div/div[1]/div[5]/div/div[2]/div[1]/label[1]/span[2]")
	WebElement terms;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[4]/div/div/div[2]/div[2]/input")
	WebElement proceedtopay;
	
	
	
	
}
