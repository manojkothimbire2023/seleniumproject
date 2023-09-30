package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlelogo {

	public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 Thread.sleep(2000);
 
 driver.manage().window().maximize();
 driver.get("https://www.google.com/");
 Thread.sleep(2000);
 
 
 WebElement googlelogo =driver.findElement(By.xpath("//img[@class='lnXdpd']"));
 if(googlelogo.isDisplayed())

 {
	 System.out.println( "Test is pass");
 }
 else
 {
	 System.out.println("Test is fail");
 }
 
 
 }

}
