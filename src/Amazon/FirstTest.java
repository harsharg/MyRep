package Amazon;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class FirstTest {

	public static void main(String[] args) {
        // declaration and instantiation of objects/variables
        WebDriver driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        String baseUrl = "https://jira.atlassian.com/browse/TST";
        // launch Firefox and direct it to the Base URL
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          
   
        driver.findElement(By.xpath(".//*[@id='user-options']/a")).click();
        driver.findElement(By.xpath(".//*[@id='username']")).clear();
        driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("asha.r81@gmail.com");
        driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("asha1234");
        driver.findElement(By.xpath(".//*[@id='login-submit']")).click();
        
        //File an Issue
               
        
        
         WebDriverWait wait = new WebDriverWait(driver, 30);
        
        driver.findElement(By.xpath(".//*[@id='create_link']")).click(); 
        System.out.println("Clicked on create_link");// click some link that opens a new window

  
        
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(".//*[@id='project-field']"))); 
        WebElement project = driver.findElement(By.xpath(".//*[@id='project-field']"));   
        
        project.click();       
        project.sendKeys(Keys.BACK_SPACE);
        project.sendKeys("A Test Project");
        project.sendKeys(Keys.ARROW_DOWN);
        project.sendKeys(Keys.ENTER);
        
        System.out.println("Project Selected");
        
      
        
        Wait<WebDriver> waitf = new FluentWait<WebDriver>(driver)
        	       .withTimeout(30, TimeUnit.SECONDS)
        	       .pollingEvery(5, TimeUnit.SECONDS)
        	       .ignoring(NoSuchElementException.class);

        	    WebElement test = waitf.until(new Function<WebDriver, WebElement>() {
        	     public WebElement apply(WebDriver driver) {
        	      
        	    	  return driver.findElement(By.xpath("//div[@id='issuetype-single-select']/input"));
        	    	    
        	
        	     }
        	   });
        	    
        
        
     //    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='issuetype-single-select']"))); 
        driver.findElement(By.xpath(".//*[@id='issuetype-single-select']/span")).click();
        WebElement issue =  driver.findElement(By.xpath(".//*[@id='issuetype-suggestions']/div/ul/li[1]/a"));
        issue.click();		
   /*     issue.sendKeys(Keys.BACK_SPACE);
        issue.sendKeys("Bug");
        issue.sendKeys(Keys.ARROW_DOWN); */
     //   issue.sendKeys(Keys.ENTER); 
      
        System.out.println("Issue Selected");
        
         wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[@id='summary' and @name='summary']")));        
        /// Click on the edit box
         WebElement elem = driver.findElement(By.xpath("//input[contains(@id,'summary')]"));
         JavascriptExecutor executor = (JavascriptExecutor)driver;
         executor.executeScript("arguments[0].click();", elem);
         
         wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[@id='summary' and @name='summary']")));        

         
         driver.findElement(By.xpath("//input[@id='summary' and @name='summary']")).sendKeys("Summary of the new issue");
        //driver.findElement(By.xpath("//input[@id='description']")).sendKeys("Description of the new issue");

        driver.findElement(By.xpath(".//*[@id='create-issue-submit']")).click();

        //Search Tab of JIRA
       WebElement element = driver.findElement(By.xpath(".//*[@id='find_link']"));
       Actions action3 = new Actions(driver); 
       action3.click(element).build().perform(); 
       driver.findElement(By.xpath(".//*[@id='filter_lnk_reported_lnk']")).click(); 
        
       //List of issues that gets displayed
       driver.findElements(By.xpath("//div[@class='list-content']")); 
       List<WebElement> allElements = driver.findElements(By.xpath("//ol[@class='issue-list']/li")); 
     
       System.out.println("length of the allelements="+allElements.size());
       List<String> myList = new ArrayList<>();
       for (int i = 1; i < allElements.size()+1; i++) {
           WebElement linkElement = driver
                   .findElement(By
                           .xpath("//div[@class='list-content']/ol/li[" + i
                                   + "]/a/span[1]"));

           System.out.println(linkElement.getText());
           myList.add(linkElement.getText());
       }
       
       System.out.println("length of the myList="+myList.size());
       String searchDefect="" ;
       String editDefect="";
       for(int i = 0; i < myList.size(); i++) {
    	   //Printing the defect ids
           System.out.println("mylist="+myList.get(i));
           if(i == 0){
        	   searchDefect = myList.get(i);
           }
           if(i == 1){
        	   editDefect = myList.get(i);
           }
        	   
       }
       
       //Search for a given defect
       WebElement searchfield = driver.findElement(By.xpath(".//*[@id='quickSearchInput']"));       
       searchfield.click();
       searchfield.sendKeys(searchDefect);
       searchfield.sendKeys(Keys.ENTER);
       
       System.out.println("Search defect done");
       
       //Edit a given defect
       WebElement editfield = driver.findElement(By.xpath(".//*[@id='quickSearchInput']"));       
       editfield.click();
       editfield.sendKeys(editDefect);
       editfield.sendKeys(Keys.ENTER);
       
       WebElement element1 = driver.findElement(By.xpath(".//*[@id='edit-issue']"));  
       element1.click();
       System.out.println("Clicked on edit button");
       
       WebElement summary = driver.findElement(By.xpath(".//*[@id='summary']"));
       summary.clear();
       summary.sendKeys("Editing summary of id "+editDefect);
       
       WebElement comment1 = driver.findElement(By.xpath(".//*[@id='description']"));
       comment1.clear();
       comment1.sendKeys("Editing description of defect id "+editDefect);
       driver.findElement(By.xpath(".//*[@id='edit-issue-submit']")).click();
         
        //close Firefox
       driver.close();
        
        // exit the program explicitly
       System.exit(0);
    }
    
    
    
}