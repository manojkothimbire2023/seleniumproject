package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://trytestingthis.netlify.app/");
		Thread.sleep(4000);
		
		WebElement firstname=driver.findElement(By.xpath("//input[@id='fname']"));
		firstname.sendKeys("manoj");
		Thread.sleep(2000);
		WebElement lastname=driver.findElement(By.xpath("//input[@id='lname']"));
		lastname.sendKeys("kumar");


	}

}
