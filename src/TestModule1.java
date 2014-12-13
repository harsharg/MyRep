
 import org.openqa.selenium.*;
 import org.openqa.selenium.firefox.*;
 import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
 
public class TestModule1 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
	  try
	   {
	  //   System.setProperty("webdriver.ie.driver","C:/IEDriver/IEDriverServer.exe");
         WebDriver driver = new FirefoxDriver();
		 driver.get("http://www.google.com");
		 driver.findElement(By.xpath(".//*[@id='body']/center/div[2]")).sendKeys("INDIA");
		 
		} 
	    catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
