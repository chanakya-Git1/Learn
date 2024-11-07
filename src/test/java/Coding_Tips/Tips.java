package Coding_Tips;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tips {

	
	public void horizontalscrollwebelement() {
//	To scroll the web page or a scroll bar inside a web page horizontally until the web element is visible.
	WebDriver driver = new ChromeDriver();
	WebElement scroll = driver.findElement(By.xpath("//div[@id='gvLocationHorizontalRail']"));
	JavascriptExecutor js = (JavascriptExecutor)driver; 
//	js.executeScript(driver.executeScript("arguments[0].scrollIntoView()", scroll));
	
	}
	
	
	public void horizontalscroll() {
//	To scroll the web page horizontally 
	WebDriver driver = new ChromeDriver();
	JavascriptExecutor hjs = (JavascriptExecutor)driver;
//	hjs.executeScript("window.scrollBy(5000,40)");
//OR
	Actions ac = new Actions(driver);
	ac.scrollByAmount(5000, 0).perform();//to scroll the main horizontal slide bar)
	
	
	

	
	}
	
}
