package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	public RegisterPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//========== object repository==========
	@FindBy (xpath = "//input[@id='name']")
	private WebElement name_textbox;
	@FindBy (xpath = "//input[@id='address']")
	private WebElement address_textbox;
	@FindBy (xpath = "//input[@id='male']")
	private WebElement gender_radio;
	@FindBy (xpath = "//input[@id='traveling']")
	private WebElement hobby_checkbox;
	
	//dropdown
	@FindBy (xpath = "//select[@id='country']")
	private WebElement country_dropdown;
	
	@FindBy (xpath = "//select[@id='city']")
	private WebElement city_dropdown;
	
	@FindBy (xpath = "//input[@id='dob']")
	private WebElement dob_dropdown;
	
	@FindBy (xpath = "//button[text()='Submit']")
	private WebElement submit_button;
	
	//========== action method ==================
	public void enterNameTextbox (String name)
	{
		name_textbox.sendKeys(name);
	}
	public void enterAddressTextbox (String address)
	{
		address_textbox.sendKeys(address);
	}
	public void clickOnGenderMale ()
	{
		gender_radio.click();
	}
	public void clickOnHobbyTraveling ()
	{
		hobby_checkbox.click();
	}
	public void ClickOnCountryDropDown ()
	{
		country_dropdown.click();
		Select s = new Select (country_dropdown);
		s.selectByVisibleText("India");
	}
	public void ClickOnCityDropDown ()
	{
		city_dropdown.click();
		Select s = new Select (city_dropdown);
		s.selectByVisibleText("Delhi");
	}
	public void enterDOBDropDown (String dob)
	{
		dob_dropdown.sendKeys(dob);
	}
	public void clickOnSubmitButton ()
	{
		submit_button.click();
	}
}
