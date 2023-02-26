package Page_FactoryTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page_FactoryTestNG.BrowserManagerTestNG;

public class LoginTestNG {
	
	public static WebDriver driver = BrowserManagerTestNG.getdriver();
	
	@FindBy (xpath  = "//a/button") WebElement getstarted ;
	@FindBy (xpath = "//a[text()='Sign in']") WebElement signin;
	@FindBy (xpath = "//input[@id='id_username']") WebElement username;
	@FindBy (xpath = "//input[@id='id_password']") WebElement password;
	@FindBy (xpath = "//input[@value='Login']") WebElement loginbtn;
	
	
	@Test(priority=1)
	public void login_ID() {
		WebDriver driver = BrowserManagerTestNG.initializeDrivers("chrome");
		PageFactory.initElements(driver, this);
		String url = BrowserManagerTestNG.url();
		driver.get(url);
		
		getstarted.click();
		signin.click();
		username.sendKeys("dsalgoproject1");
		password.sendKeys("DS@algo123");
		loginbtn.click();
		
		
		
	}

}
