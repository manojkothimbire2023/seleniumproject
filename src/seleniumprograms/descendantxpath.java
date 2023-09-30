package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class descendantxpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//this script used to maximize window
		
		driver.get("https://trytestingthis.netlify.app/");
		Thread.sleep(2000);
		
		WebElement descendant=driver.findElement(By.xpath("//form[@oninput='x.value=parseInt(a.value)']//descendant::input[@id='fname']"));
		descendant.sendKeys("manoj");
		
	}

}
