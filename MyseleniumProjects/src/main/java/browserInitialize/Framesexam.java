package browserInitialize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Framesexam extends BaseSelenium{
	
	public void frames()
	{
	driver.navigate().to("https://demo.guru99.com/test/guru99home/");
	WebElement iframe = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
	driver.switchTo().frame(iframe);
	WebElement frames = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
	frames.click();
	}

	public static void main(String[] args) {
		
		
		Framesexam ex = new Framesexam();
		ex.browserInitialization();
		ex.frames();
		
	}

}
