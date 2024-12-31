package browserInitialize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class JquerySelect extends BaseSelenium
{
	public void jquerySelect()
	{
		
		driver.navigate().to("https://selenium.qabible.in/jquery-select.php");
		
		WebElement element = driver.findElement(By.xpath("//select[@class='js-states form-control select2-hidden-accessible']"));
		Select select = new Select(element);
		select.selectByValue("HI");
		WebElement multiple = driver.findElement(By.xpath("//select[@class='js-states-multiple form-control select2-hidden-accessible']"));
		
		Select sel = new Select(multiple);
		sel.selectByVisibleText("California");
		
		WebElement category  = driver.findElement(By.cssSelector("select.js-states"));
		Select cat = new Select(category);
		cat.selectByVisibleText("Hawaii");
		
		
		
	}
	

	public static void main(String[] args) {
		
		
		JquerySelect js = new JquerySelect();
		js.browserInitialization();
		js.jquerySelect();

	}

}
