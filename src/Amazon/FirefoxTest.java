
	package Amazon;

	
	import org.testng.annotations.BeforeClass;
    import org.testng.annotations.Test;
    import org.testng.AssertJUnit;
	import java.util.List;
    import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.*;
	import org.testng.Assert;
    import org.testng.asserts.Assertion;
     import org.openqa.selenium.htmlunit.HtmlUnitWebElement;

	//import org.openqa.selenium.ie.*;

	//import package 

	public class FirefoxTest {
		
        private Excel jxl = new Excel();
		public WebDriver driver = null;
		

		@BeforeClass
		public void InitializeDriver()
		{
			
		}
	    	
		
		@Test
		public void testDynamicTable() throws InterruptedException {
 
			String salary = "0";
	
			List <WebElement>  totalRows= driver.findElements(By.xpath("//table[@name='salaryTable']/tbody/tr"));
		 
			for (int row = 1; row <= totalRows.size(); row++)
			{
			// Fetch the text of first column (name)
		      String name = driver.findElement(By.xpath("//table[@name='salaryTable']/tbody/tr["+row+"]/td[1]")).getText();
		      // If name matches gaurang fetch the text of third column (salary)
		      if (name.equalsIgnoreCase("Test"))
		        {
			      salary = driver.findElement(By.xpath("//table[@name='salaryTable']/tbody/tr["+row+"]/td[3]")).getText();
			       System.out.println(salary);
			        AssertJUnit.assertEquals("Verify Salary", "45000", salary);
		         }
			 }
			
		}
		

		
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			DesiredCapabilities capability = DesiredCapabilities.firefox();
	//		capability.setCapability(FirefoxDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
         	capability.setCapability("binary", "C:\\Program Files\\Mozilla Firefox\\firefox.exe"); //for windows                
			//String elem;
			WebDriver driver = new FirefoxDriver(capability);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String test = (String) js.executeScript()
			driver.get("http://www.bbc.com");
		//	driver.
	//		WebDriverWait wait = new WebDriverWait(driver, 30);
			WebElement elem = driver.findElement(By.xpath(".//*[@id='news_moreTopStories']/ul/li[1]/a"));
			elem.sendKeys(Keys.ENTER);
		//	System.out.println(elem)
			driver.quit();
		//	Assert.assertEquals("test", "pass");
		//	driver.getPageSource().contains("test");
			
		//	driver.findElements(By.name)

		}

	}

