package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframehandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//this script used to maximize window
		
		driver.get("https://www.rediff.com/");
		Thread.sleep(2000);
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='moneyiframe']"));
		
		driver.switchTo().frame(iframe);
		Thread.sleep(2000);
		
		String bse=driver.findElement(By.xpath("//span[@id='bseindex']")).getText();
		System.out.println(bse);
		
	}

}
