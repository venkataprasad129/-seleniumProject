package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	//declaration
	@FindBy(name ="user_name")
	private WebElement usernameTF ;
	
	@FindBy(name ="user_password")
	private WebElement passwordTF ;
	
	@FindBy(id ="submitButton")
	private WebElement loginButton ;
	

public LoginPage (WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void loginToApp(String username,String password)
{
	usernameTF.sendKeys(username);
	passwordTF.sendKeys(password);
	loginButton.submit();
}

}
