package Amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		WebElement Webtable=driver.findElement(By.id("tblPQ")); // Replace TableID with Actual Table ID or Xpath
		List<WebElement> TotalRowCount=Webtable.findElements(By.tagName("tr"));

		System.out.println("No. of Rows in the WebTable: "+TotalRowCount.size());
		// Now we will Iterate the Table and print the Values   
		int RowIndex=1;
		for(WebElement rowElement:TotalRowCount)
		{
		      List<WebElement> TotalColumnCount=rowElement.findElements(By.tagName("td"));
		      int ColumnIndex=1;
		      for(WebElement colElement:TotalColumnCount)
		      {
		           System.out.println("Row "+RowIndex+" Column "+ColumnIndex+" Data "+colElement.getText());
		           ColumnIndex=ColumnIndex+1;
		       }
		      RowIndex=RowIndex+1;
		 }

		}

	}


