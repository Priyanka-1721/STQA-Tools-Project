package testLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageLayer.LoginPage;
import pageLayer.STQA_HomePage;

public class LoginTestCase {
	public static void main (String args []) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver ();
		driver.get("https://stqatools.com/demo/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		STQA_HomePage stqa_obj = new STQA_HomePage (driver);
		LoginPage loginpage_obj = new LoginPage (driver);
		
		stqa_obj.clickOnLoginLink();
		
		loginpage_obj.clickOnUsernameTextbox("admin");
		loginpage_obj.clickOnPasswordTextbox("admin");
		Thread.sleep(3000);
		loginpage_obj.clickOnLoginbutton();
		loginpage_obj.clickOnGoToHomePageButton();

}
}
