package browserInitialize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultiplecheckBox extends BaseSelenium {
	
	
	public void checkbox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		
		WebElement singleelement = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		singleelement.click();
		
		WebElement multiple = driver.findElement(By.xpath("//input[@id='button-two']"));
		multiple.click();
		
		//WebElement element = driver.findElement(By.id("check-box-one"));
		//element.click();
		
	}

	public static void main(String[] args) {
		
		
		MultiplecheckBox cb = new MultiplecheckBox();
		
		cb.browserInitialization();
		cb.checkbox();

	}

}
