package browserInitialize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends BaseSelenium{
	
	public void alertHandlingAccept()
	{
		
		driver.navigate().to("");

	WebElement clickme = driver.findElement(By.xpath("(//button[text()='Click me!'])[1]"));
	clickme.click();
	driver.switchTo().alert().accept(); //handle alertmessage accpet
		
		
	}
	
	public void alertHandlingDismiss() {
		
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickdismiss = driver.findElement(By.xpath("(//button[text()='Click me!'])[2]"));
		clickdismiss.click();
      driver.switchTo().alert().dismiss();  //alert message to click dismiss
	}
	//public void promptBoxClick()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");https://selenium.qabible.in/javascript-alert.php
	
	//prompt.click();
	driver.switchTo().alert().sendKeys("Sruthi"); //pass value in the alert message  //WebElement prompt =driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
	driver.switchTo().alert().accept();
	}
	//
	

	public static void main(String[] args) {
		
		AlertHandling ah = new AlertHandling();
		ah.browserInitialization();
		ah.alertHandlingAccept();
		ah.alertHandlingDismiss();
		//ah.promptBoxClick();

	}
	
	

}
