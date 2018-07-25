package com.licious.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DatePicker extends BaseTest
{
	public WebDriver driver; 
	
	@FindBy(how =How.CSS, using = "#tab1 > div:nth-child(12) > div:nth-child(2) > div > span > button")
	WebElement startDate;
	//public String sDate="04-06-2018";
	
	@FindBy(how =How.CSS, using ="#tab1 > div:nth-child(12) > div:nth-child(4) > div > span > button > i")
	WebElement endDate;
	//public String eDate="30-07-2018";
	
	public static void startDate(WebDriver driver,WebElement element,String sDate)
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("argument[0],setAttribute('value'''"+sDate+"');", element);
	}
	
	public static void endDate(WebDriver driver,WebElement element,String eDate)
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("argument[0],setAttribute('value'''"+eDate+"');", element);
	}
}
