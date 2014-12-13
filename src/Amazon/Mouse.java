package Amazon;


//import javax.swing.event.MenuKeyListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Mouse {
	
	private Login calc = new Login();
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		   WebDriver driver = new FirefoxDriver();
		   driver.get("http://www.google.com");
		   WebElement elementToRightClick = driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[1]/div[2]/a")); 
		   Actions clicker = new Actions(driver);
		//   Actions clicker = new Actions(driver); 
		   Actions rightClick = clicker.contextClick(elementToRightClick);
		   rightClick.perform();
		   
		   		
		

	}

}

