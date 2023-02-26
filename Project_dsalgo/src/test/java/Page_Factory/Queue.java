package Page_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigfileReader;

public class Queue {
	
	public static WebDriver driver=BrowserManager.getdriver();
	String homeurl = ConfigfileReader.getHomePage();
	
	@FindBy (xpath  = "//a[@href='queue']") WebElement getstartedqueue ;
	@FindBy (xpath = "//a[text()='Queue Operations']") WebElement operationqueue;
	@FindBy (xpath = "//a[text()='Try here>>>']")static WebElement tryhere;
	@FindBy (xpath = "//form[@id='answer_form']/div/div/div/textarea") WebElement printqueue ;
	@FindBy (xpath = "//button[text()='Run']") WebElement run;
	
	
	
	public void queue() {
		PageFactory.initElements(driver, this);
	}
	public void queuemeurl() {
		driver.get(homeurl);
	}
	public void getstartedqueue() {
		getstartedqueue.click();
	}
	public void queueoperation() {
		operationqueue.click();
	}
	 public void tryhere() {
		   tryhere.click();
	   }
	   public void queueprint() {
		   printqueue.sendKeys("print'Hello world'");
	   }
	   public void run() {
		   run.click();
	   }

}
