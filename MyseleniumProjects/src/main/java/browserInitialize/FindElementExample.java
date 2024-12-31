package browserInitialize;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementExample extends BaseSelenium {

	public static void main(String[] args) {
		
		FindElementExample fg = new FindElementExample();
		
                 fg.browserInitialization();
                 fg.simpleInput();
	}
	
	public void simpleInput()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		List<WebElement> textfield = driver.findElements(By.xpath("//input[@type=\"text\"]"));
	 for(WebElement element:textfield)
	 {
		 element.sendKeys("Hello"); //pass the same value in each text field.
		 
	
	 }
	
	}

}
