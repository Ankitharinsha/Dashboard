package com.licious.Testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.licious.base.BaseTest;
import com.licious.pages.LoginPage;

public class LoginTest extends BaseTest 
{
	LoginPage loginPage;
	
	public LoginTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage = new LoginPage();
		
	}
	
	@Test
	public void LoginPage()
	{
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void close()
	{
	driver.quit();
	}

	
}
