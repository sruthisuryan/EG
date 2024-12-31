package browserInitialize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends BaseSelenium {
	
	
	public void dragDrop()
	{
		
		
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		
		WebElement drag= driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
	Actions actions = new Actions(driver);
	actions.moveToElement(drag).click();
	actions.doubleClick(drag).perform();
	actions.contextClick(drag).perform(); //right click to perform action
	WebElement drop = driver.findElement(By.xpath("//div[@id='mydropzone']"));
	actions.dragAndDrop(drag, drop).build().perform();
	
	}

	public static void main(String[] args) {
		
		
		DragAndDrop dp = new DragAndDrop();
		dp.browserInitialization();
		dp.dragDrop();

	}

}
