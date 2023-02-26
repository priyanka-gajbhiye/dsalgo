package Page_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigfileReader;

public class Stack {
	
	public static WebDriver driver=BrowserManager.getdriver();
	String homeurl = ConfigfileReader.getHomePage();
	
	@FindBy (xpath  = "//a[@href='stack']") WebElement getstartedstack ;
	@FindBy (xpath = "//a[text()='Operations in Stack']") WebElement operationstack;
	@FindBy (xpath = "//a[text()='Try here>>>']")static WebElement tryhere;
	@FindBy (xpath = "//form[@id='answer_form']/div/div/div/textarea") WebElement printstack ;
	@FindBy (xpath = "//button[text()='Run']") WebElement run;
	
	
	
	public void stack() {
		PageFactory.initElements(driver, this);
	}
	public void stackhomeurl() {
		driver.get(homeurl);
	}
	public void getstartedstack() {
		getstartedstack.click();
	}
	public void operationstack() {
		operationstack.click();
	}
   public void tryhere() {
	   tryhere.click();
   }
   public void stackprint() {
	   printstack.sendKeys("print'Hello world'");
   }
   public void run() {
	   run.click();
   }
}
