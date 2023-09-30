package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ancestorxpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//this script used to maximize window
		
		driver.get("https://trytestingthis.netlify.app/");
		Thread.sleep(2000);
		
	boolean ancestor=driver.findElement(By.xpath("//input[@id='fname']//ancestor::form")).isDisplayed();
	System.out.println(ancestor);
		
	
		
	}

}
