package browserInitialize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Table extends BaseSelenium{
	
	public void fullTable()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		
		WebElement table = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
