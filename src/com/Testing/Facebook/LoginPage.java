package com.Testing.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.Facebook.BaseClass.Page;

//@SuppressWarnings("unused")
public class LoginPage extends Page {
  
	 public static WebDriver driver = null;
     public  LandingPage doLogin()
     
     {
    	 
    	// Page p = new Page();
		
   ///	driver.navigate().to(config.getProperty("SiteuserName"));
    //	driver.navigate().to(config.getProperty("SiteuserPassword"));
	//	driver.findElement(By.xpath("ssad")).sendKeys("sasad"); // Username
	//	driver.findElement(By.xpath("ssad")).sendKeys("sasad"); // Password
	//	driver.findElement(By.xpath("ssad")).click();
    	  InputCredentials();
    	  Click();
		
		return new LandingPage();
	}
	
	public LoginPage doRegister() {
		
		return new LoginPage();
		
	}
		
	public ProfilePage profile()
	{
		return new ProfilePage();
	}
	
}
