package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//=========object repository=============
	@FindBy(xpath="//input[@id='username']")
	private WebElement username_textbox;
	@FindBy(xpath="//input[@id='password']")
	private WebElement password_textbox;
	@FindBy(xpath="//button[text()='Login']")
	private WebElement login_button;
	@FindBy(xpath="//button[text()='Go to Home Page']")
	private WebElement goto_homepage_button;
	
	
	//============action method================

	public void clickOnUsernameTextbox (String username)
	{
		username_textbox.sendKeys(username);
	}
	public void clickOnPasswordTextbox (String password)
	{
		password_textbox.sendKeys(password);
	}
	public void clickOnLoginbutton ()
	{
		login_button.click();
	}
	public void clickOnGoToHomePageButton()
	{
		goto_homepage_button.click();
	}

}
