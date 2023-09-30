package seleniumprograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);
		//parent window
	String parentwindow=driver.getWindowHandle();
	System.out.println(parentwindow);
		
	//child window
		WebElement childwindow=driver.findElement(By.id("newWindowBtn"));
		childwindow.click();
	Set<String>set=driver.getWindowHandles();
	
	for(String handle:set)
	{
		System.out.println(handle);
		if(!parentwindow.equals(handle))
		{
			driver.switchTo().window(handle);
			WebElement firstname=driver.findElement(By.xpath("//input[@id='firstName']"));
			firstname.sendKeys("manoj");
			Thread.sleep(2000);
			driver.close();
		}
	}
	Thread.sleep(2000);
	driver.switchTo().window(parentwindow);
	WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
	name.sendKeys("kumar");
	
	
	}
	

}
