package browserInitialize;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.AWTException;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {
	
	public WebDriver driver;
	
	public void browserInitialization()
	{
		//method using sendkeys()
		
		
		driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		System.out.println("output of  first url is :"+driver.getTitle());
	WebElement choosefile = driver.findElement(By.xpath("//input[@id='file-upload']"));
	//file.click();
	choosefile.sendKeys("C:\\Users\\chandrashekhar\\Downloads\\ISTQB.pdf");
	WebElement upload= driver.findElement(By.xpath("//input[@id='file-submit']"));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //Explicit wait added
	wait.until(ExpectedConditions.elementToBeClickable(upload));
	upload.click();
	
	}
	
	public void robotClass() throws AWTException
	{
		driver = new ChromeDriver();
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement choosefile = driver.findElement(By.xpath("//a[@id='pickfiles']"));
	    choosefile.click();
	    
	      StringSelection choose = new StringSelection("C:\\Users\\chandrashekhar\\Downloads\\ISTQB.pdf");

       //to copy path we are using tool kit
	      
       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(choose,null);
	Robot robot = new Robot();
	robot.delay(2500);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	} 
	public static void main(String[] args) throws AWTException {
	
		FileUpload fu = new FileUpload();
		
		//fu.browserInitialization();
		
		fu.robotClass();

	}

}
