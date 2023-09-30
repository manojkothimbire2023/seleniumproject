package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autodropdownlisthandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//this script used to maximize window
		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		
		WebElement from=driver.findElement(By.id("fromCity"));
		from.sendKeys("bang");
		Thread.sleep(2000);
		Actions  act=new Actions(driver);
		act.moveToElement(from).sendKeys(Keys.ARROW_DOWN).perform();
		act.moveToElement(from).sendKeys(Keys.ENTER).perform();
	
	}

}
