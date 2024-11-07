package Coding_Automation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

import org.openqa.selenium.TakesScreenshot;

public class deoActitime {
	public static WebElement ele;
	public String prin="";
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		int [] arr =new int[10];
		HashMap<String,Integer> hs = new HashMap<>();
		
		WebDriver driver  = new ChromeDriver();
		Actions ac = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://online.actitime.com/ltt/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("chanakya.1728@gmail.com");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("avinashacv");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		driver.findElement(By.xpath("//button[text()='Timesheet']")).click();
		driver.findElement(By.xpath("//button[@class='components-NoteButton-noteButton--oLGRdBm8 components-NoteButton-hasNote--HFfqfCVF components-NoteButton-visible--ksjecDvj']")).click();
		String note=driver.findElement(By.xpath("//textarea[@placeholder='Enter note']")).getText();
		System.out.println(note);
		WebElement bar = driver.findElement(By.xpath("//span[text()='Planning']/../../../../../../../../..//div[@data-for='baseTooltipId' and @class='components-ProgressBar-bar--TKmWFymY']"));
		String tooltip=driver.findElement(By.xpath("//span[text()='Planning']/../../../../../../../../..//div[@data-for='baseTooltipId' and @class='components-ProgressBar-bar--TKmWFymY']")).getAttribute("data-tip");

		ac.moveToElement(bar).perform();		
		String[] str = tooltip.split(" ");
		System.out.println(str.length);
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+" ");
		}
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("D:\\BDD\\ScreehShots\\actitime.png");
		Files.copy(src, trg);
		
		List<WebElement> mainmenu = driver.findElements(By.xpath("//div[text()='Users']/../../..//td//a//div//following-sibling::div[@class='label']"));
//		Clicking on Users
		for(WebElement text :mainmenu) {
			if(text.getText().equals("Users")) {
				text.click();
				System.out.println("Clicked on USERS");
				break;}
		}
		
		List<WebElement> username= driver.findElements(By.xpath("//span[@class='userNameSpan']"));
		List<WebElement>group = driver.findElements(By.xpath("//div[@class='groupName']"));
		for (int i = 0; i < group.size(); i++) {
			System.out.println(username.get(i).getText()+"'s Group is : "+group.get(i).getText());
		} 
		Set<String> u = new HashSet<>();
		for(WebElement g:username) {
			u.add(g.getText());}
		for(String prit:u) {
			System.out.println(prit + " --> "+prit.length());
		}
		driver.findElement(By.xpath("//div[@class='userList_manageButtons_component_groupItem department ']")).click();
		
	List<WebElement>value=	driver.findElements(By.xpath("//div[@class='userGroupDiv']/..//td[@style='cursor: default;']"));
	List<WebElement>resou = driver.findElements(By.xpath("//td[@class='groupNameCell']//div//div[@class='ellipsisOverflow']"));
	List<Integer> li = new ArrayList<>();
	System.out.println(value.size() + " "+resou.size());
	
	for (int i = 0; i < value.size()-1; i++) {
			hs.put(resou.get(i).getText(),beginMethods.numbe(value.get(i).getText()));	}
	
	for(String h : hs.keySet()) {
		System.out.println(h+" --> "+hs.get(h));
		li.add(hs.get(h));}
	
	System.out.println(hs.entrySet());
	System.out.println(li);
	
	driver.findElement(By.xpath("//div[@id='groupManagementLightBox_closeLightbox']")).click();
	
	HashMap<String,String> A_P = new HashMap<>();
	HashMap<String,String> PTO = new HashMap<>();
	HashMap<String,String> SickDays = new HashMap<>();
	HashMap<String,String> Assignments = new HashMap<>();
	String header= driver.findElement(By.xpath("//span[text()='List of Users']")).getText();
	System.out.println(header);
	List<WebElement> tabs = driver.findElements(By.xpath("//span[text()='List of Users']"));
	List<WebElement> usernames  = driver.findElements(By.xpath("//span[@class='userNameSpan']"));
	List<WebElement> useraccess = driver.findElements(By.xpath("//td[@class='teamScopeCell']//span"));
	
		
	for(int  j =0; j<usernames.size()-1;j++) {
		A_P.put(usernames.get(j).getText(),useraccess.get(j).getText());}
	
	driver.findElement(By.xpath("//div[text()='                                     PTO Settings                                      ']")).click();
	List<WebElement> crntBal = driver.findElements(By.xpath("//td[starts-with(@class,'currentBalanceCell ptoCell')]"));
	for(int  j =0; j<usernames.size()-1;j++) {
		PTO.put(usernames.get(j).getText(),crntBal.get(j).getText());}
	
	
	driver.findElement(By.xpath("//div[text()='                                     Sick Days Settings                                      ']")).click();
	List<WebElement> sickbal = driver.findElements(By.xpath("//td[starts-with(@class,'currentBalanceCell sickDaysCell')]"));
	for(int  j =0; j<usernames.size()-1;j++) {
		SickDays.put(usernames.get(j).getText(),sickbal.get(j).getText());}	
	
	
	driver.findElement(By.xpath("//div[text()='                                     Work Assignments                                      ']")).click();
	List<WebElement> openTasks = driver.findElements(By.xpath("//span[@class='userNameSpan']/../../../../../../../..//div[@class='tasks active']/*/*/*//div[@class='counterText']"));	
	for(int  j =0; j<openTasks.size();j++) {
		Assignments.put(usernames.get(j).getText(),openTasks.get(j).getText());}
	
	
	System.out.println(A_P);
	System.out.println(PTO);
	System.out.println(SickDays);
	System.out.println(Assignments);
		System.out.println();
	for(String user:A_P.keySet()) {
		if(user.contentEquals("White, Jane")) {
			System.out.println("White, Jane"+" has Access to "
					+A_P.get("White, Jane")+" and have PTO of "
					+PTO.get("White, Jane")+" and SL of "
					+SickDays.get("White, Jane")+"  with tasks of "
					+Assignments.get("White, Jane")+" actively.");
		}
	}
	
	
	System.out.println("******************************************************************************");
	System.out.println("______________________________________________________________________________");
	for(String user:A_P.keySet()) {
			System.out.println(user+" has Access to "
					+A_P.get(user)+" and have PTO of "
					+PTO.get(user)+" and SL of "
					+SickDays.get(user)+"  with tasks of "
					+Assignments.get(user)+" actively.");
	}
		
		
		
	driver.findElement(By.xpath("//div[@class='label' and text()='Tasks']")).click();
	
	WebElement test = driver.findElement(By.xpath("//div[@title='Supplier selection']"));
	ac.moveToElement(test).perform();
	ac.scrollByAmount(0,200);
	Thread.sleep(10000);
	List<WebElement> tasks = driver.findElements(By.xpath("//div[@class='taskRowCellWrapper']/*/*//following-sibling::div[@class='title']"));
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
		driver.quit();
	}

}
