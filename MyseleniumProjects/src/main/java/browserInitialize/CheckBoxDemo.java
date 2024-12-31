package browserInitialize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxDemo  extends BaseSelenium{
	
	public void checkbox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement input = driver.findElement(By.id("gridCheck"));
         input.click();
         System.out.println(" whether Element selected or not :" +input.isSelected());

	}
	
	public void radioButton()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
	 
		WebElement input = driver.findElement(By.xpath("(//input[@value='Female'])[1]"));
		
		input.click();
		
		WebElement msg = driver.findElement(By.xpath("//button[text() = 'Show Selected Value']"));
		msg.click();
		System.out.println("Button is displayed :" +msg.isDisplayed());
		
	}
	
	

	public static void main(String[] args) {
		
		CheckBoxDemo cb = new CheckBoxDemo();
		cb.browserInitialization();
		//cb.checkbox();
		cb.radioButton();
	}

}
