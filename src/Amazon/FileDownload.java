package Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownload {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FirefoxProfile Prof = new FirefoxProfile();
		Prof.setPreference("browser.download.dir", "C:\\Australia");
		Prof.setPreference("browser.download.folderList", 2);
		Prof.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");
		  
		WebDriver driver = new FirefoxDriver(Prof);
		driver.get("http://seleniumhq.org/download/");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
		driver.findElement(By.xpath("//*[@id='mainContent']/table[1]/tbody/tr[1]/td[4]/a")).click();


	}

}
