package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//this script used to maximize window
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		//verify the checkbox click or not
		
		//WebElement checkbox=driver.findElement(By.id("sunday"));
	//	checkbox.click();
		
		Thread.sleep(2000);
		//list the checkboxes on the current web page
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[ @class='form-check-input'and @type='checkbox']"));
		System.out.println(checkboxes.size());
		
		Thread.sleep(2000);
		
		
		//verify the all checkboxes click or not
		
	/*	for(WebElement ckbox:checkboxes)
		{
			ckbox.click();
		}
	*/	
		//verify the checkbox perticular click or not ex(like sunday and saturday)
		
		
		for(WebElement ckbox:checkboxes)
		{
			String month=ckbox.getAttribute("id");
			if((month.equals("sunday") )|| (month.equals("saturday")))
			{
				ckbox.click();
			}
		}
	
		
		
		
		
		
		
		
		
		
	}

}
