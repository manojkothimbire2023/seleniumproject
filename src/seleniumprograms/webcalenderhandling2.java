package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webcalenderhandling2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//this script used to maximize window
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
		WebElement datepicker=driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']"));
		datepicker.click();
		Thread.sleep(2000);
		
		String month="September";
		String year="2024";
		while(true)
		{
		String monthtitle=driver.findElement(By.className("ui-datepicker-month")).getText();
		String year1=driver.findElement(By.className("ui-datepicker-year")).getText();
		
		if(month.equals(monthtitle)&& year.equals(year1))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
		
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ui-state-default' and text()='1']")).click();
		
		
		
	}

}
