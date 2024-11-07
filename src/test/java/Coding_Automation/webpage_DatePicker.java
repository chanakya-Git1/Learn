package Coding_Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class webpage_DatePicker {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		String dm="";
		String dy="";
		String dmy="";
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(co);
		Properties prop= new Properties();
		String inmy ="November 2025";
		FileInputStream fi = new FileInputStream("D:\\JavaLearn\\Learn\\src\\test\\java\\config.properties");
		try {
			prop.load(fi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().to(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//p-calendar[@formcontrolname='journeyDate']/*")).click();
		dm =driver.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']")).getText();
		dy =driver.findElement(By.xpath("//span[@class='ui-datepicker-year ng-tns-c58-10 ng-star-inserted']")).getText();
		dmy = dm.concat(" "+dy);
		
		while(dmy!=inmy){
			driver.findElement(By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();
			dm =driver.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']")).getText();
			dy =driver.findElement(By.xpath("//span[@class='ui-datepicker-year ng-tns-c58-10 ng-star-inserted']")).getText();
			dmy = dm.concat(" "+dy);
			System.out.println(dmy);
		if(dmy.contentEquals(inmy)) {
			System.out.println(dmy);
			break;
				}
			}
		List<WebElement>date =driver.findElements(By.xpath("//td//a"));
		for(WebElement d : date) {
			if(d.getText().equalsIgnoreCase("19")) {
				d.click();
				break;
			}
		}
		Thread.sleep(3000);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
	}

}
