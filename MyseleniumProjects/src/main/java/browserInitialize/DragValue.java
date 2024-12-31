package browserInitialize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragValue extends BaseSelenium{
	
	
	public void dragValue()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag = driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		Actions action = new Actions(driver);
		action.moveToElement(drag).click();
		action.doubleClick(drag).perform();
		
		action.contextClick(drag).perform();
		
		WebElement drop = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		action.dragAndDrop(drag, drop).build().perform();
		

	}

	public static void main(String[] args) {
		
		DragValue dv = new DragValue();
		dv.browserInitialization();
		dv.dragValue();
		

	}

}
