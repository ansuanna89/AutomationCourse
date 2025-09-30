package seleniumBasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementCommands extends Base{
	
	public void verifyWebElementCommands() {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement messageBox = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messageBox.sendKeys("Hello Eve");
		WebElement showMessageBtn = driver.findElement(By.id("button-one"));
		System.out.println(showMessageBtn.isDisplayed());
		System.out.println(showMessageBtn.isEnabled());
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(showMessageBtn));
		
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(showMessageBtn));
		
		showMessageBtn.click();
		WebElement yourMsgTxt = driver.findElement(By.id("message-one"));
		System.out.println(yourMsgTxt.getText());
		System.out.println(showMessageBtn.getTagName());
		System.out.println(showMessageBtn.getCssValue("color"));
		messageBox.clear();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebElementCommands commands = new WebElementCommands();
		commands.initializeBrowser();
		commands.verifyWebElementCommands();

	}

}
