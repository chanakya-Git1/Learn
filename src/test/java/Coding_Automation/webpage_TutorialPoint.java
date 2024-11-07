package Coding_Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class webpage_TutorialPoint {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(co);
		Properties prop= new Properties();
		FileInputStream fi = new FileInputStream("D:\\JavaLearn\\Learn\\src\\test\\java\\config.properties");
		try {
			prop.load(fi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().to(prop.getProperty("url1"));
		driver.manage().window().maximize();
		String bgc=driver.findElement(By.xpath("(//label[text()='PNR STATUS' and @class='search_btn'])[1]")).getCssValue("background-color");
		
		System.out.println(bgc);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
