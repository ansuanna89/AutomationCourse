package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationCore.TestNGBase;


public class LoginTest extends TestNGBase{
	
	@Test
	public void verifyLoginWithValidCredentials() {
		
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		loginBtn.click();
		
	}

	@Test
	public void verifyLoginWithInvalidCredentials() {
		
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("Invalid_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("InvalidPassword");
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		loginBtn.click();
		
	}
	
	@Test
	public void verifyLogin_ValidUserName_InvalidPassword() {
		
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("InvalidPassword");
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		loginBtn.click();
		
	}
	
	@Test
	public void verifyLogin_InvalidUserName_ValidPassword() {
		
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("Invalid_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		loginBtn.click();
		
	}
	
	

}
