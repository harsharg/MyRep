package com.Facebook.BaseClass;

import java.io.FileInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class Page {
	
	public  static  WebDriver driver = null ;
	public  static Properties config = null;
	
	
	
 
   
	 public Page()
	 {
		
		if (driver == null)
		{
			//Initialize Properties
		   config  = new Properties(); 
	//	   this.driver = new FirefoxDriver() ;
			try {
					FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "\\Users\\harsharg\\workspace\\SampleTest\\src\\Config\\Config.Properties");
        		    config.load(fs);
			     }
			catch(Exception e)
			{
				return;
			}
			
	     if(config.getProperty("Browser").equals("Mozilla"))
	         this.driver = new FirefoxDriver();
	    	// driver.navigate().to("www.facebook.com");
	     else if(config.getProperty("Browser").equals("IE"))  
	    	  this.driver = new InternetExplorerDriver();
	       
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		}
	     
       }  
	     
	////  Driver Implicit Wait
     
	 
	 
	   
	     public void InputCredentials()
	     {
	    	//Username
	    	 driver.findElement(By.xpath(config.getProperty("SiteUserName"))).sendKeys("harsha.ranganna@gmail.com");
	    	//Password
	    	 driver.findElement(By.xpath(config.getProperty("SitePassword"))).sendKeys("rathnamma");
	    	 	    	 
	    	 
	     }
	     
	    
	     
	     public void Click()
	     {
	    	 
	    	 driver.findElement(By.xpath(config.getProperty("LoginButton")));
	     }
		
	     
	     
		  
	//	} 
	// }

}


