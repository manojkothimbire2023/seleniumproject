package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webcalenderhandlign {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//this script used to maximize window
		
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)", "");
		
		
		
			WebElement datepicker=driver.findElement(By.id("dateOfBirthInput"));
			datepicker.click();
			Thread.sleep(2000);
			
			WebElement month=driver.findElement(By.className("react-datepicker__month-select"));
			
			Select s=new Select(month);
			s.selectByVisibleText("September");
			
			Thread.sleep(2000);
			
			WebElement year=driver.findElement(By.className("react-datepicker__year-select"));
			Select s1=new Select(year);
			s1.selectByVisibleText("2024");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--001 react-datepicker__day--weekend' and text()='1']")).click();

	}

}
