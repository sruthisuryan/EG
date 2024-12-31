package browserInitialize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputClass extends BaseSelenium
{

	
	public void inputClick()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement inputmessage = driver.findElement(By.id("single-input-field"));
		inputmessage.sendKeys("Hello Java");
		WebElement showmsg = driver.findElement(By.id("button-one"));
		showmsg.click();
	}
	public static void main(String[] args) {
	
		InputClass ic = new InputClass();
		
		ic.browserInitialization();
		ic.inputClick();
	}

}
