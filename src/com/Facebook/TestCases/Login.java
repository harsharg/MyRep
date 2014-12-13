package com.Facebook.TestCases;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Keys;

import com.Facebook.BaseClass.Page;
import com.Testing.Facebook.LandingPage;
import com.Testing.Facebook.LoginPage;


public class Login extends Page {

	public static void main(String args[])
	{
		
		
		
	//	WebDriver driver = new FirefoxDriver();
		
		LoginPage l = new LoginPage();
		LandingPage lpage = l.doLogin();
		lpage.GoToProfile();
	//	l.doLogin();
		
	 // 	InputCredentials();
	//  	Click();
	//	click();
		//LandingPage p = l.doLogin("test", "pwd");
	//	p.GoToProfile();
		
	}
	
}
