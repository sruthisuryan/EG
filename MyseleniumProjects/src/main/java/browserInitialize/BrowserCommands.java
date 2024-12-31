package browserInitialize;

public class BrowserCommands extends BaseSelenium {
	
	public void browserCommands()
	{
		String title = driver.getTitle(); // //Get browser title
		System.out.println("Print title :" +title); 
		String url = driver.getCurrentUrl();
		System.out.println("URL" +url);
		String pagesource = driver.getPageSource();
		System.out.println("Page source" +pagesource);
	}

	public static void main(String[] args) {
		
		BrowserCommands bc = new BrowserCommands();
		bc.browserInitialization();
		bc.browserCommands();
		bc.quitClose();
	

	}

}
