package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatedByLinkText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	Thread.sleep(2000);
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(2000);
	
	
	
	WebElement forgottenAccount=driver.findElement(By.linkText("Forgotten account?"));
	forgottenAccount.click();
	}

}
