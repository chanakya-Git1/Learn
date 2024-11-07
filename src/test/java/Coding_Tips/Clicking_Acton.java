package Coding_Tips;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Clicking_Acton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Actions ac = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://online.actitime.com/ltt/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("chanakya.1728@gmail.com");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("avinashacv");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		String title=driver.findElement(By.xpath("//title")).getText();
		if (title.equalsIgnoreCase("actiTIME -  Enter Time-Track")) {
			System.out.println("User landed on TimeTrack Page");
		}
		else {
			System.out.println("Title is not matched");
		}
		
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		List<WebElement> projectModes=driver.findElements(By.xpath("//div[starts-with(@class,'node projectNode')]//div[@class='text']"));
		Iterator<WebElement> it = projectModes.iterator();
		System.out.println(projectModes.size());
		if (it.hasNext()) {
			for (WebElement projectname :projectModes) {
			System.out.println(projectname.getText());
				
			}
		}
		WebElement ufc = driver.findElement(By.xpath("//div[@class='unfilteredContainer']"));
		ac.moveToElement(driver.findElement(By.xpath("(//tr[@class='taskRow'])[1]"))).build().perform();
		ac.scrollByAmount(0, 500).build().perform();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		
	
		
	}

}
