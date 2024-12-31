package browserInitialize;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends BaseSelenium{
	
	
	

	public void fullTable()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		
		WebElement table = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		
		System.out.println("view full table content : " +table.getText());
		System.out.println("--------------------------------------------");
	}
	
	public void rawTable()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement raw = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]"));
		System.out.println("Raw element is :" +raw.getText());
		
	}
	
	public void singleValue() //
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		
		WebElement single = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]/td[2]"));
		
		System.out.println("---------print single value------------");
		System.out.println("Single value is : " +single.getText());
	}
	
	
	
	public void columnData()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> column = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
		for(WebElement data:column)
		{
			System.out.println(data.getText());
		}
		
		
	}
	public void tableData()
	{
		String input ="Tokyo";
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> inputvalue = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
	 for(WebElement table:inputvalue)
	 {
		 if(table.getText().equals(input))
		 {
			 System.out.println("String value "+table.getText());
		 }
	 }
	
	}
	
	
	public static void main(String[] args) {
		
		TableHandling th = new TableHandling();
		th.browserInitialization();
		//th.fullTable();
		//th.rawTable();
		th.singleValue();
		System.out.println("*******************************************************");
		//th.columnData();
     //   th.tableData();
	}

}
