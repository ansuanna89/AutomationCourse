package seleniumBasics;

public class BrowserCommands extends Base{

	public void verifyBrowserCommands() {
		
		String title = driver.getTitle();	
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String handleID = driver.getWindowHandle();
		System.out.println(handleID);
		
		//To print the source code of the page - getPageSource
		String source = driver.getPageSource();
		System.out.println(source);
		
	}
	
	public void verifyNavigation() {
		
		// to()- navigate from one page to another page in the same application
		//navigate from one application to another application , eg: flipkart to amazon		
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();	//navigate back to first URL
		driver.navigate().forward();	//navigate forward , so we can use this only after the usage of navigate().to()
		driver.navigate().refresh();
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserCommands browser = new BrowserCommands();
		browser.initializeBrowser();
		//browser.verifyBrowserCommands();
		browser.verifyNavigation();
		
	}

}
