package browserInitialize;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SingleInput extends BaseSelenium{
	
	public void singleValue()
	{
		
		String input ="Edinburgh";
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> inputvalue = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
		for(WebElement tableInput:inputvalue)
		{
			if(tableInput.getText().equals(input))
			{
				System.out.println("Table input is : " +tableInput.getText());
			}
		}
		
	}
	public void tableInteger()
	{
		String val = "2012/03/29";
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> inputvalue = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[5]"));
		for(WebElement tablevalue : inputvalue)
		{
			if(tablevalue.getText().equals(val))
			{
				System.out.println("Salary input value for this column is" +tablevalue.getText());
			}
			else
			{
				System.out.println("not found the element");
			}
		}
		
	}

	public static void main(String[] args) {
		SingleInput sv = new SingleInput();
		sv.browserInitialization();
		sv.singleValue();
		System.out.println("************************************************************************");
		sv.tableInteger();

	}

}
