package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByTagName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	Thread.sleep(2000);
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	
	WebElement searchtextbox=driver.findElement(By.tagName("textarea"));
	searchtextbox.sendKeys("Automation step by step");
	
	}

}
