package browserInitialize;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {
	
	public WebDriver driver;
	
	public void browserInitialization()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		System.out.println("output of  first url is :"+driver.getTitle());
	}
	
	public static void main(String[] args) {
		
		FramesExample b = new FramesExample();
	
		 b.browserInitialization();
		 
	
	}

	
}
