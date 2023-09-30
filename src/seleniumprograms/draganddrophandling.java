package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrophandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//this script used to maximize window
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		
		WebElement banksource=driver.findElement(By.xpath("//a[@class='button button-orange' and text()=' BANK ']"));
		WebElement bankdestination=driver.findElement(By.xpath("//ol[@id='bank']//child::li"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(banksource, bankdestination).perform();
		
	}

}
