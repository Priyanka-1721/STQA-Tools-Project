package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class STQA_HomePage {
	public STQA_HomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//===========object repository =================
	@FindBy (xpath = "//a[contains(text(),'Login')]")
	private WebElement login_link;
	@FindBy (xpath = "//a[contains(text(),'Register')]")
	private WebElement register_link;
	
	
	
	//=========== Action methods===================
	public void clickOnLoginLink ()
	{
		login_link.click();
	}
	public void clickOnRegisterLink ()
	{
		register_link.click();
	}

}
