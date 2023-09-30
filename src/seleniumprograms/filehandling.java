package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class filehandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://trytestingthis.netlify.app/");
		Thread.sleep(2000);
		
		WebElement file=driver.findElement(By.xpath("//input[@id='myfile']"));
		file.sendKeys("C:\\Users\\Lenovo\\Desktop\\a.txt");
		
		
		
	}

}
