package com.licious.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.licious.base.BaseTest;

public class HomePage extends BaseTest
{
	
	@FindBy(how=How.XPATH, using ="/html/body/div[3]/div[2]/div/ul/li[2]/a/span") 
	WebElement businessDashboard;
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div/div[2]/ul/li/a/span")
	WebElement user;
	
	@FindBy(how=How.CSS, using ="#tab1")
	WebElement OverallAnalytics;
	
	@FindBy(how=How.XPATH, using ="/html/body/div[3]/div[2]/div/ul/li[48]/a/span[1]")
	WebElement Coupon;
	
	//Initialize Page Object
	
	public String businessDashboard()
	{
		return driver.getTitle();
	}
	
	public String OverallAnalytics()
	{
		return driver.getTitle();
	}
	
	public void Coupon()
	{	
	 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Coupon);
	}
	
}
