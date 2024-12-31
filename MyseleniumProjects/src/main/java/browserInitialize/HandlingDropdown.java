package browserInitialize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends BaseSelenium{
	
	
	public void dropDown()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dp = driver.findElement(By.id("single-input-field"));
		
		Select select = new Select(dp); //to access dropdown
		//select.selectByVisibleText("Yellow");
		//select.selectByIndex(3);
		select.selectByValue("Green");
		
		//driver.close();
	}
	
	

	public static void main(String[] args) {
	
		HandlingDropdown drop = new HandlingDropdown();
		drop.browserInitialization();
		drop.dropDown();
		
		

	}

}
