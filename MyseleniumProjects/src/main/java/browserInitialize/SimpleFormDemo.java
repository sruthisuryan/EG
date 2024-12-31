package browserInitialize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SimpleFormDemo extends BaseSelenium {
	
	public void enterMessage()
	{
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement msgField = driver.findElement(By.id("single-input-field"));
		msgField.sendKeys("Demo message");
		
		WebElement msgbtn = driver.findElement(By.xpath("//button[text() = 'Show Message']"));
		msgbtn.click();
		System.out.println("Enabled or not :" +msgbtn.isEnabled());
		
		WebElement showmsg = driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println("value in the screen is :" +showmsg.getText());
		
	}
	
	
	public void twoInputFields()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement valueA = driver.findElement(By.id("value-a")); ///input[@id="value-a"]
		valueA.sendKeys("2");
		
		
		WebElement valueB = driver.findElement(By.id("value-b"));
		valueB.sendKeys("5");
		
		
		WebElement button = driver.findElement(By.xpath("//button[@id=\"button-two\"]"));
		button.click();
		System.out.println("value B passing is :" +button.isEnabled());
		
		WebElement msg = driver.findElement(By.xpath("//div[@id='message-two']"));
		System.out.println("Value in the result is :" +msg.getText());
		driver.quit();
	}

	public static void main(String[] args) {
	
		SimpleFormDemo check =  new SimpleFormDemo();
		
		check.browserInitialization();
		check.enterMessage();
		check.twoInputFields();

	}

}
