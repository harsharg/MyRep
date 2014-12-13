package Amazon;


	import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


	public class Reistration {

		String newwindow=null;
	  @Test
	  public void f() {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		
		//	driver.getCapabilities().isJavascriptEnabled();
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.isJavascriptEnabled();
			ChromeDriver driver= new ChromeDriver(cap);
			
			
			driver.get("http://www.theguardian.com/uk");
			WebDriverWait wait = new WebDriverWait(driver, 60); 
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign in")));
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			

			JavascriptExecutor js = (JavascriptExecutor) ((JavascriptExecutor)driver).executeScript("scrollTo(0,3000)");
			
			driver.findElement(By.xpath("//*[@id='header']/div[1]/div[1]/div[4]/span[1]/a")).click();
			Set<String>opendwindows = driver.getWindowHandles();
	        
			Iterator<String> iter= opendwindows.iterator();
	        //Iterator it = opendwindows.iterator();
	            
	        while(iter.hasNext())
	        {
	            newwindow = iter.next();
	            driver.manage().window().maximize();
	        }
	            
	        System.out.println(newwindow);
	        driver.switchTo().window((String) newwindow);
	        WebElement elem = driver.findElement(By.xpath("//*[@id='email']"));
	        Actions action = new Actions(driver);
	      //  action.
	        //.clear();
	        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("ssd");
	//- hide quoted text -
	       
		  
		  
		  
	  }
	}