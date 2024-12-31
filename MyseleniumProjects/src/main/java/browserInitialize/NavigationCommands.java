package browserInitialize;

public class NavigationCommands extends BaseSelenium {
	
	
	public void navigationCommands()

	{
		driver.navigate().to("https://www.amazon.in");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println("out put is "+driver.getTitle());
		System.out.println("current URL is :" +driver.getCurrentUrl());
		driver.close(); //closing the browser originaly open window(closes the current window
		driver.quit(); //closing every associated window
	}

	public static void main(String[] args) {
		NavigationCommands nc = new NavigationCommands();
		nc.browserInitialization();
		nc.navigationCommands();
		

	}

}
