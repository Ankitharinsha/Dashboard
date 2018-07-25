package dashboard.LiciousDashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage 
{
	WebDriver driver;
	@FindBy(name="email") WebElement username;
	@FindBy(how=How.XPATH, using ="login-password") WebElement password;
	@FindBy(how=How.XPATH, using = "submit") WebElement login;
	
	public LoginPage(WebDriver driver1)
	{
		this.driver=driver1;
	}
	
	public void LoginElements(String uid,String upass)
	{
		username.sendKeys(uid);
	
		password.sendKeys(upass);
		
	    login.click();
	}
}
