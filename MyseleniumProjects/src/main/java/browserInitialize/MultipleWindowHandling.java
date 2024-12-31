package browserInitialize;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
	public WebDriver driver;
	
	public void windowHandling()
	{
		driver = new ChromeDriver();	
		driver.navigate().to("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		
	WebElement contactus = driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
	contactus.click();
	
	WebElement login = driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
	login.click();
	
	String parent = driver.getWindowHandle(); //to handle parent window
	System.out.println("Print parent:" +parent);
	
	Set<String>  allwindow = driver.getWindowHandles();  //to print all window 
String title = "";
	for(String window:allwindow)
	{
		if(!window.equals(parent))//print without parent link
				{
			
		System.out.println("Print all window" +allwindow);
		driver.switchTo().window(window);
		 //	System.out.println(driver.getTitle());
		title = driver.getTitle();
		
				}
		
		//perform if the above selected title is matched.
		if(title.equals("WebDriver | Contact Us"))
		{
			WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
			
			firstname.sendKeys("Sruthi");
		}
		
		
		if(title.equals("WebDriver | Login Portal"))
		{
WebElement firstname = driver.findElement(By.xpath("//input[@id='text']"));
			
			firstname.sendKeys("Sruthi");
		}
	}
	
	}
	


	public static void main(String[] args) {
		MultipleWindowHandling mh = new MultipleWindowHandling();
		mh.windowHandling();

	}

}
