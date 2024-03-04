package testLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pageLayer.RegisterPage;
import pageLayer.STQA_HomePage;

public class RegisterTestCase {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver ();
		driver.get("https://stqatools.com/demo/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		STQA_HomePage stqa_obj = new STQA_HomePage (driver);
		RegisterPage registerpage_obj = new RegisterPage (driver);
		//Select s = new Select ();
		
		stqa_obj.clickOnRegisterLink();
		Thread.sleep(2000);
		registerpage_obj.enterNameTextbox("Harry");
		registerpage_obj.enterAddressTextbox("Mumbai");
		registerpage_obj.clickOnGenderMale();
		registerpage_obj.clickOnHobbyTraveling();
		
		registerpage_obj.ClickOnCountryDropDown();
		registerpage_obj.ClickOnCityDropDown();
		registerpage_obj.enterDOBDropDown("20-08-2010");
		registerpage_obj.clickOnSubmitButton();
		
	}
}
