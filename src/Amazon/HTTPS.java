package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

public class HTTPS {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 
		FirefoxProfile profile = new FirefoxProfile();
		 
		profile.setAcceptUntrustedCertificates(true);
		
		DesiredCapabilities cap =  DesiredCapabilities.firefox();
		
		cap.setBrowserName("FireFox");
		cap.setPlatform("WINDOWS");
		
		 
		WebDriver driver = new FirefoxDriver(profile);
		 
		driver.get("https://indiamail.mphasis.com/owa");
		
		
	
		 
		

	}

}
