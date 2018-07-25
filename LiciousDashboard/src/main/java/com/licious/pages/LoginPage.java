package com.licious.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.licious.base.BaseTest;

public class LoginPage extends BaseTest
{
	
	@FindBy(how=How.XPATH, using ="//input[@type= 'email']") 
	WebElement usernameORT;
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"login-password\"]")
	WebElement passwordORT;
	
	@FindBy(how=How.XPATH, using = "//button[@type='submit']")
	WebElement login;
	
	public LoginPage()
	{
		// can use any1 of the below two statements;
		//PageFactory.initElements(driver, LoginPage.class);
		
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public HomePage login(String un, String pwd)
	{
		usernameORT.sendKeys(un);
		passwordORT.sendKeys(pwd);
		login.click();
		return new HomePage();
	}
}
