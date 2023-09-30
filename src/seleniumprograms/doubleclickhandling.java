package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclickhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//this script used to maximize window
		
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(2000);
		
		
		//double click
		
		WebElement dclick=driver.findElement(By.id("doubleClickBtn"));
		Actions act=new Actions(driver);
		act.doubleClick(dclick).perform();
		Thread.sleep(2000);
		
		//right click
		
		WebElement rightck=driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rightck).perform();
		
	}

}
