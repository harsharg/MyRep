package com.Testing.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Facebook.BaseClass.Page;

public class LandingPage  extends Page

{

	
	public void Click()
	{
		
		driver.findElement(By.xpath(config.getProperty("LoginButton")));
	}
	
	public void GoToProfile()
	{
		
		driver.findElement(By.xpath(config.getProperty("MyProfile")));
		
		
	}
	
	

}
