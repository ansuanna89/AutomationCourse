package testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationCore.TestNGBase;
import pages.LoginPage;
import utilities.ExcelUtility;


public class LoginTest extends TestNGBase{
	
	//Script desiging--Designing technique-- POM with Page Factory
	//Each webapage has 2 class, One Test Class (Login Test) and 1 pageclass (Login Page)
	//Test class- method calling and value inputting - created on src/test/java
	//Page class- WebElement Finding and actions performed on webElement(click, sendkeys) - created on src/main/java
	
	//username -- admin 
	//pwd---admin
	//Maven project-->GrocceryApplication
	// 
	
	
	@Test
	public void verifyLoginWithValidCredentials() throws IOException {
		String userNameValue = ExcelUtility.getStringData(0, 0, "LoginPage");	
		String passwordValue = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameOnUserNameField(userNameValue);
		loginPage.enterPasswordOnPassworField(passwordValue);
		loginPage.clickLoginButton();
		
	}

	@Test
	public void verifyLoginWithInvalidCredentials() throws IOException {
		
		String userNameValue = ExcelUtility.getStringData(1, 0, "LoginPage");	
		String passwordValue = ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameOnUserNameField(userNameValue);
		loginPage.enterPasswordOnPassworField(passwordValue);
		loginPage.clickLoginButton();
		
	}
	
	@Test
	public void verifyLogin_ValidUserName_InvalidPassword() throws IOException {
		
		String userNameValue = ExcelUtility.getStringData(2, 0, "LoginPage");	
		String passwordValue = ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameOnUserNameField(userNameValue);
		loginPage.enterPasswordOnPassworField(passwordValue);
		loginPage.clickLoginButton();
		
	}
	
	@Test
	public void verifyLogin_InvalidUserName_ValidPassword() throws IOException {
		
		String userNameValue = ExcelUtility.getStringData(3, 0, "LoginPage");	
		String passwordValue = ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameOnUserNameField(userNameValue);
		loginPage.enterPasswordOnPassworField(passwordValue);
		loginPage.clickLoginButton();
		
	}
	
	

}
