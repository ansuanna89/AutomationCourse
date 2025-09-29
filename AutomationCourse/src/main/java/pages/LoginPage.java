package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;	//Class -It simplify and optimize the way web elements are defined and initialized within page objects ,
												//Reduce code duplication

public class LoginPage{
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);// used to find the Elements and initialize elements and linking them to the WebDriver instance.
		
	}
	
	@FindBy(id="user-name")WebElement userName; //Annotation used to find elements 
	@FindBy(id="password")WebElement password;
	@FindBy(id="login-button")WebElement loginBtn;
	
	
	
	
	public void enterUserNameOnUserNameField(String userNameValue) {
		userName.sendKeys(userNameValue);				
	}
	
	public void enterPasswordOnPassworField(String passwordValue) {
		password.sendKeys(passwordValue);
	}
	public void clickLoginButton() {
		loginBtn.click();
	}
	
}
