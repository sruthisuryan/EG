package browserInitialize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends BaseSelenium {
	public void linkText()
	{
		
	}
	public void idLocator()
	{
		
		WebElement inputform = driver.findElement(By.id("single-input-field"));
		System.out.println("input form" +inputform);
		
	}
	public void nameLocator()
	{
		WebElement nameloc = driver.findElement(By.name("form-control"));
	}
	
	public void linkTextLocator()
	{
		WebElement link = driver.findElement(By.linkText("simple-form-demo.php"));
	}
	
	public void partialLinkText()
	{
		WebElement partialLink = driver.findElement(By.partialLinkText("simple-form"));
	}
	
	public void cssLocator()
	{
		WebElement css = driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement tagclass = driver.findElement(By.cssSelector("span.navbar-toggler-icon"));
		WebElement tagattribute = driver.findElement(By.cssSelector("tag[id=single-input-field]"));
		WebElement tagclassattribute = driver.findElement(By.cssSelector("tag.form-control[id=value-a]"));
	}
	
	public void absoluteXpath() 
	{
		
		WebElement messagefield = driver.findElement(By.xpath(" /html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input ")); 
	}
	public void relativeXpath() 
	{
		WebElement relXpath = driver.findElement(By.xpath("//input[@id='single-input-field']")); 
		WebElement relativeXpath = driver.findElement(By.xpath("//input[@id='value-a']")); //Dynamic Xpath Contains 
		WebElement dynamicXpath = driver.findElement(By.xpath("//input[contains(@id,'single-input')]")); //By Text 
		WebElement textXpath = driver.findElement(By.xpath("//button[text()='Show Message']")); 

	}
	public void accessMethod() 
	{
		 WebElement accesschild = driver.findElement(By.xpath("//a[@href='index.php']//child::img[@alt='logo']")); 
		 WebElement accessparent = driver.findElement(By.xpath("//a[@href='index.php']//child::img[@alt='logo']/parent::a"));
		 
	}
	public static void main(String[] args) {
		
		Locators lc = new Locators();
		lc.browserInitialization();
		lc.idLocator();

	}

}
