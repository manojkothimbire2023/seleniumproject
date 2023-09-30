package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownlisthandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//this script used to maximize window
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		WebElement country=driver.findElement(By.name("country"));
		Select obj=new Select(country);
		obj.selectByVisibleText("ANGOLA");
		Thread.sleep(2000);
		obj.selectByValue("AUSTRALIA");
		Thread.sleep(2000);
		obj.selectByIndex(10);
	
	}

}
