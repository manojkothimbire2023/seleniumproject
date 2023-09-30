package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class precedingsiblingxpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//this script used to maximize window
		
		driver.get("https://trytestingthis.netlify.app/");
		Thread.sleep(2000);
		
		
		WebElement preceding_sibling=driver.findElement(By.xpath("//input[@id='lname']//preceding-sibling::input"));
		preceding_sibling.sendKeys("manoj");
		
		Thread.sleep(2000);
		
		WebElement following_sibling=driver.findElement(By.xpath("//input[@id='fname']//following-sibling::input[@id='lname']"));
		following_sibling.sendKeys("kumar");
		
	}

}
