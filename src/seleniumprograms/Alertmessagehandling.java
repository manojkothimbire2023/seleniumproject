package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertmessagehandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//this script used to maximize window
		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		
		WebElement alertwithok=driver.findElement(By.id("alertButton"));
		alertwithok.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		WebElement alertwithcancel=driver.findElement(By.id("confirmButton"));
		alertwithcancel.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		WebElement alertwithtext=driver.findElement(By.id("promtButton"));
		alertwithtext.click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().sendKeys("manoj");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}

}
