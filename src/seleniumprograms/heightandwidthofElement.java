package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class heightandwidthofElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 Thread.sleep(2000);
		 
		 WebElement searchtextbox=driver.findElement(By.xpath("//textarea[@name='q']"));
		 
		 Dimension d=searchtextbox.getSize();
		 System.out.println(d.getHeight());
		 System.out.println(d.getWidth());
		
	}

}
