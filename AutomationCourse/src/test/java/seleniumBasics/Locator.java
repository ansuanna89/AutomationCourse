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
			
			/*Absolute XPath
			/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button
			
			 Relative XPath
			 
			 //button[@id='button-one']
			 //button[text()='Show Message']
			 //button[starts-with(text(),'Show ')]
			 //button[@type='button' and @id='button-one']
			 //button[@id='button-one' or @id='button-one-electronics']
			 //div[contains (text(), 'Single Input Field')]//parent::div[@class='card']	- immediately above tag
			 //div[@class='card']//child::button[@id='button-one']- immediately below
			 //button[@id='button-one']//following::div[@class='card'] --> consider all the following elements containing the attribute class = card
			 //button[@id='button-one']//preceding:: div[@class='card'] -->consider all the elements above button-one
			 
			 ancestor---considering one parent, above another parent , above another parent, ie parent, grand parent, grate grand parent
			//button[@id='button-one']//ancestor::div
			//div[@class='card']//descendant::div --->Child div, grand child div, great grand child div 
			 
			 */
			
			driver.findElement(By.xpath("//button[@id='button-one']"));
			driver.findElement(By.xpath("//button[text()='Show Message']"));
			driver.findElement(By.xpath("//button[starts-with(text(),'Show ')]"));
			
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
