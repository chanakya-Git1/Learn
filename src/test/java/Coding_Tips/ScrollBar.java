package Coding_Tips;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ScrollBar {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		Actions ac = new Actions(driver);
		driver.get("https://accounts.google.com/v3/signin/identifier?authuser=0&continue=https%3A%2F%2Fwww.google.com%2Fwebhp%3Fhl%3Den%26sa%3DX%26ved%3D0ahUKEwiSirOZoKGJAxVJTGwGHdEyJZgQPAgI&ec=GAlAmgQ&hl=en&flowName=GlifWebSignIn&flowEntry=AddSession&dsh=S1445704847%3A1729574832785732&ddm=0");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/c-wiz/footer/div/div/div/div[1]/div")).click();
		WebElement trg = driver.findElement(By.xpath("//span[text()='తెలుగు']/../.."));
		ac.scrollToElement(trg).perform();
		ac.scrollByAmount(300, 0).scrollToElement(trg).perform();	
		driver.navigate().to("https://cosmocode.io/automation-practice-webtable/");
		WebElement table = driver.findElement(By.xpath("//tr/.."));
		List<WebElement> rows = table.findElements(By.xpath("//tr"));
		for(WebElement row : rows) {
			List<WebElement> cells = row.findElements(By.xpath("//td"));
			for(WebElement cell :cells) {
				System.out.println(cell.getText()+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
