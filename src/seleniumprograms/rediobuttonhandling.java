package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediobuttonhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//this script used to maximize window
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		
		//radio button handling
		
		WebElement male=driver.findElement(By.id("male"));
		WebElement female=driver.findElement(By.id("female"));
		if(!male.isSelected())
		{
			male.click();
		}
		else
		{
			female.click();
		}
		
	}

}
