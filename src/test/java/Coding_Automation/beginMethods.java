package Coding_Automation;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class beginMethods {

	public static int numbe(String  str) {
		String inputString = str; 
		String numbersOnly = inputString.substring(1, 2);
		int i =Integer.parseInt(numbersOnly);
		return i;
	}
	
	public static String webTable(WebDriver driver) {
		String cellvalue = null;
		WebElement table = driver.findElement(By.xpath("//tr/.."));
		List<WebElement> rows = table.findElements(By.xpath("//tr"));
		for(WebElement row : rows) {
			List<WebElement> cells = row.findElements(By.xpath("//td"));
			for(WebElement cell :cells) {
				cellvalue = cell.getText();
			}
			System.out.println();
		}
		return cellvalue;
	}

	
	public void brokenlinks(WebDriver driver) {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		  for(int i=0; i<links.size(); i++) {
		           WebElement element = links.get(i);
		               String url=element.getAttribute("href");
//		               verifyLink(url);  
		            }
//		   URL link = new URL(urlLink);
//		   HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
//		   if(httpConn.getResponseCode()!= 200) {
//		    System.out.println(“Broken Link”);
//			}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
