package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childxpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//this script used to maximize window
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		Thread.sleep(4000);
		WebElement name=driver.findElement(By.xpath("//div[@class='form-group']//child::input[@id='name']"));
		name.sendKeys("manoj");
		
	}

}
