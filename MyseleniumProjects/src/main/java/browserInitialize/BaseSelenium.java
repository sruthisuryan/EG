package browserInitialize;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseSelenium {

	public WebDriver driver;
	public void browserInitialization()
	{
		driver = new ChromeDriver();
	//	driver.get("https://www.amazon.in/");
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20)); //apply in all their child class(implicit wait)
		System.out.println("output of  first url is :"+driver.getTitle());
	}
	public void quitClose()
	{
		
		driver.close();
		driver.quit();
	}
	public static void main(String[] args) {
		
		BaseSelenium b = new BaseSelenium();
	
		 b.browserInitialization();
		 b.quitClose();
	
		 
	}
	
	}
