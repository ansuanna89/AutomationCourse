package seleniumBasics;

public class BrowserCommands extends Base{

	public void verifyBrowserCommands() {
		
		String title = driver.getTitle();	
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String handleID = driver.getWindowHandle();
		System.out.println(handleID);		
		String source = driver.getPageSource();	//To print the source code of the page - getPageSource
		System.out.println(source);
		
	}
	
	public void verifyNavigation() {
		
		driver.navigate().to("https://www.flipkart.com/");		// to()- navigate from one page to another page in the same application
																//navigate from one application to another application , eg: flipkart to amazon		
		driver.navigate().back();	//navigate back to first URL
		driver.navigate().forward();	//navigate forward				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands browser = new BrowserCommands();
		browser.initializeBrowser();
		browser.verifyBrowserCommands();
		browser.verifyNavigation();
		
	}

}
