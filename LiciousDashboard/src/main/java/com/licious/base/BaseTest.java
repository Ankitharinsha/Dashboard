 package com.licious.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.licious.util.Util;

public class BaseTest 
{	
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;
	
	public BaseTest()
	{
		try
		{
			prop= new Properties();
			FileInputStream ip = new FileInputStream("D:\\DashboardORT\\LiciousDashboard\\src\\main\\java\\com\\licious\\config\\config.properties");
			prop.load(ip);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void initialization()
	{
			String browserName = prop.getProperty("browser");
			if (browserName.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			
		    wait=new WebDriverWait(driver,20);
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Util.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
			
			driver.get(prop.getProperty("url"));
	}
}
