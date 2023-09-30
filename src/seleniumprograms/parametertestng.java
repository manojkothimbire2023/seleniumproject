package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametertestng {
	WebDriver driver;
	@BeforeTest
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//this script used to maximize window
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
	}
	@Test(priority = 1)
	@Parameters({"username","password"})
	public void login(String username,String password) throws InterruptedException
	{
		WebElement  userEle=driver.findElement(By.name("username"));
		userEle.sendKeys(username);
		Thread.sleep(2000);
		WebElement passEle=driver.findElement(By.name("password"));
		passEle.sendKeys(password);
	}
	@AfterTest
	public void logout()
	{
	driver.quit();
	}

}
