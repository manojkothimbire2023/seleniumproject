package seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class currentTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(2000);
		 
		 //current title
		 
		String currenttitle= driver.getTitle();
		System.out.println(currenttitle);
		
		//currentUTL
		String url=driver.getCurrentUrl();
		System.out.println(url);
	
	}

}
