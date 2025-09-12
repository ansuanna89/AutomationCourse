package seleniumBasics;

import org.openqa.selenium.By;

public class Locator extends Base{

	public void verifyLocator() {

			driver.findElement(By.id("button-one"));		//ID
			driver.findElement(By.className("btn btn-primary"));	//Class Name
			driver.findElement(By.tagName("button"));	//TagName
			driver.findElement(By.name("viewport"));	//Name
			driver.findElement(By.linkText("Simple Form Demo"));//Link Text
			driver.findElement(By.partialLinkText("Simple Form"));//Partial Link Text
			// cssSelctor ---> tagname[attribute='attribute value']
			driver.findElement(By.cssSelector("button[id='button-one']"));
			//xpath
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
