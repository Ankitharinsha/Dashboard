package com.licious.testdata;

import org.testng.annotations.BeforeMethod;

import com.licious.base.BaseTest;
import com.licious.pages.LoginPage;

public class LoginTest extends BaseTest
{
	
	public LoginPage loginPage;
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

}
