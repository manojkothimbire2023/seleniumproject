package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class webtablehandling {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		 driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		//this script used to maximize window
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);
		
		//find out the row in the table
	int row=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
	System.out.println(row);
	
	//find out the column in the table
	int column=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();
	System.out.println(column);
	
	
	//fetch the perticular web element from the table or not
	
String value=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[3]")).getText();
System.out.println(value);
	
	
	//fetch the all element from the table
for(int i=2;i<=row;i++)
{
	for(int j=1;j<=column;j++)
	{
		String data=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText();
		System.out.println(data);
			
	}
}
	
	
	}

}
